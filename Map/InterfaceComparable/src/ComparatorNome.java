import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

  @Override
  public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
    return livro1.getValue().getNome().compareToIgnoreCase(livro2.getValue().getNome());
  }
  
}
