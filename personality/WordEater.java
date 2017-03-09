package personality;

public class WordEater extends Characteristic{
  
  public WordEater(){
    super("Difícil comunicação",CharacteristicColor.AWFUL);
  }

  protected String doCharacteristic(){
    return "Foi, começaram. Entendeu?";
  }
}
