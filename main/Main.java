package main;

import personality.*;
import group.*;
import java.util.ArrayList;



/** Main class
 * Control all application execution
 * Contain methods to interation with user
 */
public final class Main{
  private static final Group group = new Group("Iniciativa vingadores");
  private static final String UP_CONSOLE = "\033[500A";
  private static final String CLEAR_CONSOLE = "\033[2J";

  public static void main(String args[]){
    // Main calls
    apresentation();
  }

  /** Apresentation order
   */
  public static void apresentation(){
    System.out.println("Vamos começar!");
    //scanner
    mountGroup();
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Apresentar membros!");
    //scanner
    showMembers();
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Apresentar grupo!");
    //scanner
    showGroupCharacteristics();
    //scanner
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    showGroupInWork();
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Bora trabalhar! :D");
  }


  private static void showMembers() {
    System.out.println("Os integrantes da iniciativa vingadores: ");
    for (int i=0; i<group.getSize(); i++) {
      //scanner
      System.out.println(UP_CONSOLE);
      System.out.println(CLEAR_CONSOLE);
      System.out.println(group.getMember(i));
    }
  }

  private static void showGroupCharacteristics() {
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Então as características do grupo são");
    System.out.println(group.getCharacteristic());
  }
  private static void showGroupInWork() {
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Em trabalho vai ser +/- assim: \n");
    group.work();
  }
  private static void mountGroup() {
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);

    /* Some example how it should work
     * Create your characteristic directily in array
     *
       ArrayList<Characteristic> exampleMember = new ArrayList<Characteristic>();
       exampleMember.add(new ExampleCharacteristic);
       exampleMember.add(new ExampleCharacteristic);
     * create your member directily in group add member method
       group.addMember(
        new Member("Example member", 0, "000000000", Discipline.(GPP/MDS), 
          exampleMember));
    */
  }
}
