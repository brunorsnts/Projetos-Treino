public class Main {
    public static void main(String[] args) throws InterruptedException {

        No no1 = new No("Vagão Locomotiva");
        No no2 = new No("Vagão de Carga");
        No no3 = new No("Vagão de Passageiros");

        no1.proximo = no2;
        no2.proximo = no3;
        no3.proximo = null;

        No vagaoAtual = no1;

        while (vagaoAtual != null) {
            System.out.println("Atualmente estou no " + vagaoAtual);
            vagaoAtual = vagaoAtual.proximo;
        }

    }
}

class No {

    String valor;
    No proximo;

    public No(String valor) {
        this.valor = valor;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return valor;
    }
}
