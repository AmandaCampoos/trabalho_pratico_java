## Trabalho Prático: JPA com MVC, Padrões de Projeto e Swing
### Curso: Sistemas para Internet
### Professor: Renato Santos
### Aluna: Amanda Campos Ximenes

## Objetivo
Este projeto foi desenvolvido como parte da disciplina de Linguagem de Programação no curso de Sistemas para Internet, com o propósito de aplicar e consolidar os conhecimentos adquiridos ao longo do semestre. Trata-se de uma aplicação desktop acadêmica desenvolvida em Java, utilizando a arquitetura MVC para organizar de forma clara as camadas de modelo, controle e visualização. A persistência de dados é realizada por meio da especificação JPA (Java Persistence API), com a implementação EclipseLink, conectada a um banco de dados MySQL. A interface gráfica da aplicação foi construída com a biblioteca Swing, permitindo a interação do usuário com os cadastros e consultas. O sistema simula um ambiente acadêmico básico, permitindo o gerenciamento de entidades como alunos, cursos, professores, disciplinas, endereços e matrículas. Além disso, o projeto implementa diversos relacionamentos entre entidades, como @OneToOne, @OneToMany, @ManyToOne e @ManyToMany, reforçando a compreensão prática da modelagem de dados com JPA.

## Tecnologias Utilizadas

- **Java 17+ / JDK 24**
- **Swing** (interface gráfica)
- **JPA (EclipseLink)** – persistência de dados
- **MySQL** – banco de dados relacional
- **Maven** – gerenciamento de dependências
- **DAO Pattern** – padrão de acesso a dados
- **MVC** – separação de responsabilidades
- **GIT** - versionamento do código


## Estrutura de Pastas

```
📦TPLP332110
 ┣ 📂Source Packages
 ┃ ┣ 📂<default package>
 ┃ ┃ ┗ 📄ProfessorResponseDTO.java
 ┃ ┣ 📂com.mycompany.tplp332110
 ┃ ┃ ┗ 📄TPLP332110.java
 ┃ ┣ 📂com.mycompany.tplp332110.controller
 ┃ ┃ ┣ 📄AlunoController.java
 ┃ ┃ ┣ 📄AlunoDTO.java
 ┃ ┃ ┣ 📄AlunoResponseDTO.java
 ┃ ┃ ┣ 📄CursoController.java
 ┃ ┃ ┣ 📄CursoDTO.java
 ┃ ┃ ┣ 📄CursoResponseDTO.java
 ┃ ┃ ┣ 📄DisciplinaController.java
 ┃ ┃ ┣ 📄DisciplinaDTO.java
 ┃ ┃ ┣ 📄DisciplinaResponseDTO.java
 ┃ ┃ ┣ 📄EnderecoController.java
 ┃ ┃ ┣ 📄EnderecoDTO.java
 ┃ ┃ ┣ 📄EnderecoResponseDTO.java
 ┃ ┃ ┣ 📄MatriculaController.java
 ┃ ┃ ┣ 📄MatriculaDTO.java
 ┃ ┃ ┣ 📄MatriculaResponseDTO.java
 ┃ ┃ ┣ 📄ProfessorController.java
 ┃ ┃ ┣ 📄ProfessorDTO.java
 ┃ ┃ ┣ 📄ProfessorResponseDTO.java
 ┃ ┃ ┣ 📄TelefoneController.java
 ┃ ┃ ┣ 📄TelefoneDTO.java
 ┃ ┃ ┗ 📄TelefoneResponseDTO.java
 ┃ ┣ 📂com.mycompany.tplp332110.model
 ┃ ┃ ┣ 📄Aluno.java
 ┃ ┃ ┣ 📄AlunoDAO.java
 ┃ ┃ ┣ 📄Curso.java
 ┃ ┃ ┣ 📄CursoDAO.java
 ┃ ┃ ┣ 📄Disciplina.java
 ┃ ┃ ┣ 📄DisciplinaDAO.java
 ┃ ┃ ┣ 📄Endereco.java
 ┃ ┃ ┣ 📄EnderecoDAO.java
 ┃ ┃ ┣ 📄EntityManagerObjectFactory.java
 ┃ ┃ ┣ 📄EntityManagerFactorySingleton.java
 ┃ ┃ ┣ 📄GenericDAO.java
 ┃ ┃ ┣ 📄Matricula.java
 ┃ ┃ ┣ 📄MatriculaDAO.java
 ┃ ┃ ┣ 📄Professor.java
 ┃ ┃ ┣ 📄ProfessorDAO.java
 ┃ ┃ ┣ 📄Telefone.java
 ┃ ┃ ┗ 📄TelefoneDAO.java
 ┃ ┣ 📂com.mycompany.tplp332110.view
 ┃ ┃ ┣ 📄App.java
 ┃ ┃ ┣ 📄CadastroAluno.java
 ┃ ┃ ┗ 📄SalvarEditarAluno.java
 ┃ ┗ 📂com.mycompany.tplp332110.view.tablemodel
 ┃ ┃ ┗ 📄AlunoTableModel.java
 ┣ 📂Test Packages
 ┣ 📂Other Sources
 ┃ ┗ 📂src/main/resources
 ┣ 📂Generated Sources (annotations)
 ┣ 📂Dependencies
 ┃ ┣ 📄jakarta.persistence-2.2.3.jar
 ┃ ┣ 📄mysql-connector-j-9.3.0.jar
 ┃ ┣ 📄org.eclipse.persistence.antlr-2.7.12.jar
 ┃ ┣ 📄org.eclipse.persistence.asm-9.4.0.jar
 ┃ ┣ 📄org.eclipse.persistence.core-2.7.12.jar
 ┃ ┣ 📄org.eclipse.persistence.jpa-2.7.12.jar
 ┃ ┣ 📄org.eclipse.persistence.jpa.jpql-2.7.12.jar
 ┃ ┣ 📄org.eclipse.persistence.moxy-2.7.12.jar
 ┃ ┣ 📄org.eclipse.persistence.persistence-jpa-modelgen.processor-2.7.12.jar
 ┃ ┗ 📄protobuf-java-4.29.0.jar
 ┣ 📂Test Dependencies
 ┣ 📂Java Dependencies
 ┃ ┗ 📄JDK 24 (Default)
 ┗ 📂Project Files
```
## Banco de Dados - Java JPA (EclipseLink)

O  **JPA (EclipseLink)** foi usado para mapear as entidades Java em tabelas no banco de dados **MySQL**. As tabelas e relacionamentos são **gerados automaticamente** a partir das anotações JPA nas classes de entidade.

### Entidades - Exemplos

###  Aluno
- `id` (PK)
- `nome`
- `matricula`
- `curso_id` (FK → Curso)
- `endereco_id` (FK → Endereco)

###  Curso
- `id` (PK)
- `nome`
- `descricao`

 **Relacionamento:**  
Um curso pode ter **vários alunos** (1:N)

###  Endereco
- `id` (PK)
- `rua`
- `bairro`
- `numero`
- `cep`
- `cidade_id` (FK → Cidade)

---
### 🔹 Tabelas
| Entidade   | Relacionamento | Com quem         |
|------------|----------------|------------------|
| Aluno      | @OneToOne      | Endereco         |
| Aluno      | @ManyToMany    | Curso            |
| Curso      | @ManyToMany    | Aluno            |
| Matricula  | @ManyToOne     | Disciplina       |
| Matricula  | @ManyToOne     | Aluno            |
| Disciplina | @ManyToMany    | Professor        |
| Professor  | @ManyToMany    | Disciplina       |

---

##  Requisitos Atendidos

### 📐 Requisitos Arquiteturais

1. **Singleton**  
   - Usado para gerenciar uma instância única de `EntityManagerFactory`.

2. **Object Factory**  
   - Criação de `EntityManager` sob demanda com `EntityManagerObjectFactory`.

3. **DAO com Interface Genérica**  
   - `GenericDAO<T>` com métodos:
     - `add(T obj)`
     - `update(T obj)`
     - `remove(T obj)`
     - `getById(Object id)`
     - `getAll()`

4. **Adapter**  
   - Conexão de listas ao `AbstractTableModel` nas tabelas Swing.

---

## 🧱 Entidades Sugeridas no Projeto

- ✅ Aluno
- ✅ Curso
- ✅ Endereco
- ✅ Professor
- ✅ Disciplina
- ✅ Matricula

---

## ⚙️ Observações Técnicas

- As tabelas são criadas automaticamente pelo JPA/EclipseLink, com base nas anotações nas entidades.
- O gerenciamento do `EntityManager` é feito via `EntityManagerObjectFactory`.
- O relacionamento entre as tabelas é mantido por **chaves estrangeiras**, também geradas pelo JPA.
- A base de dados utilizada no MySQL é definida no `persistence.xml`.

---


<img width="811" height="317" alt="Captura de tela 2025-07-03 213230" src="https://github.com/user-attachments/assets/90035f92-7785-4070-8a7c-5ebfd47e9ace" />


## Organização em Camadas, DAO,Controller e DTO
🧩 DAO (Data Access Object)
A camada DAO é responsável pela interação direta com o banco de dados. Ela realiza as operações básicas de persistência: inserir, atualizar, remover e consultar entidades. Cada classe DAO implementa a interface GenericDAO<T>, garantindo um padrão comum para todas as entidades do sistema.

Exemplo:
AlunoDAO contém métodos como add(Aluno aluno), update(Aluno aluno), getByID(long id) e getALL(), encapsulando a lógica de acesso ao banco usando JPA (Java Persistence API).


Exemplo de código:
--- 
```
public class AlunoDAO implements GenericDAO<Aluno> {
    private EntityManager em;

    public AlunoDAO(EntityManager em) {
        this.em = em;
    }

    @Override
    public void add(Aluno aluno) {
        em.getTransaction().begin();
        em.persist(aluno);
        em.getTransaction().commit();
    }

    // outros métodos: update, remove, getById etc.
}
```

🧠 Controller
A camada Controller atua como intermediária entre a interface gráfica (Swing) e a camada de persistência (DAO). É aqui que a lógica de negócio é aplicada, como validações e chamadas encadeadas. Essa separação facilita a manutenção, testabilidade e reuso do código.
````
public class AlunoController {
    private AlunoDAO alunoDAO;

    public AlunoController(EntityManager em) {
        this.alunoDAO = new AlunoDAO(em);
    }

    public void cadastrarAluno(AlunoDTO dto) {
        Aluno aluno = new Aluno();
        aluno.setNome(dto.getNome());
        aluno.setEmail(dto.getEmail());

        alunoDAO.add(aluno);
    }
}

````

Exemplo:
AlunoController recebe os dados da view, chama o AlunoDAO para persistir ou atualizar e pode incluir regras adicionais, como verificação de campos obrigatórios ou tratamento de exceções.

📤 DTO (Data Transfer Object)
A classe DTO serve para transportar dados entre camadas de forma mais controlada, evitando o acoplamento direto entre a interface e a entidade. Embora em alguns casos a entidade JPA possa ser utilizada diretamente, o uso de DTOs torna o projeto mais robusto e preparado para crescer, especialmente em sistemas distribuídos ou APIs REST.
```
public class AlunoDTO {
    private String nome;
    private String email;

    // Construtor, getters e setters
}

```

No projeto, DTOs podem ser utilizados para enviar somente os dados necessários entre a interface e o Controller, evitando expor propriedades sensíveis ou irrelevantes da entidade.

## Interface Gráfica com Swing
---
O sistema de cadastro de alunos foi desenvolvido utilizando a biblioteca Swing do Java para criação da interface gráfica (GUI). A interface está dividida em telas principais que permitem ao usuário cadastrar, editar, remover e visualizar os alunos com seus respectivos dados.

### Telas Principais
## 1. Tela de Listagem de Alunos




<img width="1066" height="872" alt="Captura de tela 2025-07-24 140702" src="https://github.com/user-attachments/assets/42551235-7189-480a-abca-1b905825bf65" />


Essa é a tela inicial do sistema, onde são listados todos os alunos cadastrados. O usuário pode:

- Cadastrar um novo aluno clicando no botão "Novo".

- Editar um aluno selecionado clicando no botão "Editar".

- Excluir um aluno com o botão "Excluir".

- Limpar os campos com o botão "Limpar".

- A tabela na parte inferior exibe os dados dos alunos, como ID, Nome e Email.

## 2. Tela de Cadastro/Edição de Aluno


<img width="1096" height="870" alt="Captura de tela 2025-07-24 140637" src="https://github.com/user-attachments/assets/2fa918bb-0bfd-4fbd-bbb5-ae6a5b90d873" />



Esta tela é aberta ao clicar em "Novo" ou "Editar". Permite ao usuário preencher os dados do aluno:

ID (gerado automaticamente),Nome,E-mail,Endereço (logradouro, número, cidade, estado e CEP),Telefone(s), com possibilidade de adicionar mais de um número com tipo e observações.

### Os botões disponíveis são:

- Salvar: envia os dados preenchidos para o controller.

- Cancelar: fecha a tela sem salvar as alterações.
## Integração entre GUI, Controller e DAO
A arquitetura segue o padrão MVC (Model-View-Controller):

- View (Swing): A interface gráfica foi construída com componentes do Swing.
- O usuário interage diretamente com os formulários.
- Controller: Recebe os dados da view através de DTOs (Data Transfer Objects), realiza validações e chama a camada de persistência (DAO).
- Por exemplo:Copiar e Editar


```
  AlunoDTO dto = new AlunoDTO();
dto.setNome(txtNome.getText());
dto.setEmail(txtEmail.getText());

AlunoResponseDTO response = alunoController.add(dto);

  ```

## Execução

1. Clone o repositório:
   ```bash
   git clone git@github.com:AmandaCampoos/trabalho_pratico_java.git
