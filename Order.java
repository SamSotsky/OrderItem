import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null

    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
    }
    // OVERLOAD CONSTRUCTorv
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
    }
    // ORDER METHODS
    
    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready == true) {
        return "Your order is ready.";
        } 
        else {
            return  "Thank you for waiting";
        }
    }
    public double getOrderTotal(){
        double total = 0.0;
        for(Item someItem : this.getItems()) {
            total +=someItem.getPrice();
        }
        return total;
    }




    // public double getOrderTotal(){
    //     double total = 0.0;
    //     for(Item i: this.items) {
    //     total += i.getPrice();
    //     }
    //     return total;
    // }
    public void display(){
        System.out.println("\nCustomrer Name:" + this.getName());
        for(Item someItem : this.getItems()) {
            System.out.println(someItem.getName());
        }
        System.out.println("Total: " + this.getOrderTotal());
        System.out.println(this.getStatusMessage());
    }
    // GETTERS 
    public String getName(){
        return this.name;
    }
    public boolean getReady(){
        return this.ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }

    // SETTERS
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}