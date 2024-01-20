public class Order {
  public static String order(String words) {
    String [] solu = words.split(" ");
    String [] palabras = words.split(" ");
    String solucion = "";
    boolean primera = true;
    
    for (int i = 0; i < palabras.length; i++){
      for(int j = 1; j <=  palabras.length; j++){
        if (palabras[i].contains(""+j)){
          solu[j-1] = palabras[i];
        }
      }
    }
    for (int i = 0 ; i < palabras.length; i++){
      if (primera){
        solucion += solu[i];
        primera= !primera;
      }else{
      solucion += " " + solu[i];
      }
    }
     return solucion;
  }
}