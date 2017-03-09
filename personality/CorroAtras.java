package personality;

public class CorroAtras extends Characteristic{

  public CorroAtras(){
    super("Corro atras",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Corro atras das paradas";
  }
}
