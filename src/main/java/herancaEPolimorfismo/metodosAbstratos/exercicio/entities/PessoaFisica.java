package herancaEPolimorfismo.metodosAbstratos.exercicio.entities;

public class PessoaFisica extends Contribuintes{

    private Double gastosSaude;

    public PessoaFisica(){

    }

    public PessoaFisica(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double imposto() {
        /*Forma Alternativa
        *  Double basicTax= (getAnualIncome()<20000.0) ? getAnualIncome()*0.15:getAnualIncome()*0.25;*/

        Double basicImposto;

        if(getRendaAnual()<20000.00){
            basicImposto= getRendaAnual()*0.15;
        }else{
            basicImposto=  getRendaAnual()*0.25;
        }
        basicImposto-=getGastosSaude()*0.5;
        if(basicImposto<0.00){
            return 0.00;
        }else{
            return basicImposto;
        }
    }
}
