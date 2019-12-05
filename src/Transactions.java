//Code written by sagar vadalia
public abstract class Transactions {
    private String _name;
    public Transactions(String name){
        this._name = name;
    }
    public void setCustomerName(String name) {
        this._name = name;
    }
    public String toString() {
        return "Your customer name is: " + this._name;
    }
    public abstract double calculateAmount();
}
