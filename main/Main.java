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


    ArrayList<Characteristic> temporimCharacteristic = new ArrayList<Characteristic>();
    temporimCharacteristic.add(new Sluggish());
    temporimCharacteristic.add(new Altruistic());
    group.addMember(
      new Member("Arthur Temporim", 21, "140016759", "GPP", 
      temporimCharacteristic));
    interation.nextLine(); // wait user interation

    ArrayList<Characteristic> viniciusCharacteristic = new ArrayList<Characteristic>();
    viniciusCharacteristic.add(new AnxiousV());
    viniciusCharacteristic.add(new Smart());
    group.addMember(
      new Member("Vinicius Ferreira", 19, "150151331", "MDS", 
      viniciusCharacteristic));
    interation.nextLine(); // wait user interation

    ArrayList<Characteristic> leticiaCharacteristic = new ArrayList<Characteristic>();
    leticiaCharacteristic.add(new AnxiousL());
    leticiaCharacteristic.add(new Helpful());
    group.addMember(
      new Member("Leticia de Souza", 18, "150015160", "MDS", 
      leticiaCharacteristic));
    interation.nextLine(); // wait user interation

    ArrayList<Characteristic> eduardoCharacteristic = new ArrayList<Characteristic>();
    eduardoCharacteristic.add(new Slowly());
    eduardoCharacteristic.add(new Pessimistic());
    group.addMember(
      new Member("Eduardo Nunes", 20, "140056149", "GPP",
      eduardoCharacteristic));
    interation.nextLine(); // wait user interation
    
    ArrayList<Characteristic> mirandaCharacteristic = new ArrayList<Characteristic>();
    mirandaCharacteristic.add(new Agonized());
    mirandaCharacteristic.add(new Hardworking());
    group.addMember(
      new Member("Matheus Miranda", 20, "140056793", "GPP",
      mirandaCharacteristic));
    interation.nextLine(); // wait user interation
    
    ArrayList<Characteristic> rafaelCharacteristic = new ArrayList<Characteristic>();
    rafaelCharacteristic.add(new Disturbing());
    rafaelCharacteristic.add(new Excited());    
    group.addMember(
      new Member("Rafael Bragança", 27, "100120181", "MDS",
      rafaelCharacteristic));
    interation.nextLine(); // wait user interation

    ArrayList<Characteristic> victorCharacteristic = new ArrayList<Characteristic>();
    victorCharacteristic.add(new Sistematic());
    victorCharacteristic.add(new Trustworthy());
    group.addMember(
      new Member("Victor Leite", 24, "160147191", "MDS", 
      victorCharacteristic));
    interation.nextLine(); // wait user interation

    ArrayList<Characteristic> arturCharacteristic = new ArrayList<Characteristic>();
    arturCharacteristic.add(new Impatient());
    arturCharacteristic.add(new Darting());
    group.addMember(
      new Member("Artur Bersan", 21, "140016813", "GPP", 
      arturCharacteristic));
    interation.nextLine(); // wait user interation
    
    ArrayList<Characteristic> icaroCharacteristic = new ArrayList<Characteristic>();
    icaroCharacteristic.add(new Distracted());
    icaroCharacteristic.add(new Patient());    
    group.addMember(
      new Member("Ícaro Pires", 19, "150129815", "MDS", 
      icaroCharacteristic));
    interation.nextLine(); // wait user interation
  }
}
