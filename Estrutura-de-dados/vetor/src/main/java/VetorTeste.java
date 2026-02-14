public class VetorTeste {
    public static void main(String[] args) {

        // 1. Inicialização dos dados de teste
        Aluno aluno1 = new Aluno("Bruno");
        Aluno aluno2 = new Aluno("Alexander");
        Aluno aluno3 = new Aluno("Renato");

        // Cria a instância do nosso Vetor Dinâmico
        Vetor vetor = new Vetor();

        // 2. Testando a inserção básica e o tamanho do vetor
        System.out.println("Tamanho inicial: " + vetor.tamanho()); // Esperado: 0

        vetor.adiciona(aluno1);
        System.out.println("Tamanho após 1ª inserção: " + vetor.tamanho()); // Esperado: 1

        vetor.adiciona(aluno2);
        System.out.println("Tamanho após 2ª inserção: " + vetor.tamanho()); // Esperado: 2

        // 3. Testando o método toString() (Visualizar o array inteiro)
        System.out.println("\nVetor atual:");
        System.out.println(vetor); // Vai imprimir [Bruno, Alexander, null, null...]

        // 4. Testando a busca (método contem)
        System.out.println("\nVerificando se os alunos existem no vetor:");
        System.out.println("Contém aluno1 (Bruno)? " + vetor.contem(aluno1)); // Esperado: true
        System.out.println("Contém aluno3 (Renato)? " + vetor.contem(aluno3)); // Esperado: false (ainda não foi adicionado)

        // 5. Testando a busca por posição (método pega)
        System.out.println("\nPegando o aluno na posição 1:");
        System.out.println(vetor.pega(1)); // Esperado: Alexander

        // 6. Testando a inserção em uma posição específica (o deslocamento/shift)
        System.out.println("\nAntes de inserir o Renato na posição 1:");
        System.out.println(vetor);

        // Empurra o Alexander para a direita e coloca o Renato na posição 1
        vetor.adiciona(aluno3, 1);

        System.out.println("Depois de inserir o Renato na posição 1:");
        System.out.println(vetor);

        // 7. Testando a remoção de um elemento
        System.out.println("\nRemovendo o aluno da posição 0 (Bruno):");
        vetor.remove(0); // Puxa o Renato e o Alexander para a esquerda
        System.out.println(vetor);

        // 8. Teste de Stress: Verificando o redimensionamento dinâmico (garanteEspaco)
        System.out.println("\nIniciando teste de redimensionamento dinâmico...");
        System.out.println("Adicionando 300 alunos (o array inicial só tinha 100 espaços)...");

        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Joao" + i);
            vetor.adiciona(y);
        }

        // Se chegar aqui sem dar erro (ArrayIndexOutOfBoundsException),
        // significa que o array cresceu automaticamente com sucesso!
        System.out.println("Tamanho final após o loop: " + vetor.tamanho());
    }
}