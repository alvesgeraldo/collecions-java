import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
      
      // Como criar uma Set
      Set<Double> notas = new HashSet<>();

      // Adicionando valores à Set
      notas.add(7.0);
      notas.add(8.5);
      notas.add(9.3);
      notas.add(5.0);
      notas.add(7.0);// No Set não pode haver valores duplicados, logo mesmo repetindo o 7.0 ele não é adicionado.
      notas.add(0.0);
      notas.add(3.6);

      // HashSet coloca os elementos em ordem aleatória, não na sequência em que forma adicionados. Para colocarmos na sequência em que foram adicionados usamos o LinkedHashSet
      Set<Double> notas2 = new LinkedHashSet<>();

      notas2.add(7.0);
      notas2.add(8.5);
      notas2.add(9.3);
      notas2.add(5.0);
      notas2.add(7.0);
      notas2.add(0.0);
      notas2.add(3.6);

      // Para colocar os elementos adicionados em ordem crescente, usamos o TreeSet
      Set<Double> notas3 = new TreeSet<>();

      notas3.add(7.0);
      notas3.add(8.5);
      notas3.add(9.3);
      notas3.add(5.0);
      notas3.add(7.0);
      notas3.add(0.0);
      notas3.add(3.6);

      // Na Set não possui índice, logo não podemos usar o add() para adicionar o elemento em uma posição específica. Ex: notas.add(7, 8.0);
      // Também não temos o método indexOf(), que retorna o índice 
      // Também não temos o método set(), que substitui o elemento por outro indicando sua posição como argumento e o novo elemento
      // Também não temos o método get(), que retorna o elemento no índice indicado como argumento

      // Imprimindo Set. Podemos usar a variável direto no System.out.print ou usando o método toString dentro do System.out.print
      // System.out.println(notas);
      System.out.println("Set com HashSet");
      System.out.println(notas.toString());

      System.out.println("Set com LinkedHashSet");
      System.out.println(notas2.toString());

      System.out.println("Set com TreeSet");
      System.out.println(notas3.toString());

      // Para sabermos se um determinado elemento está contido em uma Set, usamos o método contains(). Enviamos como argumento o elemento que estamos buscando. O retorno é um boolean true ou false
      System.out.println("O valor 8.5 está na List? " + notas.contains(8.5));
      System.out.println("O valor 7.2 está na List? " + notas.contains(7.2));
      
      // Para saber o menor e o maior valor da Set, usamos um método da Collections. No Set não possuímos nenhum método para essa comparação.
      // Collections.min() - enviando a Set como argumento
      // Collections.max() - enviando a Set como argumento
      System.out.println("Menor valor da List: " + Collections.min(notas));
      System.out.println("Maior valor da List: " + Collections.max(notas));

      // Método iterator(). O uso na Set é similar ao da List.

      Iterator<Double> iterator = notas.iterator();
      Double soma = 0.0;

      while (iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
      }

      System.out.println("A soma da Set é: " + soma);

      // Para sabermos o tamanho da Set, quantos elementos temos dentro dela usamos o método size()
      // Usando método size() para mostrar a média da soma obtida anteriormente
      System.out.println("A média da soma obtida da Set é: " + (soma/notas.size())); 

      // remove() - método para remover elementos da Set. Passamos como argumento o elemento a ser removido
      notas.remove(0.0);
      System.out.println(notas.toString());

      // remove() pode ser usado também no iterator() para remover valores que satisfação uma condição. Ex: Remover todos os elementos menores que 7.0

      Iterator<Double> iterator2 = notas.iterator();

      while (iterator2.hasNext()) {
        Double next = iterator2.next();
        if (next < 7) {
          iterator2.remove();
        }
      }

      System.out.println(notas.toString());

      // clear() - limpa toda a Set
      notas.clear();

      System.out.println(notas.toString());

      // isEmpty() - verifica se a Set é vaia e retorna true ou false
      System.out.println("A Set notas está vazia? " + notas.isEmpty());
      System.out.println("A Set notas2 está vazia? " + notas2.isEmpty());

    }
}
