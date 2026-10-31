# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

## 1. Identificação do Projeto

**Projeto:** Projeto Calculadora  
**Contexto:** FinançApp  
**Aluno:** Guilherme Cintra Doraciotto  
**RA:** 200376  
**Curso:** Análise e Desenvolvimento de Sistemas — Facens  
**Disciplina:** Teste de Software / UI/UX (confirmar nome oficial no Canvas)  
**Professor:** Daniel Ohata  
**Semestre:** 2026.2

## 2. Visão Geral

Módulo em Java para cálculos matemáticos básicos da startup fictícia FinançApp. O projeto permite praticar validação, tratamento de erros, testes, refatoração, documentação e versionamento.

## 3. Problema

Um módulo de cálculos financeiros deve fornecer resultados corretos e ser fácil de manter, inclusive quando recebe operações inválidas.

## 4. Objetivo

Desenvolver uma calculadora reutilizável e demonstrar sua qualidade por meio de testes, documentação JavaDoc e histórico de refatoração.

## 5. Escopo Funcional

| ID | Funcionalidade | Descrição |
|---|---|---|
| RF01 | Soma | Calcula a soma de dois inteiros |
| RF02 | Subtração | Calcula a diferença |
| RF03 | Multiplicação | Calcula o produto |
| RF04 | Divisão | Calcula o quociente, inclusive decimal |
| RF05 | Divisão por zero | Lança ArithmeticException, tratada no programa |
| RF06 | Operação inválida | Lança IllegalArgumentException, tratada no programa |

## 6. Requisitos Não Funcionais

Legibilidade, testes repetíveis, tratamento de erros, documentação JavaDoc, versionamento Git e facilidade de manutenção.

## 7. Tecnologias Utilizadas

| Tecnologia | Versão | Utilização |
|---|---|---|
| Java / JDK | Preencher com `java -version` | Compilação e execução |
| Git | Preencher com `git --version` | Controle de versão |
| GitHub | Plataforma web | Repositório remoto |
| JavaDoc | Incluído no JDK | Documentação HTML |
| IDE | VS Code | Desenvolvimento |
| Testes | Java, sem biblioteca externa | Classe TesteCalculadora com verificações automáticas |

## 8. Estrutura do Projeto

```text
projeto_calculadora/
├── src/calculadora/Calculadora.java
├── src/calculadora/Main.java
├── test/calculadora/TesteCalculadora.java
├── docs/index.html
├── images/testes/
├── images/javadoc/
├── images/refatoracao/
├── TESTAR.bat
├── EXECUTAR.bat
├── GERAR_JAVADOC.bat
└── README.md
```

## 9. Operações e Tratamento de Erros

O método `calc(int a, int b, String op)` devolve `double`. Divisão por zero e operadores desconhecidos geram exceções específicas; o programa de demonstração captura essas exceções e continua executando.

## 10. Testes

Execute `TESTAR.bat`. São avaliados soma, subtração, multiplicação, divisão, divisão por zero, operador inválido e operador nulo.

**Evidência a adicionar após executar:**  
`![Testes executados](images/testes/testes-01_inicial.png)`

## 11. Refatoração

A versão inicial usa condicionais encadeadas. Na branch `Refatoracao`, a lógica é reorganizada com `switch` e métodos separados. Os mesmos testes devem ser executados novamente para verificar a manutenção do comportamento.

**Evidência a adicionar:** print do histórico de commits e da branch `Refatoracao` em `images/refatoracao/`.

## 12. Documentação JavaDoc

Execute `GERAR_JAVADOC.bat` e abra `docs/index.html`.

**Evidência a adicionar:** `![JavaDoc](images/javadoc/javadoc.png)`.

## 13. Repositório

**URL:** INSERIR_LINK_DO_SEU_REPOSITORIO_GITHUB

**Branches:** `main` e `Refatoracao`.

## 14. Conclusão

A implementação demonstra operações matemáticas básicas, tratamento de falhas, testes automatizados e a organização necessária para manutenção do código.
