import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
      // Como criar uma List
      List<Double> notas = new ArrayList<>();

      // Adicionando valores à List
      notas.add(7.0);
      notas.add(8.5);
      notas.add(9.3);
      notas.add(5.0);
      notas.add(7.0);
      notas.add(0.0);
      notas.add(3.6);

      // Também é possível usar o método add() indicando a posição e o elemento a ser adicionado. Ex:
      notas.add(7, 8.0);

      // Imprimindo List. Podemos usar a variável direto no System.out.print ou usando o método toString dentro do System.out.print
      // System.out.println(notas);
      System.out.println(notas.toString());

      // Para exibir a posição de determinado elemento da List, usamos o método indexOf() passando como argumento o elemento que estamos buscando.
      System.out.println("Posição do valor 9.3 na List: " + notas.indexOf(9.3));

      // Para substituir um determinado elemento, usando o método set(). Passamos como argumento a posição do elemento que queremos substituir e o novo elemento.
      System.out.println("Substituindo o valor 0.0 por 5.5: " + notas.set(notas.indexOf(0.0), 5.5));
      System.out.println(notas);

      // Para sabermos se um determinado elemento está contido em uma List usamos o método contains(). Enviamos como argumento o elemento que estamos buscando.
      System.out.println("O valor 8.5 está na List? " + notas.contains(8.5));
      System.out.println("O valor 7.2 está na List? " + notas.contains(7.2));
      
      // Para retornar o elemento existente na posição usamos o método get().
      System.out.println("Qual o elemento na posição 6 da List? " + notas.get(6));

      // Para saber o menor e o maior valor da List, usamos um método da Collections. Na Lista não possuímos nenhum método para essa comparação.
      // Collections.min() - enviando a List como argumento
      // Collections.max() - enviando a List como argumento
      System.out.println("Menor valor da List: " + Collections.min(notas));
      System.out.println("Maior valor da List: " + Collections.max(notas));

      // Método iterator. Itera sobre cada elemento da List. Podemos usar por exemplo para soma de todos os valores da List. Usamos junto com o método o hasNext() que verifica se há um próximo elemento na List e retorna true ou false e o next() para recuperar o elemento atual da iteração

      Iterator<Double> iterator = notas.iterator();
      Double soma = 0.0;

      while (iterator.hasNext()) {
        Double next = iterator.next();
        soma += next;
      }

      System.out.println("A soma da List é: " + soma);

      // Para sabermos o tamanho da List, quantos elementos temos dentro dela usamos o método size()
      // Usando método size() para mostrar a média da soma obtida anteriormente
      System.out.println("A média da soma obtida da List é: " + (soma/notas.size())); 

      // remove() - método para remover elementos da List. Passamos como argumento o elemento a ser removido ou sua posição
      notas.remove(7.0);
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

      // clear() - limpa toda a lista
      notas.clear();

      System.out.println(notas.toString());

      // isEmpty() - verifica se a List é vaia e retorna true ou false
      System.out.println("A List está vazia? " + notas.isEmpty());

    }
}
