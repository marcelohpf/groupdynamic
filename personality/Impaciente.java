package personality;

public class Impaciente extends Characteristic{

  public Impaciente(){
    super("Impaciente",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Eu sou muito agoniado e gosto das coisas rapidas e bem feitas";
  }
}
