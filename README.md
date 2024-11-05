# Desafio Back-End do PicPay com Java e Spring

Este documento detalha o desafio de back-end proposto pelo PicPay, que foi desenvolvido utilizando Java e Spring. O projeto pode ser encontrado no repositório oficial do desafio.

## Repositório do Desafio

O repositório do desafio pode ser acessado através do seguinte link:

[PicPay - Desafio Back-End](https://github.com/PicPay/picpay-desafio-backend)

## Descrição do Desafio

O desafio envolve a construção de uma API RESTful utilizando Java e Spring, que deve implementar funcionalidades específicas de um sistema de pagamentos, similar ao PicPay. A API deve permitir a criação de transações, gerenciamento de usuários e outras operações relevantes.

### Funcionalidades Principais

- **Cadastro de Usuários**: Permitir que novos usuários se cadastrem no sistema.
- **Criação de Transações**: Implementar a lógica para criar transações entre usuários.
- **Consulta de Saldo**: Fornecer a possibilidade de consultar o saldo disponível de um usuário.
- **Histórico de Transações**: Permitir que os usuários consultem seu histórico de transações.

## Vídeo de Referência

Utilizei um vídeo como base para compreender melhor o desafio e como implementá-lo. O vídeo apresenta uma visão geral do projeto e demonstra as principais funcionalidades a serem implementadas. Você pode assistir ao vídeo através do seguinte link:

[Vídeo do Desafio - YouTube](https://www.youtube.com/watch?v=dttXo48oXt4&t=1784s)

## Estrutura do Projeto

A estrutura do projeto segue as melhores práticas do Spring Framework, incluindo a separação de responsabilidades em pacotes como:

- **Controller**: Gerencia as requisições HTTP e interage com os serviços.
- **Service**: Contém a lógica de negócios do sistema.
- **Repository**: Interage com o banco de dados para persistência de dados.
- **Entity**: Define as entidades do sistema.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework utilizado para simplificar o desenvolvimento da API.
- **Hibernate**: ORM para mapeamento objeto-relacional.
- **PostgreSQL**: Banco de dados utilizado para persistência dos dados.
- **Maven**: Gerenciador de dependências e construção do projeto.

## Instruções para Execução

Para executar o projeto, siga as instruções abaixo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/PicPay/picpay-desafio-backend.git
