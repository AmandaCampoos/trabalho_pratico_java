# Trabalho Prático - Sistema de Gestão de Cursos

Aplicação desktop desenvolvida em Java com arquitetura MVC, utilizando JPA (EclipseLink) para persistência de dados e interface gráfica com Swing. O projeto simula um sistema acadêmico com controle de alunos, cursos, professores, disciplinas e matrículas.

## Informações Gerais

- **Curso:** Sistemas para Internet  
- **Professor:** Renato Santos  
- **Ferramentas:** NetBeans, Maven, EclipseLink (JPA), MySQL, Git/GitHub  
- **Data de Entrega:** 11/07/2025  

## Objetivo

Desenvolver uma aplicação completa utilizando boas práticas de programação, padrões de projeto (Singleton, Factory, DAO, Adapter), persistência com JPA e controle de versão com Git.

## Estrutura do Projeto

- `model`: Entidades JPA e DAOs  
- `controller`: Lógica de controle entre a View e a Model  
- `view`: Telas Java Swing integradas via MVC

## Padrões de Projeto Utilizados

- **Singleton:** EntityManagerFactory  
- **Object Factory:** Instanciador de EntityManager  
- **DAO com Interface Genérica:** Interface `GenericDAO<T>`  
- **Adapter:** Integração com `AbstractTableModel` no Swing

## Relacionamentos JPA Implementados

- `@OneToOne`: Aluno → Endereço  
- `@OneToMany`: Aluno → Telefones, Aluno → Matrículas  
- `@ManyToOne`: Matrícula → Disciplina  
- `@ManyToMany`: Curso ↔ Aluno, Disciplina ↔ Professor

## Entidades do Sistema

- Aluno  
- Endereco  
- Telefone  
- Curso  
- Disciplina  
- Professor  
- Matrícula

## Execução

1. Clone o repositório:
   ```bash
   git clone git@github.com:AmandaCampoos/trabalho_pratico_java.git
