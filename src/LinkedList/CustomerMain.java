package LinkedList;

import java.util.ArrayList;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Su", 10.20);
        Customer customer2;
        customer2 = customer1;
        customer2.setBalance(100.20);
        System.out.println("Balance for customer 1 " + customer1.getBalance());
        System.out.println("Balance for customer 2 " + customer2.getBalance());


        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1, 10);
        intList.remove(2);
        for(int i = 0; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }
    }
}
