package group;
import personality.Characteristic;
import java.util.List;
import java.util.ArrayList;


/**Member.java
  *keep the members informations and behaviors
  */
public class Member {
  private String name; //member name, not null and not blank
  private Integer age; //member age, >16 and <65
  private String registry; //unb academic registry, only numbers
  private String subject; //member subject, MDS or GPP
  private List<Characteristic> characteristicList; //member personality, at least 2

  public Member(String name, Integer age, String registry, String subject,
                List<Characteristic> characteristicList) {
    setName(name);
    setAge(age);
    setRegistry(registry);
    setCharacteristicList(characteristicList);
    this.subject = subject;

  }
  /** Format like a presentation of member with name, age and main 
   * characteristics
   * @return memberInformations: Formated string with necessari data
   */
  public String toString() {
    StringBuilder memberInformations = new StringBuilder();
    memberInformations.append(this.subject);
    memberInformations.append("\t");
    memberInformations.append(this.name);
    memberInformations.append(" - ");
    memberInformations.append(this.age);
    for (Characteristic characteristic :this.characteristicList) {
      memberInformations.append("\n\t - ");
      memberInformations.append(characteristic);
    }
    return memberInformations.toString();
  }

  /** Represent the characteristic of each member in action
   */
  public void work() {
    System.out.println("Trabalhando sou assim: ");
    for (Characteristic characteristic :this.characteristicList) {
      System.out.println(characteristic.act()+"\n");
    }
  }
  
  /** Get only a list with member characteristic, essential to compose a
   * group characteristic
   * @return characteristicList: The list with good and bad characteristics
   */
  public List<Characteristic> getCharacteristics() {
    return this.characteristicList; // Avoid this
  }

  // Sets 
  private void setName(String name) throws RuntimeException{
    String regex = "(\\p{IsLatin}| )+";
    
    if (name != null && name.trim().matches(regex)) {
      this.name = name.trim();
    } else {
      throw new RuntimeException("Name contains not latin letters");
    }
  }
  private void setRegistry(String registry) throws RuntimeException{
    String regex = "\\d+";
    if (registry.matches(regex)) {
      this.registry = registry;
    } else {
      throw new RuntimeException("Registry contains characters beside numbers");
    }
  }
  private void setAge(Integer age) throws RuntimeException{
    if (age >=16 && age <=150) {
      this.age = age;
    } else {
      throw new RuntimeException("Age is out of rage: 16 <= age <= 150");
    }
  }
  private void setCharacteristicList(List<Characteristic> characteristicList) 
    throws RuntimeException{
    if (characteristicList != null && characteristicList.size()>= 2) {
      this.characteristicList = characteristicList;
    } else {
      throw new RuntimeException("Your characteristic list should have "+
        "more then 1 element");
    }
  }
}
