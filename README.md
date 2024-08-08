# Mock API

Este projeto é uma aplicação Spring Boot que fornece endpoints de API mock para simular e testar diferentes cenários de requisições. É útil para desenvolvimento de clientes HTTP, simulação de respostas de serviços externos, e testes de integração.

## Índice

- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Pré-requisitos](#pré-requisitos)
- [Instalação](#instalação)
- [Executando a Aplicação](#executando-a-aplicação)
    - [Localmente](#localmente)
    - [Usando Docker](#usando-docker)
- [Documentação da API](#documentação-da-api)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

## Visão Geral

O Mock API permite criar e gerenciar endpoints de APIs fictícias, simulando comportamentos de serviços reais. Com ele, você pode configurar respostas para diferentes cenários, facilitando o desenvolvimento e os testes de integração de aplicações que dependem de APIs externas.

## Funcionalidades

- Simulação de respostas HTTP para diferentes métodos (GET, POST, PUT, DELETE).
- Suporte para diferentes códigos de status HTTP.
- Documentação automática da API usando SpringDoc OpenAPI.
- Implementação fácil e rápida via Docker.
- Exemplo de estrutura de arquivos JSON para respostas.

## Pré-requisitos

Certifique-se de ter os seguintes softwares instalados em sua máquina:

- [Java 21](https://openjdk.org/projects/jdk/21/)
- [Maven 3.9.x](https://maven.apache.org/download.cgi)
- [Docker](https://www.docker.com/get-started) (opcional, para execução via container)

## Instalação

### Clonando o Repositório

Clone o repositório para sua máquina local usando:

```bash
git clone https://github.com/Suleiman-Moraes/mock-api.git
cd mock-api
```

### Construindo o Projeto

Você pode compilar o projeto com Maven:

```bash
mvn clean install
```

## Executando a Aplicação

### Localmente

Para rodar a aplicação localmente, execute o seguinte comando:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em [http://localhost:8080](http://localhost:8080).

### Usando Docker

Se você preferir executar a aplicação via Docker, primeiro construa a imagem:

```bash
docker build -t mock-api .
```

Depois, execute o container:

```bash
docker run -p 8080:8080 mock-api
```

## Documentação da API

A documentação da API é gerada automaticamente e pode ser acessada via Swagger UI em:

```
http://localhost:8080/api/swagger-ui.html
```

## Tecnologias Utilizadas

- **Spring Boot 3.3.2**: Framework principal da aplicação.
- **SpringDoc OpenAPI**: Geração automática de documentação da API.
- **Lombok**: Redução de código boilerplate.
- **Docker**: Para containerização da aplicação.
- **Maven**: Gerenciamento de dependências e ciclo de vida do projeto.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests. Siga as etapas abaixo para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/minha-feature`)
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`)
4. Faça um push para a branch (`git push origin feature/minha-feature`)
5. Abra um Pull Request

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## Contato

Suleiman Moraes - [LinkedIn](https://www.linkedin.com/in/suleiman-moraes/) - [GitHub](https://github.com/Suleiman-Moraes)