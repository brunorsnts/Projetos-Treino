# Simulação de Vagões de Trem - Estudo de Listas Encadeadas (Linked List)

Este projeto demonstra a construção básica de uma estrutura de dados **Lista Simplesmente Encadeada (Singly Linked List)** do zero em Java. Utiliza a analogia de um trem, onde cada vagão está conectado ao próximo.

## 📝 Descrição

Diferente de Arrays, onde os itens ocupam espaços contínuos na memória, as Listas Encadeadas utilizam "Nós" espalhados pela memória. Cada nó contém um valor e um "ponteiro" (referência) para o próximo nó da sequência.

Neste projeto, criamos a nossa própria estrutura de Nó para entender o funcionamento interno desta estrutura de dados antes de utilizar as classes prontas do Java (como `java.util.LinkedList`).

## 🚀 Tecnologias Utilizadas

* **Java 17**
* POO (Programação Orientada a Objetos)
* Referências de Memória / Ponteiros

## 💻 Como funciona o Código

O código é composto por duas partes principais:

1.  **Classe `No` (Node):** Representa um vagão. Possui um campo de texto (`valor`) e uma variável do tipo `No` (`proximo`), que guarda a referência para o vagão seguinte.
2.  **Encadeamento Manual:** No método `main`, instanciamos três vagões distintos ("Locomotiva", "Carga", "Passageiros") e os conectamos manualmente (`no1.proximo = no2;`).
3.  **Iteração (Traversal):** Utilizamos um laço `while` para percorrer a lista. Começamos no primeiro nó e avançamos utilizando a referência `vagaoAtual = vagaoAtual.proximo` até encontrarmos um nó que aponte para `null` (fim do trem).

### Exemplo de Saída

```text
Atualmente estou no Vagão Locomotiva
Atualmente estou no Vagão de Carga
Atualmente estou no Vagão de Passageiros
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)