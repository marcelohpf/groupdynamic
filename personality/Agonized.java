package personality;

public class Agonized extends Characteristic{
  
  public Agonized(){
    super("Agoniado, sem paciência",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Tem que fazer essa parada looooooogoooooooo vei!\n";
  }
}
