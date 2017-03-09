package personality;

public class Smart extends Characteristic{
  
  public Smart(){
    super("Inteligente",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Aprendo rapidamente caso goste do assunto.";
  }
}