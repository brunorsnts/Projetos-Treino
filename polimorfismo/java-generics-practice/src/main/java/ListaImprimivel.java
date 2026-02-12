import java.util.*;
import java.util.function.Function;

public class ListaImprimivel<T extends Imprimivel> {

    private List<T> list = new ArrayList<>();

    public List<T> getList() {
        return list;
    }

    public void adicionar(T objeto) {
        list.add(objeto);
    }

    public void adicionarVarios(List<? extends T> listaNova) {
        this.list.addAll(listaNova);
    }

    public void imprimirTodos() {
        list.forEach(Imprimivel::imprimir);
    }

    public void buscarObjeto(T objeto) {
        if (list.contains(objeto)) System.out.println(objeto);
        else System.out.println("O objeto não existe!");
    }

    public <U extends Comparable<U>> void ordenarLista(Function<T, U> keyExtractor) {
        list.sort(Comparator.comparing(keyExtractor));
    }
}
