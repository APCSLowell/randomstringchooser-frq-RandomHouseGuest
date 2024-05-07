import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> words;
  public RandomStringChooser(String [] string){
    words = new ArrayList <String>();
    for(int i = 0; i < string.length; i++){
      words.add(string[i]);
    }
  }
  public String getNext(){
    int index = (int)(Math.random()*words.size());
    if(words.size() == 0){
      return "NONE";
    }
    return words.remove(index);
  }
}
