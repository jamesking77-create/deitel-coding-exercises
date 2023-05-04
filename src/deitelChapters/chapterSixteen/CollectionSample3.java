package deitelChapters.chapterSixteen;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionSample3 {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"james",500_000.00);
        Customer customer1 = new Customer(2,"prof", 9000_000_000.00);
        Customer customer2 = new Customer(3, "moyin", 600_000.00);

// TODO: 4/20/2023  using set to compare objects of type customer via balance

        Set<Customer> customers = new TreeSet<>();
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        System.out.println(customers);

// TODO: 4/20/2023  using the comparator.reverseOrder method to reverse the set arrangement
        Set<Customer> customers1 = new TreeSet<>(Comparator.reverseOrder());
        customers1.add(customer);
        customers1.add(customer1);
        customers1.add(customer2);
        System.out.println(customers1);

        
// TODO: 4/20/2023 using comparator lambda to compare customer object via their id

        Comparator<Customer> comparator = (c1, c2) ->{
            if (c2.getId()> c1.getId()) return 1;
            else if (c1.getId() > c2.getId()) return  -1;
            return 0;
        };



    }
}