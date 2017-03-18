package personality;

public class Excited extends Characteristic{
  
  public Excited(){
    super("Empolgado",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "So bora passar em tudo esse semestre!\n";
  }
}
