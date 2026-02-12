# Simulação de Histórico de Navegação - Estudo de Pilhas (Stack)

Este projeto demonstra o funcionamento da estrutura de dados **Pilha (Stack)** em Java, simulando o comportamento do botão "Voltar" de um navegador web.

## 📝 Descrição

O projeto utiliza o conceito **LIFO (Last In, First Out)**, onde a última página acessada é a primeira a ser removida ao voltar. O sistema permite:
1.  Adicionar páginas ao histórico (Navegar).
2.  Visualizar a página atual.
3.  Remover a página atual do topo da pilha (Voltar).

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **java.util.Stack** (Classe nativa do Java para manipulação de pilhas)

## 💻 Como funciona o Código

O arquivo `Main.java` implementa a lógica principal:

* **`push()`**: Adiciona uma nova página ao topo da pilha (ex: Home -> Login -> Dashboard).
* **`peek()`**: Olha qual é o elemento no topo sem remover.
* **`pop()`**: Remove o elemento do topo (simula o botão "Voltar").

### Exemplo de Uso

```java
Stack<String> historicoNavegacao = new Stack<>();

// Usuário navega
historicoNavegacao.push("Home");
historicoNavegacao.push("Dashboard");

// Usuário volta
historicoNavegacao.pop(); // Remove "Dashboard"
// Agora o topo é "Home"
```

## 🛠️ Como Executar

1. Certifique-se de ter o Java instalado.

2. Clone o repositório.

3. Compile e execute a classe Main.

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)