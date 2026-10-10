//Super Class for all Pizzas
public class Pizza {
//instance variables 
private double price;
private String size;

public Pizza(){
  size = "Medium";
  price = 10.00;
}

public Pizza (String size, double price){
  this.size = size;
  this.price = price;
} 

public String getSize(){
  return size;
}

  public void setsize() {
    this.size = size;
  }

  public double getPrice(){
    return price;
  }

  //changes price of the Pizza
  public void setPrice(double price){
    this.price = price;
  }

//Returns pizza's information 
public String toString() {
  return "Size: " + size + " Price: $" + price;
}


  
}
