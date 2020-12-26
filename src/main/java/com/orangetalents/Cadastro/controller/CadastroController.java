package com.orangetalents.Cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.orangetalents.Cadastro.model.Cadastro;
import com.orangetalents.Cadastro.repository.CadastroRepository;
import com.orangetalents.Cadastro.service.CadastroService;





@RestController
public class CadastroController implements WebMvcConfigurer {
	
	//PARA ACESSAR A PÁGINA PELO LOCAL HOST 8080
	public void addViewControllers(ViewControllerRegistry index) {
		index.addViewController("/").setViewName("forward:/cadastro.html");
	}
	
	
	//injeta o repository e o service
	@Autowired
	private  CadastroRepository repository;
	
	@Autowired
	private  CadastroService service;
	
	
	//post é inserie, neste caso na mesma URL (localhost:8080/manutencoes)
	//RequestBody insere o que esta no corpo
	@PostMapping("/cadastro")
	public Cadastro criar(@RequestBody Cadastro objetoCadastro) {
		repository.save(objetoCadastro);
		return objetoCadastro;
	}
	
	


		
	
}
