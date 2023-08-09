package academy.multiclass_BAD_QUESTION;

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;

    private double bill;

    public double getBill() {
        return bill;
    }

    //line n1

    public void addKWh(double kWh) {
        if (kWh > 0) {
            this.kWh += kWh;
            setBill(this.kWh);
        }
    }

    public void setBill(double kWh){
        bill = kWh* rate;
    }
}
