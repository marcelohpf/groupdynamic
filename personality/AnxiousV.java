package personality;

public class AnxiousV extends Characteristic{
  
  public AnxiousV(){
    super("Ansioso",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Costumo achar que vai dar tudo errado quando a treta começa";
  }
}
