# Calculadora Java

Calculadora de terminal desenvolvida em Java, criada para praticar os fundamentos da linguagem: entrada de dados, estruturas condicionais, laços, tratamento de exceções e organização de código em classes.

## Funcionalidades

- Soma, subtração, multiplicação e divisão de dois números (inclusive decimais)
- Tratamento de divisão por zero
- Validação de entrada: letras no lugar de números não fecham o programa
- Mensagem de erro para operação inexistente
- Opção de fazer várias contas sem reiniciar o programa

## Tecnologias

- Java 17 ou superior
- Classe `Scanner` para leitura de dados no terminal

## Como executar

### Pré-requisito

Ter o [JDK](https://adoptium.net/) instalado. Para conferir, rode no terminal:

```bash
java -version
```

### Passo a passo

1. Clone o repositório:

```bash
git clone https://github.com/Rafael4antunes/Calculadora-java.git
cd Calculadora-java
```

2. Compile:

```bash
javac -d out Project.java
```

3. Execute:

```bash
java -cp out project.Project
```

> Também é possível abrir a pasta em uma IDE (NetBeans, IntelliJ, Eclipse) e rodar a classe principal.

## Exemplo de uso

```
Bem-vindo à Calculadora Digital!
Digite o primeiro número: 10
Digite o segundo número: 4
Operação (+, -, *, /): /
Resultado: 2.5
Fazer outra conta? (s/n): s
Digite o primeiro número: 8
Digite o segundo número: 0
Operação (+, -, *, /): /
Não é possível dividir por zero.
Fazer outra conta? (s/n): n
Até mais!
```

## Estrutura do projeto

```
Calculadora-java/
├── Project.java    # classe principal da calculadora
├── .gitignore
└── README.md
```

## O que aprendi

- Leitura de dados com `Scanner`
- Uso de `switch`, `if/else` e laço `while`
- Tratamento de exceções com `try/catch`
- Separação entre lógica e interação com o usuário

## Próximos passos

- [ ] Adicionar potência e raiz quadrada
- [ ] Guardar o histórico das operações
- [ ] Criar testes com JUnit
- [ ] Construir uma interface gráfica com Swing

## Autor

Feito por **Rafael Antunes** — estudante de Ciência da Computação.

[GitHub](https://github.com/Rafael4antunes)
