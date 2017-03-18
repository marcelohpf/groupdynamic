package personality;

public class Patient extends Characteristic{

  public Patient(){
    super("Paciente",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Uma hora termina!";
  }
}
