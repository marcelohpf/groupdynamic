package personality;

/** CharacteristicColor.java
* Constants that define the colors of characteristic types: good, awesome,
* bad, awful, with unicode for the terminal colors.
*/
public enum CharacteristicColor {
  // Constants declaration
  AWESOME("1;32", 1),
  GOOD("1;34", 2),
  BAD("1;31", 3),
  AWFUL("0;31", 4),
  UNDEFINED("0",5);

  private String colorAnsiCode; //keep the terminal color number
  private final String unicodePrefix = "\u001B["; // unicode simble of \[
  private final String unicodePosfix = "m"; // unicode simble to finish color
  private Integer number;//identify characteristic group

  private CharacteristicColor (String colorNumber, Integer number){
    this.colorAnsiCode = this.unicodePrefix + colorNumber + unicodePosfix;
    this.number = number;
  }

  /** Get the ansi code string to color the terminal
    * @return colorCode: mounted \u001B[colornumberm
    */
  public String toString (){
    return this.colorAnsiCode;
  }
  
  /** Get the group number of the characteristic
   * @return number: the number of characteristic 
   * 1 - Awesome
   * 2 - Good
   * 3 - Bad
   * 4 - Awful
   * 0 - Undefined
   */
  public Integer getGroup (){
    return this.number;
  }
}
