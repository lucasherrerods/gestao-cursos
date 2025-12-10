## 📚 Sistema de Gestão de Cursos

☕ **Java 17+**

Um projeto simples focado em praticar e consolidar os principais conceitos de **Programação Orientada a Objetos (POO)**.

### 🧠 Conceitos aplicados

✔ Encapsulamento  
Atributos essenciais são privados, com acesso controlado por getters e setters.

✔ Herança  
`Aluno` e `Professor` herdam de `Pessoa`.

✔ Polimorfismo  
Cada tipo de curso sobrescreve o método de cálculo do certificado.

✔ Classes Abstratas  
`Curso` define estrutura e obriga as subclasses a implementarem suas regras específicas.

✔ Coleções  
Todos os registros são armazenados e manipulados com `ArrayList`.


### 🚀 Funcionalidades

O sistema permite gerenciar um pequeno ambiente educacional, incluindo:

👥 Pessoas
- Cadastro e listagem de **alunos**
- Cadastro e listagem de **professores**

📘 Cursos
- Cadastro e listagem de **cursos**, com três tipos:
  - `CursoPresencial`
  - `CursoOnline`
  - `CursoIntensivo`
- Cada tipo implementa seu próprio cálculo de certificado

📝 Gestão
- **Matrícula de alunos** em cursos
- **Relatório final de certificados**
- **Validações internas** para evitar cadastros inconsistentes (ex.: impedir cadastrar curso sem professor ou matricular aluno sem cadastro)


### 📂 Estrutura do Projeto

```text
src/
│
├── Main.java
│
├── Pessoa.java
├── Aluno.java
├── Professor.java
│
├── Curso.java  (classe abstrata)
├── CursoPresencial.java
├── CursoOnline.java
└── CursoIntensivo.java

