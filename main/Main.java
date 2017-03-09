package main;

import personality.*;
import group.*;
import java.util.ArrayList;
import java.util.Scanner;



/** Main class
 * Control all application execution
 * Contain methods to interation with user
 */
public final class Main{
  private static final Group group = new Group("Iniciativa vingadores");
  private static final String UP_CONSOLE = "\033[500A";
  private static final String CLEAR_CONSOLE = "\033[2J";
  private static final Scanner interation = new Scanner(System.in);

  public static void main(String args[]){
    // Main calls
    apresentation();
  }

  /** Apresentation order
   */
  public static void apresentation(){
    System.out.println("Vamos começar!");
    interation.nextLine(); // wait user interation
    mountGroup();
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Apresentar membros!");
    interation.nextLine(); // wait user interation
    showMembers();
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Apresentar grupo!");
    interation.nextLine(); // wait user interation
    showGroupCharacteristics();
    interation.nextLine(); // wait user interation
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    showGroupInWork();
    interation.nextLine(); // wait user interation
    System.out.println(UP_CONSOLE);
    System.out.println(CLEAR_CONSOLE);
    System.out.println("Bora trabalhar! :D");
  }


  private static void showMembers() {
    System.out.println("Os integrantes da iniciativa vingadores: ");
    for (int i=0; i<group.getSize(); i++) {
      interation.nextLine(); // wait user interation
      System.out.println(UP_CONSOLE);
      System.out.println(CLEAR_CONSOLE);
      System.out.println(group.getMember(i));
    }
    interation.nextLine(); // wait user interation
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
    ArrayList<Characteristic> marceloCharacteristic = new ArrayList<Characteristic>();
    marceloCharacteristic.add(new Wildcard());
    marceloCharacteristic.add(new Understander());
    marceloCharacteristic.add(new WordEater());
    group.addMember(
      new Member("Marcelo Ferreira", 21, "140056688", "GPP", 
      marceloCharacteristic));
    interation.nextLine(); // wait user interation
  }
}
    ArrayList<Characteristic> leticiaCharacteristic = new ArrayList<Characteristic>();
    leticiaCharacteristic.add(new Anxious());
    leticiaCharacteristic.add(new Helpful());
    group.addMember(
      new Member("Leticia de Souza", 18, "150015160", "MDS", 
      leticiaCharacteristic));
    interation.nextLine(); // wait user interation
  }
}