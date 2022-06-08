import java.util.ArrayList;

public class TestOrder {
    public static void main(String[] args) {
        // Order order = new Order();
        // Item item = new Item();
    
        Item item1 = new Item("latte", 13.00);
        Item item2 = new Item("Cold blew", 4.00);
        Item item3 = new Item("cuppiechicko", 7.00);
        Item item4 = new Item("Mocha", 8.45);
        // System.out.println(item1.getName());

        // Item item2 = new Item();
        // item2.name = "latte";
        // item2.price = 5.50;

        // Item item3 = new Item();
        // item3.name = "drippy coffee";
        // item3.price = 8.47;

        // Item item4 = new Item();
        // item4.name = "capuccino";
        // item4.price = 19.50;
    
        // // Order variables -- order1, order2 etc.
        Order order1 = new Order("Cindhuccie");
        order1.addItem(item1);
        order1.addItem(item2);
        order1.display();

        Order order2 = new Order("Jimbobo");
        order2.addItem(item4);
        order2.addItem(item3);
        order2.setReady (true);
        order2.display();

        Order order6 = new Order();
        order6.addItem(item1);
        order6.addItem(item2);
        order6.display();
        // Order order2 = new Order();
        // order2.name = "Jimbo";
        


        // Order order3 = new Order();
        // order3.name = "kNoah";

        // Order order4 = new Order();
        // order4.name = "Samuelito";


        // // Application Simulations
        // order2.items.add(item1);
        // order2.total += item1.price;

        // order3.items.add(item4);
        // order3.total += item4.price;

        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total += (item2.price + item2.price);

        // order4.ready = true;
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}
