public class Serie implements Comparable<Serie>{
  
  private String nome;
  private String genero;
  private Integer tempoEpisodio;
  
  public Serie(String nome, String genero, Integer tempoEpisodio) {
    this.nome = nome;
    this.genero = genero;
    this.tempoEpisodio = tempoEpisodio;
  }

  public String getNome() {
    return nome;
  }

  public String getGenero() {
    return genero;
  }

  public Integer getTempoEpisodio() {
    return tempoEpisodio;
  }

  @Override
  public int compareTo(Serie serie) {
    
    int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    if(tempoEpisodio != 0) return tempoEpisodio;
    
    return this.getGenero().compareToIgnoreCase(serie.getGenero());
    
  }

  
}
