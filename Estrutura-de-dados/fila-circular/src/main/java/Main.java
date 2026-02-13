public class Main {
    public static void main(String[] args) throws InterruptedException {

        String[] servidores = {"Servidor A", "Servidor B", "Servidor C"};
        int ponteiro = 0;

        for (int i = 1; i <= 10; i++) {
            String requisicao = "Requisição " + i;
            System.out.println(requisicao + " chegando. Procurando por um servidor disponível para atendê-la...");
            Thread.sleep(2000);
            System.out.println("Enviando para o " + servidores[ponteiro] + "...");
            Thread.sleep(2000);
            System.out.println("O " + servidores[ponteiro] + " está processando a requisição...");
            Thread.sleep(2000);
            System.out.println("Processamento concluído");
            ponteiro = (ponteiro + 1) % servidores.length;
            System.out.println();
        }

    }
}
