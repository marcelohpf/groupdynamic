package personality;

public class Empolgado extends Characteristic{
  
  public Empolgado(){
    super("Empolgado",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "So bora passar em tudo esse semestre!\n";
  }
}
