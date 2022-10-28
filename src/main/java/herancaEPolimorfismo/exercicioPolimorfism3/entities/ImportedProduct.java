package herancaEPolimorfismo.exercicioPolimorfism3.entities;

public class ImportedProduct extends  Product{
    private Double customsFee;

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.priceTag() + " " + customsFee;
    }


}
