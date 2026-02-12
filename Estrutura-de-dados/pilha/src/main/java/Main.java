import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Stack<String> historicoNavegacao = new Stack<>();

        // 1. Histórico de navegação do usuário
        historicoNavegacao.push("Home");
        historicoNavegacao.push("Página de Login");
        historicoNavegacao.push("Dashboard");

        System.out.println("Você está na página de " + historicoNavegacao.peek());

        // 2. Usuário clica no botão voltar
        System.out.print("Pressione enter para voltar...");
        sc.nextLine();
        System.out.println("Voltando...");
        historicoNavegacao.pop();
        Thread.sleep(2000);
        System.out.println("Você agora está na página: " + historicoNavegacao.lastElement());



        sc.close();
    }
}
