package personality;

public class Impatient extends Characteristic{

  public Impatient(){
    super("Impaciente",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Eu sou muito agoniado e gosto das coisas rapidas e bem feitas";
  }
}
