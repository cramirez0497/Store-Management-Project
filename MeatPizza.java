public class MeatPizza extends Pizza {

private boolean hasMeat;

public MeatPizza() {
  super();
  hasMeat = true;
}

public MeatPizza (String size, double price, boolean hasMeat) {
  super(size,price);
  hasMeat = true;
}

public boolean getHasMeat(){
  return hasMeat;
}

public void seHasMeat(boolean hasMeat){
  this.hasMeat = hasMeat;
}

// returns whether pizza has meat 
public String toString(){
  return super.toString() + ", Has Meat: " + hasMeat;
} 
  }
