package com.orangetalents.Cadastro.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.orangetalents.Cadastro.model.Cadastro;


// Faz a condução dos dados da tabela ao banco, persiste os dados no banco de dados
//Para fazer os gets e posts vc precisa persistir
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
	


}
