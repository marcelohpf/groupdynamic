/** CharacteristicColor.java
* Constants that define the colors of characteristic types: good, awesome,
* bad, awful, with unicode for the terminal colors.
*/
package personality;

public enum CharacteristicColor {
  AWESOME("1;32"),
  GOOD("1;34"),
  BAD("1;31"),
  AWFUL("0;31");

  private String colorAnsiCode; //keep the terminal color number
  private final String unicodePrefix = "\u001B["; // unicode simble of \[
  private final String unicodePosfix = "m"; // unicode simble to finish color
  private CharacteristicColor (String colorNumber){
    this.colorAnsiCode = this.unicodePrefix + colorNumber + unicodePosfix;
  }
  public String toString (){
    return this.colorAnsiCode;
  }
}
