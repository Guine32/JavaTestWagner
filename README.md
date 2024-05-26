# SigaBem Frete

## Descrição

Projeto Siga Bem Frete - uma aplicação para cálculo de fretes para gerenciamento de transportes.

## Funcionalidades

- Cálculo de fretes com base na distância e peso
- Consultas e relatórios de fretes realizados

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.0**
- **Spring Data JPA**
- **MySQL**
- **Springdoc OpenAPI 2.2.0**
- **HikariCP**

## Pré-requisitos

- **Java 17**: Certifique-se de ter o JDK 17 instalado.
- **Maven**: Utilize o Maven para gerenciar as dependências e construir o projeto.
- **MySQL**: Banco de dados relacional utilizado para armazenamento de dados.

## Documentação da API

A documentação da API é gerada automaticamente pelo Springdoc OpenAPI. Após iniciar a aplicação, você pode acessar a documentação através da URL:
- http://localhost:8080/swagger-ui.html

## Contato

- Wagner Vinicius Santos
- Email: wagnervsantos@hotmail.com
- LinkedIn: https://www.linkedin.com/in/wagner-vinicius-santos-b62697146/




# Teste de seleção para vaga de Java

## Faça um fork desse projeto e siga as instruções a seguir utilizando esse projeto.

# Pré-requisitos

Implementar apenas a API (Backend)
Versão Java +8 (caso seja Java 8, verificar compatibilidade da sua IDE)
Versão Spring Boot >= 2.4
Banco de dados fica a seu critério (Sql, NoSql)
Seu projeto deve obrigatoriamente ter as anotações: @Repository, @Entity e @Controller
Documentação mínima da API (Swagger ou documento PDF)

# Objetivo
Implementar para empresa de transporte de cargas SigaBem o endpoint para o cálculo do preço do frete:

Você deve calcular o valor total do frete e a data prevista da entrega.

Considerar regras para calcular o valor do frete:
 * CEPs com DDDs iguais tem 50% de desconto no valor do frete e entrega prevista de 1 dia
 * CEPs de estados iguais tem 75% de desconto no valor do frete e entrega prevista de 3 dias
 * CEPs de estados diferentes não deve ser aplicado o desconto no valor do frete e entrega prevista de 10 dias
 * O valor do frete é cobrado pelo peso da encomenda, o valor para cada KG é R$1,00

Seu input de entrada deve ser “peso”, “cepOrigem”, “cepDestino” e “nomeDestinatario“

Você utilizará a API gratuita de consulta de CEP abaixo: 
Documentação da API: https://viacep.com.br/
Exemplo do GET: https://viacep.com.br/ws/<CEP_A_CONSULTAR>/json/

Endpoint pode ser público
Response/Output deve possuir: “vlTotalFrete” e “dataPrevistaEntrega”, “cepOrigem” e “cepDestino”
Deve ser persistido no banco os valores da cotação os valores consultados: “peso”, “cepOrigem”, “cepDestino”, “nomeDestinatario”, “vlTotalFrete”, “dataPrevistaEntrega” e “dataConsulta”



# Critérios de avaliação:
 * Implementação das regras de negócios para o cálculo do frete
 * Boas práticas de programação, arquitetura  e padrões de projetos

# Entrega: 
 * Disponibilizar um link do repositório no GitHub e encaminhar para developer@cd2.com.br
