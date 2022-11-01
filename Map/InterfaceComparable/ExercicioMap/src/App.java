import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class App {
    public static void main(String[] args) throws Exception {
      // Estado = PE - População = 9.616.621
      // Estado = AL - População = 3.351.543
      //  Estado = CE - População = 9.187.103   
      // Estado = RN - População = 3.534.265

      System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
      Map<String, Integer> estadosNordeste = new HashMap<>(){{
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }};

      for (Map.Entry<String, Integer> estado : estadosNordeste.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }

      System.out.println("Substitua a população do estado do RN por 3.534.165: ");
      estadosNordeste.put("RN", 3534165);

      for (Map.Entry<String, Integer> estado : estadosNordeste.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }

      System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
      System.out.println("O estado PB está no dicionário? " + estadosNordeste.containsKey("PB"));
      estadosNordeste.put("PB", 4039277);

      for (Map.Entry<String, Integer> estado : estadosNordeste.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }

      System.out.println("Exiba a população PE: " + estadosNordeste.get("PE"));

      System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
      Map<String, Integer> estadosNordeste1 = new LinkedHashMap<>(){{
        put("PE", 9616621);
        put("AL", 3351543);
        put("CE", 9187103);
        put("RN", 3534265);
      }};
      for (Map.Entry<String, Integer> estado : estadosNordeste1.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }

      System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
      Map<String, Integer> estadosNordeste2 = new TreeMap<>(estadosNordeste1);
      for (Map.Entry<String, Integer> estado : estadosNordeste2.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }
      
      System.out.println("Exiba o estado com o menor população e sua quantidade: ");
      Integer menorPopulacao = Collections.min(estadosNordeste2.values());
      String estadoMenorPopulacao = "";
      Set<Entry<String, Integer>> entrySet = estadosNordeste2.entrySet();
      
      for (Entry<String,Integer> entry : entrySet) {
        if (entry.getValue().equals(menorPopulacao)) {
          estadoMenorPopulacao = entry.getKey();
        }
      }
      
      System.out.println("Estado: " + estadoMenorPopulacao + " - População: " + menorPopulacao);
      
      System.out.println("Exiba o estado com a maior população e sua quantidade: ");
      Integer maiorPopulacao = Collections.max(estadosNordeste2.values());
      String estadoMaiorPopulacao = "";
      
      for (Entry<String,Integer> entry : entrySet) {
        if (entry.getValue().equals(maiorPopulacao)) {
          estadoMaiorPopulacao = entry.getKey();
        }
      }
      
      System.out.println("Estado: " + estadoMaiorPopulacao + " - População: " + maiorPopulacao);

      Iterator<Integer> iterator = estadosNordeste2.values().iterator();
      Integer soma = 0;

      while (iterator.hasNext()) {
        soma += iterator.next();
      }
      System.out.println("Exiba a soma da população desses estados: " + soma);

      System.out.println("Exiba a média da população deste dicionário de estados " + soma/estadosNordeste2.size());

      
      for (Map.Entry<String, Integer> estado : estadosNordeste2.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }
      
      Iterator<Integer> iterator2 = estadosNordeste2.values().iterator();
      
      while (iterator2.hasNext()) {
        if (iterator2.next() < 4000000) {
          iterator2.remove();
        }
      }
      
      System.out.println("Remova os estados com a população menor que 4.000.000: ");
      for (Map.Entry<String, Integer> estado : estadosNordeste2.entrySet()) {
        System.out.println("Estado: " + estado.getKey() + " - População: " + estado.getValue());        
      }

      System.out.println("Apague o dicionário de estados: ");
      estadosNordeste2.clear();

      System.out.println("Confira se o dicionário está vazio: " + estadosNordeste2.isEmpty());

    }
}
