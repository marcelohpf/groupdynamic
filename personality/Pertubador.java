package personality;

public class Pertubador extends Characteristic{
  
  public Pertubador(){
    super("Pertubador",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Dizem que eu consigo ser chato pra caramba quando eu quero!\n";
  }
}
