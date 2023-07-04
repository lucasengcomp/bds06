# Projeto do Bootcamp Devsuperior módulo 5
### Neste projeto foi posto em prática conceitos de busca com JPA, JPQL e consultas nativas.
O projeto em si, é parte integrada para prova de conhecimentos práticos para fins de obtenção de certificado.


## Casos de uso

![modelo conceitual.png](docs%2Fmodelo%20conceitual.png)


## **Avaliação:**

### **Efetuar login**
1. [IN] O usuário anônimo informa seu email e senha
2. [OUT] O sistema informa um token válido 

### Listar filmes
3. [OUT] O sistema apresenta uma listagem dos nomes de todos gêneros, bem como uma listagem paginada com título, subtítulo, ano e imagem dos filmes, ordenada alfabeticamente por título.
4. [IN] O usuário visitante ou membro seleciona, opcionalmente, um gênero.
5. [OUT] O sistema apresenta a listagem atualizada, restringindo somente ao gênero selecionado. 

### Visualizar detalhes do filme
7. [IN] O usuário visitante ou membro seleciona um filme
8. [OUT] O sistema informa título, subtítulo, ano, imagem e sinopse do filme, e também uma listagem dos textos das avaliações daquele filme juntamente com nome do usuário que fez cada avaliação.
9. [IN] O usuário membro informa, opcionalmente, um texto para avaliação do filme.
10. [OUT] O sistema apresenta os dados atualizados, já aparecendo também a avaliação feita pelo usuário.


### **Regra de negócio:**
Exceção - Quando campo text de Review for informado com vazio
O sistema apresenta uma mensagem de que não é permitido texto vazio na avaliação