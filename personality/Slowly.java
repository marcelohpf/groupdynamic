package personality;

public class Slowly extends Characteristic{
  
  public Slowly(){
    super("Devagar",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Não estou entendendo!\n";
  }
}
