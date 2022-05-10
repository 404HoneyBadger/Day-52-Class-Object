public class Product {
    
    public int cost;
    public int quantity;
    public String name;

    public Product(int cost1, int quantity1, String name1) {
       
        this.cost = cost1;
        this.quantity = quantity1;
        this.name = name1;
    }

    public void totalCost() {
        System.out.println("Total cost is " + (quantity*cost));
    }

    public void printProduct() {
        System.out.println("A gallon of " + name + " costs " + cost + " and " + quantity + " units were purchased.");
    }
}
