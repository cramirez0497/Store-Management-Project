import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // // Creates a Scanner object - feel free to delete if not using!
     Scanner input = new Scanner(System.in);

    //instantiates new pizza objects
MeatPizza meat = new MeatPizza ("Large", 15.00, true);
VeggiePizza veggie = new VeggiePizza("Medium", 12.00, true);

System.out.println(meat);
System.out.println(veggie);




    // // Closes the Scanner object
     input.close();
    
  }
}