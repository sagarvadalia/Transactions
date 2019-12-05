//Code written by sagar vadalia

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Transactions> transactions = new ArrayList<Transactions>();
        Payment payment = new Payment("Sagar", 3.0);
        Sale sale = new Sale("rob", 3.5, 5);
        Payment payment2 = new Payment("bob", 6);
        Sale sale2 = new Sale("roger", 12, 3);
        transactions.add(payment);
        transactions.add(sale);
        transactions.add(payment2);
        transactions.add(sale2);
        for (Transactions transaction: transactions) {
            System.out.println(transaction.toString());
            System.out.println(transaction.calculateAmount());
        }

    }
}
