// This is not an exercise but a "sandbox" where you can freely test
// whatever you want
import java.util.Scanner;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        // Write the code here. You can run the code by 
        // selecting Run->Run File from the menu or by pressing Shift+F6
               
               Scanner reader = new Scanner(System.in);
               ArrayList<String> list = new ArrayList<String>();
               
               System.out.println("Enter the word");
               while(true){
               String word = reader.nextLine();
               
               if(word.equals("")){
                   break;
               }
               list.add(reverse(word));
               }
               System.out.println(longestReverse(list));
               System.out.println(longestReverse(list).length());
               
               
    }
    
    public static void printStar(String word){
        int i = 0;
        while( i < word.length()){
            System.out.print("*");
            i++; 
        }
        System.out.println("");
    }
    
    public static void printReverse(String word){
        int i = word.length()-1;
        while ( i >=0){
            System.out.print(word.charAt(i));
            i--; 
        }
        System.out.println("");
    }
    
    public static String reverse(String word){
        int i = word.length()-1;
        String reverse = "";
        while(i>=0){
            reverse += word.charAt(i);
            i--; 
        }
        return reverse; 
    }
    
    public static String longestReverse(ArrayList<String> list){
        String max = list.get(0);
        for ( int i = 0; i < list.size(); i++){
            if(list.get(i).length() > max.length()){
                max = list.get(i); 
            }
        }
        return max; 
  
    }
    
}