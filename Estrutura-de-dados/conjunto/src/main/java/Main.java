import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        /* Cenário: Totem de autoatendimento de uma lanchonete.
        Às vezes, o cliente é impaciente e clica três vezes seguidas no botão
        "Adicionar Bacon" no mesmo hambúrguer, mas a regra de negócio diz que os
        adicionais devem ser únicos por lanche (ou tem Bacon, ou não tem).
         */

        Set<String> adicionais = new HashSet<>();

        adicionais.add("Bacon");
        adicionais.add("Cheddar");
        adicionais.add("Bacon");
        adicionais.add("Cebola");
        adicionais.add("Cheddar");

        System.out.println("\nQuantidade de itens adicionais: " + adicionais.size());
        System.out.println();
        System.out.println("----Adicionais----");
        adicionais.forEach(System.out::println);

    }
}
