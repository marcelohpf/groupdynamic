package personality;

public class Sluggish extends Characteristic{
  
  public Sluggish(){
    super("Lerdo",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Quando uma coisa tem que ser feita, demoro mais para finalizar";
  }
}
