import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
      Set<Serie> minhasSeries = new HashSet<>(){{
        add(new Serie("dark", "drama", 60));
        add(new Serie("suits", "investigação", 60));
        add(new Serie("good doctor", "fatos reais", 40));
      }}; 

      System.out.println("Set na Ordem aleatoria");
      for (Serie serie : minhasSeries) {
        System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpisodio());
      }

      System.out.println("Set na ordem de Inserçao");
      Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
        add(new Serie("dark", "drama", 60));
        add(new Serie("suits", "investigação", 60));
        add(new Serie("good doctor", "fatos reais", 40));
      }};

      for (Serie serie : minhasSeries2) {
        System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpisodio());
      }

      System.out.println("Ordem de Natural - Tempo de episodio ");
      Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
      for (Serie serie : minhasSeries3) {
        System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpisodio());
      }

      System.out.println("Ordem Nome/Genero/Tempo de Episodio");
      Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
      minhasSeries4.addAll(minhasSeries);
      for (Serie serie : minhasSeries4) {
        System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpisodio());
      }

      System.out.println("Ordem de Genero");
      Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
      minhasSeries5.addAll(minhasSeries);
      for (Serie serie : minhasSeries4) {
        System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpisodio());
      }
      
      
    }
}
