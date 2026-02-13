import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println();
        System.out.println("---Representação de uma Estruutra de dados em árvore---");
        NoArvore noRaiz = new NoArvore(10);
        NoArvore noFilhoEsquerda = new NoArvore(5);
        NoArvore noFilhoDireita = new NoArvore(15);

        noRaiz.esquerda = noFilhoEsquerda;
        noRaiz.direita = noFilhoDireita;

        System.out.println(" ".repeat(10) + noRaiz.valor);
        System.out.print(" ".repeat(9) + "/");
        System.out.println(" ".repeat(2) + "\\");
        System.out.print(" ".repeat(8) + noRaiz.esquerda);
        System.out.print(" ".repeat(4) + noRaiz.direita);



    }
}

class NoArvore {
    int valor;
    NoArvore esquerda;
    NoArvore direita;

    public NoArvore(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
