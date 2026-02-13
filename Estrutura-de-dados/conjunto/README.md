# Simulação de Totem de Lanchonete - Estudo de Sets (Conjuntos)

Este projeto demonstra a utilização da estrutura de dados **Set (Conjunto)** em Java, aplicando-a a um cenário real de regras de negócio num totem de autoatendimento de uma lanchonete (fast-food).

## 📝 Descrição

No sistema de pedidos, existe uma regra de negócio clara: **os adicionais de um hambúrguer devem ser únicos**. Um cliente impaciente pode clicar várias vezes no botão "Adicionar Bacon", mas o sistema deve registar esse item apenas uma vez.

Para resolver este problema, utilizamos a estrutura `HashSet`, que por natureza não permite elementos duplicados, garantindo a integridade do pedido sem necessidade de criar validações manuais complexas (como laços `if/else` para verificar se o item já existe).

## 🚀 Tecnologias Utilizadas

* **Java 17**
* **java.util.Set** (Interface que define uma coleção sem duplicatas)
* **java.util.HashSet** (Implementação focada em alta performance)

## 💻 Como funciona o Código

O ficheiro `Main.java` demonstra o seguinte fluxo:

1.  **Criação do Conjunto:** Instanciação de um `Set<String>` utilizando `HashSet`.
2.  **Tentativa de Duplicação:** O sistema tenta adicionar "Bacon" e "Cheddar" múltiplas vezes.
3.  **Resultado Automático:** O método `.size()` confirma que apenas 3 itens únicos ("Bacon", "Cheddar", "Cebola") foram realmente armazenados.

### Exemplo de Saída Esperada

*(Nota: O `HashSet` não garante a ordem dos elementos impressos)*

```text
Quantidade de itens adicionais: 3

----Adicionais----
Bacon
Cebola
Cheddar
```

Desenvolvido por [Bruno Santos](https://github.com/brunorsnts)