package interfaces.defaultMehods.services;

public class UsaInterestService implements InteresrService {
    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
