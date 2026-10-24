# Java.Curso-Facul

Exercícios de Java das primeiras aulas de Programação Orientada a Objetos da faculdade. Alguns estão incompletos; o repositório serve como registro de estudo.

## Conteúdo

### `java/`

- `OlaDevDojo.java` - "olá mundo"
- `Aulaj.java` - soma e subtração de dois inteiros recebidos como argumentos de linha de comando
- `Pessoa.java`, `Endereco.java`, `TstPes.java` - classes de entidade com getters/setters e associação (`Pessoa` tem um `Endereco`); `TstPes` lê os dados pelo teclado e os exibe
- `Leitura.java` - classe auxiliar para ler dados do teclado com `BufferedReader`
- `calculadora/` - calculadora de soma/subtração com `Scanner`, separando a lógica na classe `Operacao`
- `aulaj2.java` - rascunho de classe `Pessoa` com métodos de inserir e mostrar dados
- Imagens de apoio: diagrama de classes, alocação de memória/reflexividade e troca de mensagens/encapsulamento

### `Encapsulamento/`

- `Pessoa.java`, `Roupa.java`, `TstPessoa.java`, `Leitura.java` - exercício de encapsulamento e composição: lê atributos pelo teclado, altera via setters e exibe via getters

## Tecnologias

- Java (apenas a biblioteca padrão)

## Como rodar

Cada pasta é compilada separadamente. Exemplos:

```bash
cd java
javac Pessoa.java Endereco.java Leitura.java TstPes.java
java TstPes

javac Aulaj.java
java Aulaj 5 3

cd ../Encapsulamento
javac *.java
java TstPessoa
```

## Observações

- `aulaj2.java` declara uma classe pública `Pessoa`, então não compila com esse nome de arquivo.
- `calculadora/dominio/Operacao.java` usa o pacote `java.calculadora.dominio`; nomes de pacote iniciados por `java.` são reservados pela JVM.
