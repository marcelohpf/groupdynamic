package personality;

public class Distracted extends Characteristic{

  public Distracted(){
    super("Distraido",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "O que eu tava fazendo mesmo?";
  }
}
