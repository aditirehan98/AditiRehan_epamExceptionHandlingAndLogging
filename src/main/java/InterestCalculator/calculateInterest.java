package InterestCalculator;

public class calculateInterest {
    public double calculateSi(int p,double r,int t) throws InvalidException
    {
        double ans= (double) ((p*r*t)/100);
        return ans;
    }
    public double calculateCi(int p,double r,int t) throws InvalidException{
        double amount = p * Math.pow(1 + (r / 100),  t);
        double cinterest = amount - p;
        return cinterest;
    }
}
