package personality;

public class Hardworking extends Characteristic{
  
  public Hardworking(){
    super("Esforçado",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Bora tentar até entender!\n";
  }
}
