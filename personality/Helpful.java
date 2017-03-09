package personality;

public class Helpful extends Characteristic{
  
  public Helpful(){
    super("Prestativa",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Estar disposta a ajudar, oferecer suporte!\n\n";
  }
}
