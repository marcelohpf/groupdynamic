package personality;

public class Pessimista extends Characteristic{
  
  public Pessimista(){
    super("Pessimista",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Vai dar ruim! Bora resolver logo isso!\n";
  }
}
