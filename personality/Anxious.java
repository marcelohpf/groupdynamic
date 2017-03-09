package personality;

public class Anxious extends Characteristic{
  
  public Anxious(){
    super("Ansiosa",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Sofrer por antecedência\n\n";
  }
}

