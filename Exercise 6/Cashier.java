public class Cashier {
    
    public void checkOut (Groceryitem item){
      System.out.println("You have bought "+ item.name);
      

    }

    public void showPrice(Groceryitem item){
        System.out.println("Price: " + item.price);

    }
}
