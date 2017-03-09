package personality;

public class Paciente extends Characteristic{

  public Paciente(){
    super("Paciente",CharacteristicColor.GOOD);
  }

  protected String doCharacteristic(){
    return "Uma hora termina!";
  }
}
