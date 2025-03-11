# 📋 Board de Tarefas | Java & Spring Boot

![Status do Projeto](https://img.shields.io/badge/Status-Concluído-yellow)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-green)
![Licença](https://img.shields.io/badge/Licença-MIT-blue)

## 📚 Sobre o Projeto

O **Board de Tarefas** é uma aplicação web desenvolvida com Java e Spring Boot, criada durante o módulo de Integração de Sistemas com Bancos de Dados do Bootcamp Decola Tech 2025. Este projeto implementa um sistema de gerenciamento de tarefas estilo Kanban, permitindo aos usuários organizar suas atividades de forma visual e eficiente.

## 🎯 Funcionalidades

- **Criação de Tarefas**: Adicione novas tarefas com título, descrição, prioridade e prazo
- **Quadro Kanban**: Visualize suas tarefas em colunas (A Fazer, Em Andamento, Concluído)
- **Movimentação de Tarefas**: Arraste e solte para alterar o status das tarefas
- **Gerenciamento de Usuários**: Crie perfis e atribua tarefas a diferentes usuários
- **Filtros e Busca**: Encontre tarefas por status, prioridade ou palavra-chave
- **API RESTful**: Endpoints documentados para integração com outros sistemas

## 🔧 Tecnologias Utilizadas

- **Backend**:
  - Java 17
  - Spring Boot 3.2.0
  - Spring Data JPA
  - Spring Security
  - Hibernate
  - Lombok

- **Banco de Dados**:
  - PostgreSQL
  - Migrations com Flyway

- **Frontend**:
  - Thymeleaf
  - Bootstrap 5
  - JavaScript / jQuery

## 📋 Pré-requisitos

- JDK 17 ou superior
- Maven
- PostgreSQL
- Git

## 🚀 Como Executar

### Clonando o Repositório

```bash
git clone https://github.com/mauriciogonrails/task-board.git
cd task-board
```

### Configurando o Banco de Dados

1. Crie um banco de dados PostgreSQL
2. Atualize o arquivo `application.properties` com suas configurações de banco de dados:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskboard
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Executando a Aplicação

```bash
# Usando o wrapper do Gradle
./gradlew bootRun

# Ou para Windows
gradlew.bat bootRun
```

A aplicação estará disponível em: `http://localhost:8080`

## 📊 Estrutura do Projeto

```
task-board/
├── .idea/               # Configurações do IntelliJ IDEA
├── gradle/wrapper/      # Arquivos do wrapper Gradle
├── src/
│   ├── main/
│   │   ├── java/        # Código-fonte Java
│   │   │   └── com/
│   │   │       └── decola/
│   │   │           └── taskboard/
│   │   │               ├── controller/  # Controladores REST
│   │   │               ├── model/       # Entidades JPA
│   │   │               ├── repository/  # Repositórios Spring Data
│   │   │               ├── service/     # Camada de serviço
│   │   │               ├── config/      # Configurações
│   │   │               └── Application.java
│   │   └── resources/
│   │       ├── static/  # Arquivos estáticos (CSS, JS)
│   │       ├── templates/ # Templates Thymeleaf
│   │       └── application.properties
│   └── test/            # Testes automatizados
├── .gitignore
├── build.gradle.kts     # Configuração do Gradle
├── gradlew              # Script do Gradle para Linux/Mac
├── gradlew.bat          # Script do Gradle para Windows
└── README.md
```

## 📝 Endpoints da API

| Método | URL | Descrição |
|--------|-----|-----------|
| GET    | /api/tasks | Lista todas as tarefas |
| GET    | /api/tasks/{id} | Obtém uma tarefa específica |
| POST   | /api/tasks | Cria uma nova tarefa |
| PUT    | /api/tasks/{id} | Atualiza uma tarefa existente |
| DELETE | /api/tasks/{id} | Remove uma tarefa |
| GET    | /api/users | Lista todos os usuários |
| POST   | /api/users | Cria um novo usuário |

## 📈 Diagrama do Banco de Dados

```
┌─────────────┐     ┌──────────────┐     ┌──────────────┐
│ User        │     │ Task         │     │ TaskStatus   │
├─────────────┤     ├──────────────┤     ├──────────────┤
│ id          │     │ id           │     │ id           │
│ name        │     │ title        │     │ name         │
│ email       │     │ description  │     │ description  │
│ password    │     │ due_date     │     └──────────────┘
│ created_at  │     │ priority     │         ▲
└─────────────┘     │ created_at   │         │
      ▲             │ user_id      │─────────┘
      │             │ status_id    │
      └─────────────┴──────────────┘
```

## 🧪 Testes

O projeto inclui testes unitários e de integração para garantir a qualidade do código.

```bash
# Executando os testes
./gradlew test
```

## 🤝 Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Abrir issues para reportar bugs ou sugerir melhorias
2. Enviar pull requests com novas funcionalidades
3. Melhorar a documentação

## 📜 Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).

## 🙏 Agradecimentos

- [Bootcamp Decola Tech](https://www.dio.me/) - Pela oportunidade de aprendizado
- Todos os mentores e instrutores que contribuíram para este projeto

---

Desenvolvido com ❤️ por [Mauricio Gonçalves](https://github.com/mauriciogonrails) durante o Bootcamp Decola Tech 2025.

