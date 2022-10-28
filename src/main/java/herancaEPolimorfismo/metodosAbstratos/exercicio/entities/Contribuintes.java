package herancaEPolimorfismo.metodosAbstratos.exercicio.entities;

public abstract class Contribuintes {


    private String nome;
    private Double rendaAnual;

    public Contribuintes(){

    }

    //quando eu uso this ele serve para diferenciar o que é o argumetno interno do método e o que é o atributo da classe
    //quando uso o this estou me referenciado o atributo da classe e não o argumento
    public Contribuintes(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    //as regras serão implementadas em cada Classe, pois elas possuem regras diferentes
    public abstract Double imposto() ;
}
