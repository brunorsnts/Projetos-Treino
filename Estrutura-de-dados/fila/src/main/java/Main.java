import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Queue<String> impressora = new LinkedList<>();

        // 1. Adicionando documentos na fila para serem impressos pela impressora.
        impressora.offer("Relatório.pdf");
        impressora.offer("Contrato.docx");
        impressora.offer("Foto.jpg");

        int tamanhoFila = impressora.size();

        System.out.println("-----------------------------------");
        System.out.println("Arquivos na fila para impressão:");
        for (String arquivo : impressora) {
            System.out.println(arquivo);
        }
        System.out.println("-----------------------------------");
        System.out.println();

        // 2. imprimindo os arquivos usando o paradigma FIFO
        for (int i = 0; i < tamanhoFila; i++) {
            System.out.println("Imprimindo: " + impressora.peek() + "...");
            Thread.sleep(2000);
            System.out.println(impressora.peek() + " impresso");
            impressora.poll();
            System.out.println();
        }

        sc.close();
    }
}
