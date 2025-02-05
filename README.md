# Sistema de Gerenciamento de Funcionários em Kotlin

Este projeto implementa um sistema de gerenciamento de funcionários usando Kotlin, seguindo o padrão MVC (Model-View-Controller). Ele permite criar diferentes tipos de funcionários (Gerente, Desenvolvedor, Estagiário) e gerenciar suas informações.

## Estrutura do Projeto

- **`src/model/`**: Contém as classes de modelo (`Funcionario`, `Gerente`, `Desenvolvedor`, `Estagiario`).
- **`src/controller/`**: Contém a lógica de negócio (`EmpresaController`).
- **`src/view/`**: Contém a lógica de exibição (`FuncionarioView`).
- **`src/Main.kt`**: Ponto de entrada do programa.
- **`Dockerfile`**: Configuração para rodar o projeto em um contêiner Docker.
- **`Makefile`**: Comandos automatizados para build e execução.

## Requisitos

- Docker (opcional, para rodar em contêiner)
- Kotlin (opcional, para rodar localmente)

## Como Executar

### Usando Docker (Recomendado)

1. Construa a imagem Docker:
   ```bash
   make build

2. Execute o container:
  ```bash
  make run

📌 *Projeto desenvolvido para fins acadêmicos* - **(ECO0107 - DESENVOLVIMENTO PARA DISPOSITIVOS MÓVEIS)**