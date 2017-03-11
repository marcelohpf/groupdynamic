package personality;

public class Darting extends Characteristic{

  public Darting(){
    super("Corro atras",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Corro atras das paradas";
  }
}
