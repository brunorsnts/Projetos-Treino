import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> redeSocial = new HashMap<>();

        List<String> amigosBruno = new ArrayList<>();
        List<String> amigosAlex = new ArrayList<>();
        List<String> amigosRenato = new ArrayList<>();

        // O Bruno é amigo do Alex e do Renato
        amigosAlex.add("Bruno");
        amigosRenato.add("Bruno");

        // O alex e o Renato são amigos do Bruno
        amigosBruno.add("Alex");
        amigosBruno.add("Renato");

        redeSocial.put("Bruno", amigosBruno);
        redeSocial.put("Alex", amigosAlex);
        redeSocial.put("Renato", amigosRenato);

        redeSocial.forEach((usuario, amigos) -> System.out.println("O " + usuario +
                " tem como amigos: " + amigos));
    }
}