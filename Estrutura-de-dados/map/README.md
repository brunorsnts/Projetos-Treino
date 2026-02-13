# Placar de UNO - Estudo de Mapas (HashMap)

Este projeto demonstra a utilização da estrutura de dados **Map** (Mapa/Dicionário) em Java, aplicada a um cenário prático: um registo de pontuações para partidas de UNO.

## 📝 Descrição

Diferente das Listas ou Conjuntos, os Mapas armazenam os dados num formato de **Chave-Valor** (Key-Value). Neste sistema, a "Chave" é o nome do jogador (que deve ser único) e o "Valor" é a sua pontuação atual.

O sistema permite registar quem venceu a rodada e quantos pontos acumulou, atualizando o mapa automaticamente e exibindo o placar final.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **java.util.Map** (Interface que define a estrutura de chave-valor)
* **java.util.HashMap** (Implementação focada em busca e atualização rápida)
* **java.util.Scanner** (Para capturar os dados introduzidos no terminal)

## 💻 Como funciona o Código

O ficheiro `Main.java` executa o seguinte fluxo:

1.  **Inicialização:** O `HashMap` é criado definindo `String` para a chave (nome) e `Integer` para o valor (pontos). Os jogadores começam com 0 pontos.
2.  **Entrada de Dados:** O sistema pergunta quem ganhou a rodada e quantos pontos fez.
3.  **Atualização (`put`):** O método `.put(vencedor, pontos)` é utilizado. Se a chave já existir, o `HashMap` substitui o valor antigo pelo novo; se não existir, cria um novo registo.
4.  **Iteração com Lambda:** Utiliza-se o método `.forEach((key, value) -> ...)` para percorrer o mapa inteiro e imprimir o placar atualizado de forma concisa.

### Exemplo de Saída Esperada

```text
Digite quem ganhou a rodada: Renato
Digite quantos pontos o Renato fez: 50

--- Placar Atualizado ---
Alex tem: 0 pontos
Renato tem: 50 pontos
Bruno tem: 0 pontos
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)