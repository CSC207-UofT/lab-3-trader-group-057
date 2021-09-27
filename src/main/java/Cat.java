/* A public class that implements the Dosmesticatable and Tradable
 */
public class Cat implements Domesticatable, Tradable {
 
  /* I don't know what I am doing here*/
  
  @Override
  public String sound() {
    return "Meow!";
  }
  
  
  @Overide
  public int getPrice() {
    return 5;
  }
  
  
}
