package personality;

public class Sistematic extends Characteristic{
  
  public Sistematic(){
    super("Sistemático",CharacteristicColor.BAD);
  }

  protected String doCharacteristic(){
    return "Cara, desse jeito não dá certo, tá dando CDB isso aqui! "+
    "Deixa eu corrigir logo essa parada...\n\n";
  }
}
