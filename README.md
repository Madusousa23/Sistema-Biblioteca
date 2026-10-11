<div align="center">

# 📚 Sistema de Biblioteca

**Aplicação em Java que aplica orientação a objetos em um problema real: controlar o acervo e os empréstimos de uma biblioteca.**

[Funcionalidades](#-funcionalidades) •
[Demonstração](#-demonstração) •
[Arquitetura](#-arquitetura) •
[Como executar](#-como-executar) •
[Competências](#-competências-demonstradas) •
[Roadmap](#-roadmap)

</div>

---

## 🎯 Sobre o projeto

O **Sistema de Biblioteca** é uma aplicação de console que permite cadastrar livros, pesquisá-los e controlar empréstimos e devoluções, **garantindo que um mesmo livro não seja emprestado duas vezes**.

O foco do projeto é a **qualidade do design**: classes com responsabilidades bem definidas, encapsulamento e separação entre interface (entrada e saída) e regras de negócio.

Também há uma **versão web** (`sistema-biblioteca.html`) com a mesma lógica, que roda direto no navegador, sem instalar nada.

## ✨ Funcionalidades

| | Funcionalidade | Detalhe |
|---|---|---|
| ➕ | **Cadastrar livros** | Título e autor |
| 📋 | **Listar acervo** | Exibe cada livro com seu status |
| 🔎 | **Pesquisar por título** | Busca sem diferenciar maiúsculas e minúsculas |
| 📤 | **Emprestar** | Bloqueia empréstimos duplicados |
| 📥 | **Devolver** | Valida se o livro realmente estava emprestado |
| 🛡️ | **Entrada validada** | O menu rejeita valores não numéricos sem travar |

## 🎬 Demonstração

```text
===== SISTEMA DE BIBLIOTECA =====
1 - Cadastrar livro
2 - Listar livros
3 - Pesquisar livro
4 - Emprestar livro
5 - Devolver livro
0 - Sair
Escolha uma opção: 1
Digite o título: Dom Casmurro
Digite o autor: Machado de Assis
Livro cadastrado com sucesso!

Escolha uma opção: 4
Digite o título para emprestar: dom casmurro
Empréstimo realizado com sucesso!

Escolha uma opção: 4
Digite o título para emprestar: Dom Casmurro
Este livro já está emprestado.   ← regra de negócio em ação

Escolha uma opção: 2
Título: Dom Casmurro
Autor: Machado de Assis
Status: Emprestado
-------------------------
```

## 🏗️ Arquitetura

```text
Main  ──usa──▶  Biblioteca  ──gerencia (1..*)──▶  Livro
```

| Camada | Classe | Responsabilidade |
|---|---|---|
| Interface | `Main` | Menu, leitura e validação da entrada do usuário |
| Regras de negócio | `Biblioteca` | Coleção de livros e regras de empréstimo e devolução |
| Domínio | `Livro` | Estado do livro e comportamentos próprios |

### Decisões de design

- **Encapsulamento:** atributos `private`; o estado só muda por métodos (`emprestar()`, `devolver()`).
- **Responsabilidade única:** `Main` não conhece regras; `Livro` não conhece a coleção.
- **Sem acoplamento com pacotes:** os arquivos podem ser compilados juntos, o que facilita rodar o projeto.

## 🚀 Como executar

**Requisito:** Java JDK 8 ou superior.

```bash
# 1. Clone o repositório
git clone https://github.com/<seu-usuario>/SistemaBiblioteca.git
cd SistemaBiblioteca/src

# 2. Compile
javac *.java

# 3. Execute
java Main
```

Ou abra a pasta em uma IDE (IntelliJ, Eclipse, VS Code) e execute `src/Main.java`.

**Versão web:** abra `sistema-biblioteca.html` em qualquer navegador.

## 📁 Estrutura

```text
SistemaBiblioteca/
├── src/
│   ├── Main.java          # Menu e entrada do usuário
│   ├── Biblioteca.java    # Regras de negócio
│   └── Livro.java         # Entidade de domínio
├── sistema-biblioteca.html # Versão para navegador
└── README.md
```

## 🧠 Competências demonstradas

- **Programação Orientada a Objetos:** classes, objetos, encapsulamento e associação
- **Java:** `ArrayList`, `Scanner`, estruturas de controle, `switch`
- **Lógica e regras de negócio:** prevenção de estados inválidos (empréstimo duplicado)
- **Tratamento de entrada:** validação para evitar falhas por dados incorretos
- **Organização de código:** nomes claros, métodos pequenos e responsabilidades separadas
- **Portabilidade:** a mesma lógica reimplementada em JavaScript para a web

## ⚠️ Limitações conhecidas

- Os dados ficam apenas em memória e são perdidos ao encerrar.
- A pesquisa exige o título completo.
- Não há controle de usuários nem de datas de empréstimo.

## 🗺️ Roadmap

- [ ] Persistência em arquivo (JSON/CSV) ou banco de dados (SQLite/JDBC)
- [ ] Busca por autor e por trecho do título
- [ ] Cadastro de usuários e histórico de empréstimos
- [ ] Data de devolução e cálculo de multa
- [ ] Testes unitários com JUnit 5
- [ ] Migração para Maven ou Gradle
- [ ] API REST com Spring Boot


<div align="center">

Se este projeto foi útil, deixe uma ⭐ no repositório!

</div>
