import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Gato> meusGatos = new ArrayList<>();

        meusGatos.add(new Gato("Ninha", 25, "Preto com branco"));
        meusGatos.add(new Gato("Jon", 12, "Amarelo"));
        meusGatos.add(new Gato("Simba", 6, "Cinza"));
        meusGatos.add(new Gato("Jon", 18, "Tigrado"));

        // Apresentando a List por ordem de inserção
        System.out.println("Ordem de Inserção");
        System.out.println(meusGatos);

        // Apresentando com ordenação aleatória
        Collections.shuffle(meusGatos);
        System.out.println("Ordem Aleatória");
        System.out.println(meusGatos);

        // Apresentando por ordem de nome
        Collections.sort(meusGatos);
        System.out.println("Ordem de Nome");
        System.out.println(meusGatos);

        // Apresentando por ordem de idade
        meusGatos.sort(new ComparatorIdade());
        System.out.println("Ordem de Idade");
        System.out.println(meusGatos);

        // Apresentando por ordem de Cor
        Collections.sort(meusGatos, new ComparatorCor());
        System.out.println("Ordem de Cor");
        System.out.println(meusGatos);

        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println("Ordem Nome/Cor/Idade");
        System.out.println(meusGatos);
    }
}
