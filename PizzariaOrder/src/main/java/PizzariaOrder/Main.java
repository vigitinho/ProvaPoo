package PizzariaOrder;


public class Main {

   
    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();
        PizzaSize size = new PizzaSize();
        PizzaFlavor flavor = new PizzaFlavor();
        PizzaEdge edge = new PizzaEdge();
        DrinkOrder drink = new DrinkOrder();
        
        order.order();
    }
    
}
