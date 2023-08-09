package academy.multiclass_BAD_QUESTION;

public class Customer {
    ElectricAccount account = new ElectricAccount();
    public  void useElictricity(double kWh){
        account.addKWh(kWh);
    }

    public static void main(String[] args) {
        Customer c = new Customer();
        c.useElictricity(-10);
        System.out.println(c.account.getBill());
    }
}
