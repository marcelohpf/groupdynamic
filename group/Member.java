package group;
import personality.Characteristic;
import java.util.List;


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
                List<Characteristic> characteristicList){
    this.name = name;
    this.age = age;
    this.registry = registry;
    this.subject = subject;
    this.characteristicList = characteristicList;

  }

  public String toString(){
    StringBuilder memberInformations = new StringBuilder();
    memberInformations.append(this.name);
    memberInformations.append(" - ");
    memberInformations.append(this.age);
    memberInformations.append("\n");
    for (Characteristic characteristic :this.characteristicList){
      memberInformations.append("\t");
      memberInformations.append(characteristic);
    }
    return memberInformations.toString();
  }

  public void work(){
    System.out.println("Trabalhando sou assim: ");
    for (Characteristic characteristic :this.characteristicList){
      System.out.println(characteristic.act()+"\n");
    }
  }
}
