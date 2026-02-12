import com.bruno.fastfood.model.Bebida;
import com.bruno.fastfood.model.Cozinha;
import com.bruno.fastfood.model.ItemVenda;
import com.bruno.fastfood.model.Lanche;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cozinha cozinha = new Cozinha();
        List<ItemVenda> cardapio = new ArrayList<>();
        cardapio.add(new Lanche("X-Burguer", 15.00));
        cardapio.add(new Lanche("X-Costela", 22.00));
        cardapio.add(new Lanche("X-Tudo", 10.00));
        cardapio.add(new Lanche("Misto Quente", 13.00));
        cardapio.add(new Bebida("Coca-Cola", 8.00));
        cardapio.add(new Bebida("Fanta Laranja", 7.00));
        cardapio.add(new Bebida("Fanta Uva", 7.00));
        cardapio.add(new Bebida("Guaraná antártica", 8.00));
        cardapio.add(new Bebida("Pepsi", 5.00));
        cardapio.add(new Bebida("Água Mineral", 3.00));


        boolean continuar = true;
        do {
            exibirMenu();
            System.out.print("Faça o seu pedido: ");
            int opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {

                case (1):
                    exibirMenuComida();
                    System.out.print("Qual lanche você deseja: ");
                    opcao = sc.nextInt();
                    List<ItemVenda> lanches = cardapio.subList(0, 4);
                    cozinha.receberPedido(lanches.get(opcao - 1));
                    break;

                case (2):
                    exibirMenuBebidas();
                    System.out.print("Qual bebida você deseja: ");
                    List<ItemVenda> bebidas = cardapio.subList(4, 10);
                    opcao = sc.nextInt();
                    cozinha.receberPedido(bebidas.get(opcao - 1));
                    break;

                default:
                    System.out.println("Opção inválida");
            }

            System.out.println();
            System.out.println("Deseja fazer outro pedido? ");
            System.out.println("[ 1 ] SIM");
            System.out.println("[ 2 ] SAIR");
            System.out.print("Selecione a opção: ");
            opcao = sc.nextInt();
            if (opcao == 2) {
                continuar = false;
            }
        } while (continuar);

        System.out.println();
        System.out.println("Os seus pedidos são: ");
        cozinha.exibirPedidosPendentes();
        System.out.println();

        cozinha.getPedidosPendentes().forEach(item -> cozinha.prepararProximoPedido());
        sc.close();
    }

    private static void exibirMenu() {
        System.out.println();
        System.out.println("---RioFood---");
        System.out.println("""
                [ 1 ] Lanche
                [ 2 ] Bebida""");
        System.out.println("-----------------");
    }

    private static void exibirMenuBebidas() {
        System.out.println("""
                        ---Bebidas---
                        [ 1 ] Coca-Cola
                        [ 2 ] Fanta Laranja
                        [ 3 ] Fanta Uva
                        [ 4 ] Guaraná antártica
                        [ 5 ] Pepsi
                        [ 6 ] Água Mineral""");
    }

    private static void exibirMenuComida() {
        System.out.println("""
                ---Lanches---
                [ 1 ] X-Burguer
                [ 2 ] X-Costela
                [ 3 ] X-Tudo
                [ 4 ] Misto Quente
                """);
    }
}