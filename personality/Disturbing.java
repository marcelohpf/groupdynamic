package personality;

public class Disturbing extends Characteristic{
  
  public Disturbing(){
    super("Pertubador",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Dizem que eu consigo ser chato pra caramba quando eu quero!\n";
  }
}
