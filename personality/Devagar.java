package personality;

public class Devagar extends Characteristic{
  
  public Devagar(){
    super("Devagar",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Não estou entendendo!\n";
  }
}
