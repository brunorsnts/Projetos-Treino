import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaImprimivel<Imprimivel> listaImprimivel = getListaImprimivel();
        ListaImprimivel<Pessoa> pessoas = new ListaImprimivel<>();

        Pessoa bruno = new Pessoa("Bruno", 23);
        Pessoa renato = new Pessoa("renato", 29);
        Pessoa vanessa = new Pessoa("Vanessa", 26);
        Pessoa roberto = new Pessoa("Roberto", 38);
        Pessoa ana = new Pessoa("Ana", 28);
        Pessoa alex = new Pessoa("Alex", 25);

        pessoas.adicionar(ana);
        pessoas.adicionar(bruno);
        pessoas.adicionar(renato);
        pessoas.adicionar(alex);
        pessoas.adicionar(vanessa);
        pessoas.adicionar(roberto);

        pessoas.ordenarLista(Pessoa::getNome);
        System.out.println("Lista ordenada por nome:");
        pessoas.imprimirTodos();

        System.out.println();

        System.out.println("Lista ordenada por idade:");
        pessoas.ordenarLista(Pessoa::getIdade);
        pessoas.imprimirTodos();

        listaImprimivel.buscarObjeto(bruno);

        listaImprimivel.adicionarVarios(pessoas.getList());

        listaImprimivel.imprimirTodos();
    }

    private static ListaImprimivel<Imprimivel> getListaImprimivel() {
        ListaImprimivel<Imprimivel> listaImprimivel = new ListaImprimivel<>();

        Livro livro = new Livro("A morte dos que não foram", "Pedro Bial");
        Musica musica = new Musica("Lepo Lepo", "Psirico");
        Pessoa pessoa = new Pessoa("Jorge e Matheus", 28);
        Produto produto = new Produto("Iphone 17 Pro Max", 18000.00);

        listaImprimivel.adicionar(livro);
        listaImprimivel.adicionar(musica);
        listaImprimivel.adicionar(pessoa);
        listaImprimivel.adicionar(produto);
        return listaImprimivel;
    }
}
