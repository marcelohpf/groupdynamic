package personality;

public class Trustworthy extends Characteristic{

  public Trustworthy(){
    super("Confiável", CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Sou Confiável.";
  }
}
