import java.util.Scanner;
import java.util.ArrayList;
class Term_2_Lesson_1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    ArrayList<String> array = new ArrayList<String> ();
    System.out.println("Please enter words, enter STOP to stop the loop.");
    
    String userInput = scan.nextLine();

    while (!userInput.equals("STOP")){
    	userInput = scan.next();
    	array.add(userInput);
    }
    
    int length = array.size();
    System.out.println(length);
    array.remove(array.size() - 1);

    System.out.println(array);
    
    array.remove(array.size() - 2);
    array.remove(0);
    
    for (int i = 0; i < array.size(); i++){
      if (array.get(i).length() <= 2){
        array.remove(i);
      }
    }
    System.out.println(array);
  }
}
