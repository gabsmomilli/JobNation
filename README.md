
<h1 align="center">JOBNATION</h1>

## Proposta comercial

A aplicação consiste numa  interface de recepção de currículos, com banco de dados,  que permitirá a busca de candidatos por vaga a partir de filtros configuráveis.

Deverão ser destaques a segurança e desempenho da aplicação.

 Nossa proposta de funcionamento para esses recursos serão detalhados logo abaixo:
 
- Busca por localização: funcionará utilizando as coordenadas de latitude e longitude.

- Busca por diferentes critérios: rotas de pesquisa estão sendo desenhadas para propiciar liberdade ao agende de consulta ao BD. Então, a aplicação fará uma varredura nos currículos já cadastrados e identificará os candidatos que mais se adequam aos critérios informados.

## Descrição do projeto integrador

Baseado no modelo de Aprendizado Por Projeto, nossa equipe trabalha para entregar uma solução operante para uma empresa parceira - Jet Soft - com o apoio do Docente desta instituição de ensino superior.

## Requisitos

#### Funcionais

| Requisitos Funcionais                                                  | Código | Prioridade | Sprint |
|------------------------------------------------------------------------|--------|------------|--------|
| Inicializa uma API e se conecta ao/cria BD                | RF01   | 1          | 1      |
| Executa Requisição de Terceiro | RF02   | 1          | 2      |
| Busca candidatos mais pŕoximos de um endereço                                | RF03   | 1          | 2      |
| Busca candidatos a partir de uma vaga                                                 | RF04  | 1          | 3     |
| Filtra resultado da Busca | RF05  | 1          | 3      |
| Importa BD do Cliente                            | RF06   | 1          | 4      |



#### Não funcionais

| Requisitos Não Funcionais                            | Código | 
|------------------------------------------------------|--------|
| Regras de segurança da informação           | RNF01  |
| Integridade (BD relacional)                   | RNF02  |
| Flexibilidade quanto aos critérios                                    | RNF03  |
| Regras de performance   | RNF04  |
| Documentação  | RNF05 |

## User Stories

| Quem? | O que? | Por que? |
|-------|--------|----------|
| API de Terceiros | Fornece critérios de busca | Quer  processo de recrutamento em massa
| Jet Soft | Disponibiliza JOBNATION aos seus clientes (terceiros) | Velocidade |
| Tecno Code | Desenvolve a JOBNATION | Para aplicar na prática os conhecimentos de programação adquiridos, além de adquirir experiência profissional em desenvolvimento de projetos |


## Propostas de inovação

Criamos o 1o BD com benchmarking no LINKEDIN, subsequentemente alterando o protagonismo para a entidade vaga (VACANCY).

Estudamos ainda quais ferramentas servirão aos requisitos não funcionais de Flexibilidade: 

- No código - Rotas fixas em REST para Swagger ou GRAPHiQL;

- No BD - PROCEDURES ou algum tipo de inteligência;


## Backlog do Projeto
Atividades de cada sprint, com prioridade.

#### Sprint 00
- reunião de kickoff  com JETSOFT
- Criação de repositório
- Definição de cargos (SM e PO)
- Definição de nome para a equipe
- Brainstorm para discussão de primeiras ideias
- Apresntação de proposta de aplicação;

#### Sprint 01
- Criação do README.MD com informações sobre o projeto e instruções para execução da aplicação;

- Criação de modelo entidade relacionamento para definir como os dados serão estruturados;

- Início do Desenvolvimento do Core da Aplicação: Controller, Model (Arquitetura REST) e Banco de Dados (Oracle)

- Associação das informações do banco de dados a um diagrama de classes;

- BONUS; FRONT-END - Construção do design da plataforma;

- BONUS: FRONT-END - Desenvolvimento do recurso de busca por proximidade do local da vaga


#### Sprint 02

- Core da Aplicação Funcionando: Controller, Model (Arquitetura REST) e Banco de Dados (Oracle);

- CRUD: 1a Rota de submissão de requisições:  Benefícios oferecidos pela vaga (via POSTMAN);

- Criação ou atualização automática das tabelas (Hibernate- MODEL);

- Segurança no Código: Sigilo de dados sensíveis/prescindíveis (payloads, DTO,Converter);
	
- Validação de Dados: Campos que NÃO  podem estar vazios;

- Testes - Início de implementação de teste unitário de métodos;

- PROCEDURE PL/SQL: Consulta candidatos por distância (LAT,LONG);

#### Sprint 03 - 16 de maio de 2021.

- Criação de Multiplas Rotas x Múltiplos Critérios;

- Novos testes unitários de métodos;

- Novas procedures de devolução de listas por outros critérios;

- População do BD com dados fictícios para teste de performance;

#### Sprint 04 - 05 de junho de 2021.

- Busca por qualquer critério;

- Importação do BD do cliente;

- Adaptação do Código para novas classes e tabelas;

- Adaptação do BD para novas tabelas;

#### Apresentação Final - 11 de junho de 2021.

- Bugs e Documentação;

#### Feira de Soluções - 18 de junho de 2021.


## Como Instalar o projeto na máquina:

- Selecione uma pasta de sua preferência, através do comando "cd Pasta Escolhida"
- Abra o terminal clicando dentro de uma pasta com o botão direito e selecione a opção git bash here
- Utilize a função git clone https://github.com/gabsmomilli/JobNation para instalar os arquivos no seu computador
- Abra o SQL DEVELOPER (com Oracle 11g instalado);
- Execute o SCRIPT:

|-------------------------|
|CREATE TABLESPACE  tecnocode|
|DATAFILE  'C:\BD\tecnocode.dbf' SIZE 1M|
|AUTOEXTEND ON;|
|------------------
|----CRIA USUÁRIO --|
|------------------
|CREATE USER tecnocode|
|IDENTIFIED BY tecnocode|
|DEFAULT TABLESPACE tecnocode|
|TEMPORARY TABLESPACE TEMP|
|QUOTA UNLIMITED ON tecnocode;|
|-----------------
|----PRIVILÉGIOS --|
|-----------------
|GRANT DBA TO tecnocode WITH ADMIN OPTION;|

- Na sua IDE, importe o projeto Tecnocode;
- Abra o arquivo "application.properties" e altere a seguinte linha "spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe";

- Abra o INSOMNIA e escreva uma das rotas criadas nas clases "controller", com os dados ali exigidos e envie a requisição;


## 💻 Tecnologias

As ferramentasutilizadas na construção deste projeto:

- Oracle 11g (Sql developer)
- Java (IntelliJ / Eclipse))
- React (Insomnia/POSTMAN);
- Git;
- OBS Studio / Kdenlive;
- Html
- Css
- Javascript

