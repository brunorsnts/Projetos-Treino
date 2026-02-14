# Simulação de Rede Social - Estudo de Grafos (Lista de Adjacência)

Este projeto demonstra a construção de uma estrutura de dados de **Grafo (Graph)** utilizando a técnica de **Lista de Adjacência**, aplicada a um cenário prático de uma rede social.

## 📝 Descrição

Um Grafo é uma estrutura não-linear formada por **Vértices** (nós/entidades) e **Arestas** (conexões/relacionamentos).
Neste projeto:
* Os **Vértices** são os utilizadores (Bruno, Alex, Renato).
* As **Arestas** são os laços de amizade entre eles.

Para representar isso em código de forma eficiente, combinamos duas estruturas do Java: um `Map` e uma `List`. A chave do Mapa é o nome do utilizador, e o valor é uma Lista contendo todos os seus amigos diretos.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **java.util.Map** & **HashMap** (Para mapear o utilizador)
* **java.util.List** & **ArrayList** (Para armazenar as conexões de cada utilizador)
* Estrutura de Grafos Não-Direcionados (Relacionamentos mútuos)

## 💻 Como funciona o Código

O ficheiro `Main.java` executa o seguinte fluxo:

1.  **Inicialização do Grafo:** É criado um mapa principal `Map<String, List<String>> redeSocial`.
2.  **Criação de Conexões:** Listas individuais de amigos são instanciadas e preenchidas (O Bruno adiciona o Alex e o Renato; O Alex e o Renato adicionam o Bruno).
3.  **Vínculo no Mapa:** Utilizamos o método `put()` para associar cada utilizador à sua respetiva lista de amigos.
4.  **Exibição da Rede:** Utilizamos o `forEach` com uma expressão lambda para varrer todo o mapa e imprimir a rede de amizades completa.

### Exemplo de Saída Esperada

*(Nota: A ordem de exibição pode variar pois o `HashMap` não garante ordenação)*

```text
O Alex tem como amigos: [Bruno]
O Renato tem como amigos: [Bruno]
O Bruno tem como amigos: [Alex, Renato]
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)