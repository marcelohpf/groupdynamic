package personality;

public class Distraido extends Characteristic{

  public Distraido(){
    super("Distraido",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "O que eu tava fazendo mesmo?";
  }
}
