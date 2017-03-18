package personality;

public class AnxiousL extends Characteristic{
  
  public AnxiousL(){
    super("Ansiosa",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Sofrer por antecedência\n\n";
  }
}
