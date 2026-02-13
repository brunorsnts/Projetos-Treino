# Estrutura de Dados em Árvore (Binary Tree)

Este projeto demonstra a construção básica de uma estrutura de dados **Árvore Binária** do zero em Java. As árvores são estruturas não-lineares hierárquicas, fundamentais para buscas eficientes e organização de dados.

## 📝 Descrição

Diferente das Listas ou Filas (onde um elemento aponta apenas para o próximo), numa Árvore Binária cada elemento (chamado de **Nó**) pode apontar para até dois outros nós: um à **esquerda** e outro à **direita**.

O nó principal no topo é chamado de **Raiz**. Neste projeto, implementamos uma classe personalizada `NoArvore` para entender o funcionamento interno desta ramificação de memória.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* POO (Programação Orientada a Objetos)
* Referências de Memória (Ponteiros Duplos)
* `String.repeat()` (Para formatação visual no terminal)

## 💻 Como funciona o Código

O código é composto por duas partes:

1.  **Classe `NoArvore`:** Representa um ponto na árvore. Possui um `valor` numérico (int) e duas referências para os seus filhos (`esquerda` e `direita`). O construtor inicializa os filhos como `null`.
2.  **Construção e Renderização (`main`):** * Criamos o nó **Raiz** com valor 10.
    * Criamos o filho à **esquerda** com valor 5 e o filho à **direita** com valor 15.
    * Conectamos os nós manualmente (`noRaiz.esquerda = noFilhoEsquerda;`).
    * Utilizamos `String.repeat()` para criar espaços vazios dinâmicos e desenhar os traços `/ \` no ecrã.

### Exemplo de Saída Esperada

```text
---Representação de uma Estrutura de dados em árvore---
          10
         /  \
        5    15
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)