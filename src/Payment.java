//Code written by sagar vadalia
public class Payment extends Transactions {
    private double _payAmount;
    public Payment(String name, double amount){
        super(name);
        this._payAmount = amount;
    }

    public void set_payAmount(double payAmount) {
        if(_payAmount > 0){
            this._payAmount = payAmount;
        }

    }
    @Override
    public double calculateAmount() {
        return this._payAmount;
    }
    @Override
    public String toString() {
        return super.toString() + " Payment " + " the pay amount is: "  + this._payAmount;
    }
}
