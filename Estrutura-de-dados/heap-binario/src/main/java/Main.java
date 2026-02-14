import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] heap = {90, 80, 70, 50, 60, 100};

        int indiceAtual = 5; // Começamos olhando para o 100

        System.out.println("Antes: " + Arrays.toString(heap));

        while (indiceAtual > 0) {

            int indicePai = (indiceAtual - 1) / 2;

            if (heap[indiceAtual] > heap[indicePai]) {

                System.out.println("Trocando " + heap[indiceAtual] + " com o pai " + heap[indicePai]);

                int temp = heap[indiceAtual];
                heap[indiceAtual] = heap[indicePai];
                heap[indicePai] = temp;


                indiceAtual = indicePai;


            } else {
                break;
            }
        }

        System.out.println("Depois: " + Arrays.toString(heap));
    }
}