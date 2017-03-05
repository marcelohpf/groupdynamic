package group;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

import personality.Characteristic;

/** Group.java
 * Have a list of members to represent a group in real world with members
 * characteristics and their own behaviors.
 */
public class Group {
  
  private String projectName; // Every group need a name! (not null)
  private List<Member> members; // People of project (not null)

  /** Constructor with a mounted list of members
   * @param project name: name of team
   * @param members: members of project
   */
  public Group(String projectName, List<Member> members) {
    setName(projectName);
    setMembers(members);
  }

  /** Constructor that create a new group without members
   * @param project name: name of team
   */
  public Group(String projectName) {
    setName(projectName);
    setMembers(null);
  }

  /** Get a formated string with all characterists of group's member
   * @return characteristic: a bullet list with characteristics colored
   */
  public String getCharacteristic() {
    StringBuilder characteristics = new StringBuilder("Group is: ");
    List<Characteristic> characteristicList = getCharacteristicList();

    for (Characteristic characteristic : characteristicList) {
      characteristics.append("\n - ");
      characteristics.append(characteristic);
    }
    return characteristics.toString();
  }

  /** Simulate the group woking with all characteristics together
   * Use the standard output of system
   */
  public void work(){
    List<Characteristic> characteristics = getCharacteristicList();
    Random indexGenerator = new Random();
    /** Generate and create random index numbers to show the members
     * in aleatory work
     */
    while( characteristics.size()>0 ){
      int randomIndex = indexGenerator.nextInt(characteristics.size());
      System.out.println(characteristics.get(randomIndex).act());
      characteristics.remove(randomIndex);
    }
  }

  /** Add a new member to compose the group members
   * @param member: The new person in group
   * @throws RuntimeException: null member or already in group
   */
  public void addMember(Member member) throws RuntimeException{
    Integer index = this.members.indexOf(member);
    if (member != null && index == -1) {
      this.members.add(member);
    } else if (member == null) {
      throw new RuntimeException("New member can't be null");
    } else {
      throw new RuntimeException("Member already in group");
    }
  }

  /** Remove a member by her name
   * @param name: the name of member to be removed (String)
   * @return removed: true if the member was removed
   * @throws RuntimeException: if surge some problem in remotion
   */
  public void removeMember(String member) throws RuntimeException{
    throw new RuntimeException("No no no nooo!");
  }

  // Set
  private void setName(String name) throws RuntimeException {
    if (name != null) {
      this.projectName = name;
    } else {
      throw new RuntimeException("Name can't be null");
    }
  }
  private void setMembers(List<Member> members) {
    if (members != null) {
      this.members = members;
    } else {
      this.members = new ArrayList<Member>();
    }
  }

  /** Get the list with group characteristic sorted by characteristic group
   * @return characteristics: list of characteristics
   */
  private List<Characteristic> getCharacteristicList() {
    List<Characteristic> characteristics = new ArrayList<Characteristic>();
    for (Member member : this.members) {
      characteristics.addAll(member.getCharacteristics());
    }
    // TODO: implements the comparable in characteristic and sort it
    return characteristics;
  }
}
