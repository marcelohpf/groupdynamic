/** Characteristic.java
 * Define the model to be implemented for each characteristic
 * of the personality of each person, their action and define if is
 * good or bad.
 */
package personality;

public abstract class Characteristic{
  
  private String name; // Identify the characteristic (not null, not black)

  protected Characteristic(String name){
    this.name = name; // fuck the set method
  }

  /** Used by member of group to show your characteristic in action
   * @return action: is execution of the children implementation
   * @exception: result can't be null or empty string
   */
  public final String act() throws RuntimeException{
    String action = this.doCharacteristic();
    if(action == null || action.trim().length() == 0){
      throw new RuntimeException("Execution of act get a bad string");
    }
    return action;
  }

  /** Return the actual name of characteristic
   */
  public String getName(){
    return this.name;
  }

  /** This method should be implemented by childrens to define the exclusive
   * behavior of each person using this characteristic
   * @return characteristic description of action
   */
  protected abstract String doCharacteristic();

  public String toString(){
    return getName();
  }

}
