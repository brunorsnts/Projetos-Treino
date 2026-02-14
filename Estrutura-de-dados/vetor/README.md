# Vetor Dinâmico (Custom ArrayList) - Estrutura de Dados

Este projeto demonstra a construção de uma **Lista Sequencial (Vetor Dinâmico)** do zero em Java. É uma recriação didática de como classes nativas como o `java.util.ArrayList` funcionam por baixo dos panos.

## 📝 Descrição

Os Arrays (vetores) nativos em Java possuem um tamanho fixo. Se criarmos um array de 100 posições e tentarmos inserir o 101º elemento, o programa falha.

Para resolver isto, implementamos a classe `Vetor`, que "esconde" um array comum, mas possui **inteligência de redimensionamento**. Se o array encher, o sistema cria automaticamente um novo array com o dobro do tamanho e copia os dados antigos, permitindo que a lista cresça infinitamente.

A classe manipulada armazena instâncias de `Aluno`, demonstrando também a importância da sobrescrita do método `equals()` para realizar buscas corretas.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* POO (Programação Orientada a Objetos)
* Manipulação manual de memória e índices (Deslocamento de Arrays)

## 💻 Como funciona o Código

A classe `Vetor` implementa as principais operações de uma lista:

* **`adiciona(Aluno)`:** Insere no final da lista.
* **`adiciona(Aluno, posicao)`:** Insere no meio da lista, "empurrando" os elementos seguintes para a direita para não sobrescrever dados.
* **`remove(posicao)`:** Remove um item e "puxa" os elementos seguintes para a esquerda, tapando o buraco deixado.
* **`contem(Aluno)`:** Faz uma busca linear utilizando o método `equals()` da classe `Aluno`.
* **`garanteEspaco()`:** (O coração do vetor dinâmico) Verifica se o limite foi atingido e, se sim, duplica a capacidade do array interno.

No ficheiro de testes (`VetorTeste.java`), é executado um laço de repetição (loop) adicionando 300 alunos de uma só vez para testar e provar o funcionamento do redimensionamento automático.

---

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)