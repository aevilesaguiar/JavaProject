package herancaEPolimorfismo.metodosAbstratos.exercicio.entities;

public class PessoaJuridica extends Contribuintes {

    private Integer numeroEmployeer;


    public PessoaJuridica(Integer numeroEmployeer) {
        this.numeroEmployeer = numeroEmployeer;
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroEmployeer) {
        super(nome, rendaAnual);
        this.numeroEmployeer = numeroEmployeer;
    }

    public Integer getNumeroEmployeer() {
        return numeroEmployeer;
    }

    public void setNumeroEmployeer(Integer numeroEmployeer) {
        this.numeroEmployeer = numeroEmployeer;
    }

    @Override
    public Double imposto() {
        if(numeroEmployeer>10){
            return getRendaAnual()*0.14;
        }else{
            return getRendaAnual()*0.16;
        }
    }
}
