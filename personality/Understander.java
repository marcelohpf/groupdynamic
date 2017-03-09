package personality;

public class Understander extends Characteristic{
  
  public Understander(){
    super("Entendedor",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "É que a coisa do treco que caiu lá e não sei o que foi"+
      " aconteceu!\nAh! Saquei!\n\n";
  }
}
