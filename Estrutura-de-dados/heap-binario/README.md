# Simulação de Max-Heap (Heapify-Up) - Estudo de Árvores em Arrays

Este projeto demonstra a mecânica interna de uma estrutura de dados **Heap** (especificamente um Max-Heap), muito utilizada para criar Filas de Prioridade.

## 📝 Descrição

Um **Max-Heap** é uma Árvore Binária com uma regra estrita: **o nó pai tem de ser sempre maior do que os seus filhos**.

Neste cenário prático, simulamos o que acontece quando um número muito grande (100) é inserido no final da árvore. Para manter a regra do Max-Heap, o novo elemento precisa de "subir" na árvore (operação conhecida como *Heapify-Up* ou *Bubble-Up*), trocando de lugar com o pai repetidamente até encontrar a sua posição correta.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* Arrays (Vetores) para representação de Árvores Binárias
* Lógica de Swap (Troca de variáveis)

## 💻 Como funciona o Código

O ficheiro `Main.java` executa o seguinte fluxo:

1.  **Representação em Array:** A árvore é guardada num array plano `[90, 80, 70, 50, 60, 100]`. O valor `100` é o recém-chegado na última posição.
2.  **Cálculo do Pai:** O Java utiliza a fórmula `(índice - 1) / 2` para descobrir quem é o "pai" de qualquer elemento.
3.  **Avaliação e Troca (Swap):** O laço `while` compara o filho com o pai. Como `100` é maior que `70`, e depois maior que `90`, os valores trocam de posição através de uma variável temporária (`temp`).
4.  **Atualização de Ponteiro:** O índice atual passa a ser o índice do pai, permitindo que o número continue a subir até chegar à raiz (índice 0) ou encontrar um pai maior do que ele.

### Exemplo de Saída Esperada

```text
Antes: [90, 80, 70, 50, 60, 100]
Trocando 100 com o pai 70
Trocando 100 com o pai 90
Depois: [100, 80, 90, 50, 60, 70]
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)