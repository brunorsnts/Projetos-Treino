import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> placarUno = new HashMap<>();
        placarUno.put("Bruno", 0);
        placarUno.put("Alex", 0);
        placarUno.put("Renato", 0);

        // 1. Simulando que o renato ganhou a rodada e ganhou 50 pontos.
        System.out.print("Digite quem ganhou a rodada: ");
        String vencedor = sc.nextLine();
        System.out.print("Digite quantos pontos o " + vencedor + " fez: ");
        int pontos = sc.nextInt();
        placarUno.put(vencedor, pontos);

        System.out.println();
        System.out.println("--- Placar Atualizado ---");
        placarUno.forEach((key, value) -> System.out.println(key + " tem: " + value + " pontos"));
        sc.close();
    }
}
