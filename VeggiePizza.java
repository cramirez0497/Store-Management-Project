public class VeggiePizza extends Pizza {
  
 private boolean hasVeggies;
  
public VeggiePizza (){
  super();
  hasVeggies = true;
}
  
  public VeggiePizza(String size, double price, boolean hasVeggies){
    super(size,price);
    this.hasVeggies = hasVeggies;
  }
  
  public boolean getHasVeggies(){
    return hasVeggies;
  }

//changes if pizza has veggies 
  public void setHasVeggies(boolean hasVeggies){
    this.hasVeggies = hasVeggies;
  }

// return whether pizza has veggies
  public String toString(){
    return super.toString() + ", Has Veggies: " + hasVeggies;
  }
  }
