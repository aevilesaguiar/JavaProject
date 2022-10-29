package interfaces.defaultMehods.services;

public class BrazilInterestService implements InteresrService {
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
