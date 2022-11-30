# **Java Spring AWS S3 Plugin**

Plugin Java Spring AWS S3 é um conjunto de técnologias e metodologia de desenvolvimento que juntos auxiliam na utilização do Amazon S3 como Storage de dados em Aplicações Java Spring Boot. 

Este Plugin possui suporte para projetos criados junto a Stack Java Spring Boot REST API. E Dado a isso também suporta projetos Java Spring Boot que utilizem **Maven** como gerenciador de dependencias e tenham suas configurações de properties no padrão **YAML**.


Nas proximas sessões você encontrará em detalhes informações sobre como utilizar Plugin Java Spring AWS S3 para habilitar a capacidade de utilizar Amazon S3 como Storage em seus projetos. 

Abaixo esta de forma sumariazada cada sessão desta documentação.

1. [Técnologias base da Plugin](#tecnologias-base-da-plugin)
2. [Capacidades Habilitadas ao uso da Plugin](#quais-são-as-capacidades-habilitadas)
3. [Beneficio de utilizar a Plugin](#quais-os-beneficios-de-utilizar-java-spring-aws-s3-plugin)
4. [Aplicando Java Spring AWS S3 Plugin](#aplicando-java-spring-aws-s3-plugin)


## **Tecnologias base da Plugin**

Objetivo desta sessão é informar quais são as técnologias que fazem parte do Java Spring AWS S3 Plugin.

Ao aplicar este plugin em um projeto Java Spring Boot, sua aplicação poderá se beneficiar de toda infraestrutura do Amazon S3 para gerenciar objetos em um Storage totalmente distribuido.


### **Composição Técnologica**

A definição deste Plugin foi pensada visando as maiores dores no uso do Amazon S3 como storage de dados em aplicativos Java.

Entendemos que a qualidade é inegociavel, e olhamos para as técnologias e metodologias como meio para obter a tão desejada qualidade no software. Essa premissa foi o guia para escolha de cada técnologia detalhada abaixo.


- Ambiente de produção
    - Spring Cloud AWS Core
    - Spring Clud AWS Auto-configure
    - Amazon SDK S3
- Ambiente de testes
    - JUnit
    - Test Containers
- Ambiente de desenvolvimento
    - Docker Compose
        - LocalStack Container


## **Quais são as capacidades Habilitadas**

Ao aplicar em seu projeto Java Spring Boot, o Java Spring AWS S3 Plugin, seu projeto será capaz:

1. Utilizar um Amazon S3 como storage distribuído 
2. Criar uma suite de testes de integração automatizada junto a TestContainers 
3. Criar Testes Integrados afim de validar se as operações junto S3 tem o comportamento esperado 
4. Desenhar e construir componentens de software que utilizem Amazon S3 sem se conectar com AWS.
5. Ambiente de desenvolvimento configurado junto ao Docker com Docker-compose.



## **Quais os Beneficios de Utilizar Java Spring AWS S3 Plugin**

1. Facilidade na configuração e uso do Amazon S3 em seu projeto através da StackSpot CLI.
2. Codigos de exemplo de como construir um storage no Amazon S3 utilizando um bucket baseado em  boas praticas.
6. Codigos de exemplo de um caso de uso do Storage baseado em  boas praticas.
7. Codigos de exemplo de Testes de integração para validar comportamento do Storage.
8. Codigos de exemplo de Testes de integração para validar comportamento de caso de uso  do Storage.
7. Configuração do ambiente de testes com JUnit e Test Containers.
8. DockerCompose para uso do Amazon S3 com LocalStack em ambiente de desenvolvimento.
9. LOGS habilitados para facilitar troubleshooting

[Assita este video para ver os beneficios de utilizar Java Spring AWS S3 Plugin em seu projeto](https://youtu.be/mIp44nnWVpo)


## **Aplicando Java Spring AWS S3 Plugin**

Para Aplicar o Java Spring AWS S3 Plugin em  seus projetos e desfrutar de seus beneficios é necessário que você tenha a CLI da StackSpot instalada em sua maquina. [Caso você não tenha siga este tutorial para fazer a instalação](https://docs.stackspot.com/docs/stk-cli/installation/).

### 1. Importe a Stack em sua maquina

```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

### 2. Agora verifique se a Stack foi importada com sucesso

```sh
stk list stack | grep java-springboot
```

### 3. Aplique o Plugin, no diretorio do seu projeto, execute

```sh
stk apply plugin java-springboot-restapi-stack/java-spring-aws-s3-plugin
```   

### 4. Verifque as modificações em seu projeto

```sh
git status
```   



## Suporte

Caso precise de ajuda, por favor abra uma [issue no repositorio do Github da Stack](https://github.com/zup-academy/java-spring-aws-s3-plugin/issues).