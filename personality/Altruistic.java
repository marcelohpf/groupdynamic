package personality;

public class Altruistic extends Characteristic{
  
  public Altruistic(){
    super("Altruísta",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Me importo com o bem estar dos coleguinhas";
  }	
}
