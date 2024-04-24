import java.util.*;
public class RandomStringChooser
{
  private String[] words;
  public RandomStringChooser(String [] string){
    words = string;
  }
  public String getNext(){
    int index = -1;
    if(index >= words.length){
      return "NONE";
    } else{
      index++;
      return words[index];
    }
  }
}
