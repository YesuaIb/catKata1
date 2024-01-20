public class Kata{
  public static boolean CheckIfFlush(String[] cards) {
      
      char palo = 'a';
      char previo = 'a';
      for (int i = 0; i < cards.length; i++) {
        palo = cards[i].charAt(cards[i].length()-1);
        if(i == 0){
          previo = palo;
        }else if(previo != palo){
          return false;
        }
      }
      return true;
  }
}