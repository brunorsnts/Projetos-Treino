# Simulação de Balanceador de Carga (Round-Robin) - Estudo de Arrays e Algoritmos

Este projeto demonstra a implementação de um algoritmo de distribuição de tarefas conhecido como **Round-Robin**, simulando um balanceador de carga que distribui requisições web por um conjunto de servidores.

## 📝 Descrição

O sistema simula a chegada de 10 requisições sequenciais. Para garantir que nenhum servidor fique sobrecarregado, o algoritmo distribui cada nova requisição para o próximo servidor disponível na lista, voltando ao primeiro servidor quando a lista termina.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* Arrays (Vetores)
* Operador Módulo (`%`) para iteração circular

## 💻 Como funciona o Código

O ficheiro `Main.java` executa o seguinte fluxo:

1.  **Pool de Servidores:** Utiliza um Array simples de Strings contendo três servidores ("Servidor A", "Servidor B", "Servidor C").
2.  **Ponteiro de Fila:** Uma variável inteira (`ponteiro`) regista qual é o próximo servidor a receber uma requisição.
3.  **Iteração Circular:** Através da expressão matemática `ponteiro = (ponteiro + 1) % servidores.length`, o ponteiro avança e regressa automaticamente a `0` quando atinge o tamanho máximo do array, criando um ciclo infinito.
4.  **Simulação de Tempo:** A função `Thread.sleep(2000)` é utilizada para simular o tempo de processamento e resposta de cada servidor.

### Exemplo de Saída

```text
Requisição 1 chegando. Procurando por um servidor disponível para atendê-la...
Enviando para o Servidor A...
O Servidor A está processando a requisição...
Processamento concluído

Requisição 2 chegando. Procurando por um servidor disponível para atendê-la...
Enviando para o Servidor B...
O Servidor B está processando a requisição...
Processamento concluído
...
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)