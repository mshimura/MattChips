
public class MattChips extends SimpleChips{

  public String toString(){
    return "MattChips";
  }

  public int play(int pile, int lastmove){
    if(pile <= 2*lastmove) return pile;
    if(pile >= 5 && pile%3 == 0)
      return 1;
    if(pile >= 5 && pile%3 == 1)
      return 2;
    else return 1;
    
    
    
  }
}