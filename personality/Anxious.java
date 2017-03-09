package personality;

public class Anxious extends Characteristic{
  
  public Anxious(){
    super("Ansioso",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Costumo achar que vai dar tudo errado quando a treta começa";
  }
}
