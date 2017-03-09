package personality;

public class Creative extends Characteristic{
  
  public Creative(){
    super("Criativo",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "ZZZZZZZZ... Eureka!!!!\n";
  }
}