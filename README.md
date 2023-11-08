# Calculator API Rest

Esta é uma API de calculadora desenvolvida para fins de estudo. Ela fornece operações simples de soma, subtração, multiplicação e divisão de dois números.

## Informações Gerais

- **Título:** Calculator API Rest
- **Descrição:** API desenvolvida em estudos
- **Versão:** 1

## Servidor de Acesso

A API está hospedada no seguinte servidor:

- **URL:** `http://localhost:8080`
- **Descrição:** Servidor gerado automaticamente

## Endpoints

### Soma
- **Descrição:** Realiza uma soma entre dois números
- **URL:** `/sum/{n1}/{n2`
- **Método HTTP:** GET
- **Parâmetros:**
  - `n1` (path, obrigatório) - Número 1 (tipo: número de ponto flutuante)
  - `n2` (path, obrigatório) - Número 2 (tipo: número de ponto flutuante)
- **Respostas:**
  - Código de status 502:
    - **Descrição:** Retorna uma mensagem de erro genérica
    - **Tipo de conteúdo:** Texto
  - Código de status 201:
    - **Descrição:** Retorna o resultado da soma
    - **Tipo de conteúdo:** Texto

### Subtração
- **Descrição:** Realiza uma subtração entre dois números
- **URL:** `/sub/{n1}/{n2}`
- **Método HTTP:** GET
- **Parâmetros:**
  - `n1` (path, obrigatório) - Número 1 (tipo: número de ponto flutuante)
  - `n2` (path, obrigatório) - Número 2 (tipo: número de ponto flutuante)
- **Respostas:**
  - Código de status 201:
    - **Descrição:** Retorna o resultado da subtração
    - **Tipo de conteúdo:** Texto
  - Código de status 502:
    - **Descrição:** Retorna uma mensagem de erro genérica
    - **Tipo de conteúdo:** Texto

### Multiplicação
- **Descrição:** Realiza uma multiplicação entre dois números
- **URL:** `/mult/{n1}/{n2}`
- **Método HTTP:** GET
- **Parâmetros:**
  - `n1` (path, obrigatório) - Número 1 (tipo: número de ponto flutuante)
  - `n2` (path, obrigatório) - Número 2 (tipo: número de ponto flutuante)
- **Respostas:**
  - Código de status 502:
    - **Descrição:** Retorna uma mensagem de erro genérica
    - **Tipo de conteúdo:** Texto
  - Código de status 201:
    - **Descrição:** Retorna o resultado da multiplicação
    - **Tipo de conteúdo:** Texto

### Divisão
- **Descrição:** Realiza uma divisão entre dois números
- **URL:** `/div/{n1}/{n2}`
- **Método HTTP:** GET
- **Parâmetros:**
  - `n1` (path, obrigatório) - Número 1 (tipo: número de ponto flutuante)
  - `n2` (path, obrigatório) - Número 2 (tipo: número de ponto flutuante)
- **Respostas:**
  - Código de status 201:
    - **Descrição:** Retorna o resultado da divisão
    - **Tipo de conteúdo:** Texto
  - Código de status 502:
    - **Descrição:** Retorna uma mensagem de erro genérica
    - **Tipo de conteúdo:** Texto

## Como Usar

Para usar esta API, você pode fazer solicitações HTTP aos endpoints relevantes usando as informações fornecidas acima.

## Notas Adicionais

Este projeto é uma API de demonstração e foi desenvolvido para fins educacionais. Certifique-se de fornecer entradas válidas ao fazer solicitações aos endpoints para obter os resultados desejados.

Para obter informações adicionais sobre a implementação ou sobre como implantar a API em um servidor de produção, consulte a documentação do Swagger ou entre em contato com o desenvolvedor do projeto.
