public class Cat implements Domesticatable, Tradable {

  @Override
  public String sound() {
    return "Meow!";
  }
  
  
  @Overide
  public int getPrice() {
    return 5;
  }
  
}
