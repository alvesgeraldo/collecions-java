import java.util.Comparator;

public class ComparatorNome implements Comparator<Serie>{

  @Override
  public int compare(Serie s1, Serie s2) {
    return s1.getNome().compareToIgnoreCase(s2.getNome());
  }
  
}
