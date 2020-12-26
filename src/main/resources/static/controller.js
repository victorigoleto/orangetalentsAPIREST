var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

  $scope.cadastro = new Object();

$scope.salvar = function() {
  $http.post("http://localhost:8080/cadastro", {
    'id':$scope.id,
    'nome':$scope.nome,
    'cpf':$scope.cpf,
    'email':$scope.email,
    'nascimento':$scope.nascimento
    
  }).then(resposta => {
  	Swal.fire('Ok !!', 'Cliente cadastrado com sucesso !!', 'success')
  }).catch(erro => {
  	if (erro.data.message.includes('UK_cpf')){
  	Swal.fire('Erro !!', 'CPF já cadastrado em nosso banco de dados', 'error')
  	}
  	
  	else if (erro.data.message.includes('UK_email')){
  	Swal.fire('Erro !!', 'E-mail já cadastrado em nosso banco de dados', 'error')
  	}
  	
  	else {
  	Swal.fire('Erro !!', 'Os campos CPF e E-mail estão errados', 'error')
  	}
  })
  };  

});