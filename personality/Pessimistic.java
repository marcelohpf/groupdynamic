package personality;

public class Pessimistic extends Characteristic{
  
  public Pessimistic(){
    super("Pessimista",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Vai dar ruim! Bora resolver logo isso!\n";
  }
}
