# Trabalho Prático: Sistema de Cofrinho (POO)

**Disciplina:** Programação Orientada a Objetos (POO)

## Descrição
Este projeto consiste na implementação de um sistema de cofrinho de moedas em Java, com o objetivo de demonstrar o uso prático de **Herança** e **Polimorfismo**.

O sistema permite gerenciar uma coleção de moedas de diferentes nacionalidades, calculando seus valores convertidos para Real.

## Funcionalidades
1.  **Menu interativo:** opções para adicionar, remover, listar e calcular total.
2.  **Moedas:**
    * Real
    * Dólar
    * Euro
    * **Bitcoin (feature extra):** adicionei uma classe extra `Bitcoin` para demonstrar a extensibilidade do código.
3.  **Tratamento de erros:** o menu possui tratamento de exceções (`try-catch`) para evitar travamentos caso o usuário digite letras em campos numéricos.
4.  **Remoção precisa:** sobrescrita do método `equals` na classe mãe para garantir que a remoção da moeda funcione corretamente na lista.

## Como executar
O projeto contém a classe `Main.java` que possui o método `main`. Basta executar este arquivo para iniciar o console interativo.

## Tecnologias
* Java (JDK)
* IDE: IntelliJ IDEA
