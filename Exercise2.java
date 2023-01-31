import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        cook("driving");
        scan.close();
    }

    static void cook(String food) {

        System.out.println("Training...");
        taste(food);

        String feedback = getFeedBack(food);

        // Define the base case / stopping condition
         if (feedback.equals("no")) {

             // Do something to reach the goal
            fixRecipe(food);

             // Recursive call
                cook(food);
        } else if (feedback.equals("yes")) {
             serve(food);
         }
    }

    static void taste(String food) {
        System.out.println("Testing");
    }

    static String getFeedBack(String food) {
        System.out.println("Is the " + food + " good? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void fixRecipe(String food) {
       
        System.out.println("train again");
        
        }
    static void serve(String food) {
        System.out.println("Passed the " + food+" exam");
    }

}
