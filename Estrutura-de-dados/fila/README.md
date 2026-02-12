# Simulação de Fila de Impressão - Estudo de Queues (Filas)

Este projeto demonstra o funcionamento da estrutura de dados **Fila (Queue)** em Java, simulando o comportamento de uma impressora corporativa.

## 📝 Descrição

O projeto utiliza o conceito **FIFO (First-In, First-Out)**, onde o primeiro documento enviado para a impressora é o primeiro a ser processado. O sistema simula:
1.  **Chegada de documentos:** Adiciona arquivos à fila de impressão.
2.  **Processamento:** Simula o tempo de impressão de cada arquivo.
3.  **Remoção:** Retira o documento da fila após a conclusão.

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **java.util.Queue** (Interface para definir o comportamento de fila)
* **java.util.LinkedList** (Implementação da estrutura de dados)

## 💻 Como funciona o Código

O arquivo `Main.java` executa o seguinte fluxo:

* **`offer()`**: Adiciona documentos ("Relatório", "Contrato", "Foto") à fila.
* **`peek()`**: Visualiza qual é o próximo documento a ser impresso sem removê-lo.
* **`poll()`**: Imprime e remove o documento da fila.
* **`Thread.sleep()`**: Simula uma pausa de 2 segundos para representar o tempo real de impressão.

### Exemplo de Saída

```text
Arquivos na fila para impressão:
Relatório.pdf
Contrato.docx
Foto.jpg
-----------------------------------

Imprimindo: Relatório.pdf...
Relatório.pdf impresso

Imprimindo: Contrato.docx...
Contrato.docx impresso
...
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)