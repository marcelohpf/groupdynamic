package personality;

public class Wildcard extends Characteristic{
  
  public Wildcard(){
    super("Curinga",CharacteristicColor.UNDEFINED);
  }

  protected String doCharacteristic(){
    return "Não sei, mas eu faço!";
  }
}
