# clients-api
Desafio BootCamp DEVSUPERIOR - Cap 01 - CRUD

Projeto Spring Boot 2.4.x contendo um CRUD completo de web services REST para acessar um recurso de clientes, contendo as cinco operações básicas:

-> Busca paginada de recursos
-> Busca de recurso por id
-> Inserir novo recurso
-> Atualizar recurso
-> Deletar recurso

O projeto possui um ambiente de testes configurado acessando o banco de dados H2, Maven como gerenciador de dependência, e Java 11 como linguagem.

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da entidade Client é mostrada a seguir:

  Client
- id: Long
- name: String
- cpf: String
- income: Double
- birthDate: Instant
- children: Integer

