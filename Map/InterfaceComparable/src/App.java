import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
      Map<String, Livro> meusLivros = new HashMap<>(){{
        put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
        put("Duhigg, Charles", new Livro("O poder do hábito", 408));
        put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
      }};

      System.out.println("Exibir em ordem aleatória: ");
      
      for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
        System.out.println("Nome autor: " + livro.getKey() + " - Nome Livro: " + livro.getValue().getNome());
      }

      System.out.println("Exibir na ordem de inserção: ");
      Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
        put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
        put("Duhigg, Charles", new Livro("O poder do hábito", 408));
        put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
      }};

      for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
        System.out.println("Nome autor: " + livro.getKey() + " - Nome Livro: " + livro.getValue().getNome());
      }

      System.out.println("Exibir na ordem Nome Autor: ");

      Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
      for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
        System.out.println("Nome autor: " + livro.getKey() + " - Nome Livro: " + livro.getValue().getNome());
      }

      System.out.println("Exibir na ordem Nome do Livro: ");
      Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
      meusLivros3.addAll(meusLivros.entrySet());

      for (Map.Entry<String,Livro> livro : meusLivros3) {
        System.out.println("Nome autor: " + livro.getKey() + " - Nome Livro: " + livro.getValue().getNome());
      }

      System.out.println("Exibir na ordem do Número de páginas: ");
      Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
      meusLivros4.addAll(meusLivros.entrySet());

      for (Map.Entry<String,Livro> livro : meusLivros4) {
        System.out.println("Nome autor: " + livro.getKey() + " - Nome Livro: " + livro.getValue().getNome() + " - " + livro.getValue().getPaginas());
      }
    }
}
