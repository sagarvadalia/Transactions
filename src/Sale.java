//Code written by sagar vadalia
public class Sale extends Transactions{
    private double _price;
    private int _quantity;

    public Sale(String name, double price, int quantity) {
        super(name);
        this._price = price;
        this._quantity = quantity;
    }

    public void set_price(double price) {
        if(_price > 0){
            this._price = price;
        }

    }

    public void set_quantity(int quantity) {
        if(quantity > 0){
            this._quantity = quantity;
        }

    }
    @Override
    public String toString() {
        return super.toString() + " Sale " + "the quantity is: " + this._quantity + " the price is: " + this._price;
    }
    @Override
    public double calculateAmount() {
        double taxedPrice  = this._price * 1.08625;
        return this._quantity * taxedPrice;
    }

}
