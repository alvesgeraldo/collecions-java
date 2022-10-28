import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
        
      // Criando um Map
      Map<String, Double> carrosPopulares = new HashMap<>();
      
      // Adicionando elementos key, value
      carrosPopulares.put("gol", 14.4);
      carrosPopulares.put("uno", 15.6);
      carrosPopulares.put("mobi", 16.1);
      carrosPopulares.put("hb20", 14.5);
      carrosPopulares.put("kwid", 15.6);

      // Imprimindo Map
      System.out.println(carrosPopulares.toString());

      // Alterando um valor. Utilizamos o mesmo metodo de adicionar put() que ir sobrescrever o valor ja armazenado nessa key
      carrosPopulares.put("gol", 15.2);
      System.out.println("Substituindo o valor armazenado na key: gol por 15.2");
      System.out.println(carrosPopulares);
      
      // Para verificar se existe uma key na Map, usamos o metodo containsKey() passando como argumento a key
      System.out.println("A tucson esta no Map? " + carrosPopulares.containsKey("tucson"));

      // Para retornar o valor armazenado em uma key
      System.out.println("O consumo do uno: " + carrosPopulares.get("uno"));

      // Para retornar todas as key, usamos o metodo keySet() que retorna uma Set 
      Set<String> modelos = carrosPopulares.keySet();
      System.out.println("Exiba todos os modelos: ");
      System.out.println(modelos);

      // Para retornar todos os value, usamos o metodo values() que retorna uma Collection
      Collection<Double> consumos = carrosPopulares.values();
      System.out.println("Exiba todos os consumos: ");
      System.out.println(consumos);

      Double melhorConsumo = Collections.max(carrosPopulares.values());
      Set<Entry<String, Double>> entrySet = carrosPopulares.entrySet();
      String modeloMelhorConsumo = "";

      for (Entry<String,Double> entry : entrySet) {
        if(entry.getValue().equals(melhorConsumo)){
          modeloMelhorConsumo = entry.getKey();
          System.out.println("Modelo de melhor consumo: " + modeloMelhorConsumo + " - " + melhorConsumo);
        }
      }
    }
}
