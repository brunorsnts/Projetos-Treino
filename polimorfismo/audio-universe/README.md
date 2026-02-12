# 🎵 Audio Universe

Este projeto é uma aplicação Java desenvolvida para simular um sistema de streaming de áudios, focado na modelagem de músicas e podcasts.

O principal objetivo deste repositório foi colocar em prática os **4 Pilares da Programação Orientada a Objetos (POO)**.

## 🧠 Conceitos Praticados

O projeto foi estruturado para exercitar intencionalmente os seguintes fundamentos:

### 1. Herança (Inheritance)
Criação de uma hierarquia de classes para evitar repetição de código.
- A classe **`Audio`** serve como classe mãe.
- As classes **`Music`** e **`Podcast`** herdam atributos (título, duração, total de reproduções) e métodos (curtir, reproduzir) da classe mãe.

### 2. Polimorfismo (Polymorphism)
Capacidade de um método ter comportamentos diferentes dependendo do objeto que o invoca.
- O método **`getClassification()`** foi sobrescrito (`@Override`).
- Para **Músicas**, a classificação de sucesso depende de um número X de reproduções.
- Para **Podcasts**, a classificação depende de um número Y de curtidas.

### 3. Encapsulamento (Encapsulation)
Proteção dos dados internos da aplicação.
- Atributos sensíveis como `totalReproduction` e `likes` são privados (`private`).
- O acesso e modificação desses dados são feitos estritamente através de métodos públicos (Getters e Setters) ou métodos de negócio (ex: `like()`, `reproduce()`), garantindo a integridade do objeto.

### 4. Abstração (Abstraction)
Foco em modelar apenas o essencial das entidades do mundo real.
- A classe `Audio` abstrai o conceito genérico de algo ouvível, enquanto as subclasses lidam com as especificidades (como "Cantor" para música ou "Apresentador" para podcast).

---

## 🛠️ Tecnologias Utilizadas

- **Java JDK 17**: Linguagem principal.
- **Maven**: Gerenciamento de dependências e estrutura do projeto.
- **IntelliJ IDEA**: IDE utilizada para desenvolvimento.
- **Git/GitHub**: Controle de versão.

## 📂 Estrutura do Projeto

```text
src/main/java/br/com/bruno/audiouniverse/
├── model/
│   ├── Audio.java       # Classe Base
│   ├── Music.java       # Subclasse especializada
│   ├── Podcast.java     # Subclasse especializada
│   └── MyFavorits.java  # Lógica de classificação
└── Main.java            # Classe principal para execução e testes
```

## 🚀 Como Executar

1. Clone o repositório:
   ```bash
   git clone [https://github.com/brunorsnts/audio-universe.git](https://github.com/brunorsnts/audio-universe.git)
    ```

1. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ, VS Code).
2. Certifique-se de que o Maven importou as dependências corretamente.
3. Execute a classe `Main.java`.

---

Developed by [Bruno Santos](https://github.com/brunorsnts)