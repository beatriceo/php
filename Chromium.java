import java.util.Scanner;

public class Chromium {

    public static void main(String[] args) {
  
        System.out.println("Hello, World");
        
        boolean doContinue = true;
        int continueCount = 0;
        
        while(doContinue) {
            
           if(continueCount < 10) {
               
               doContinue = false;
               
           }
            
           System.out.println("Loop de loop");
            
           continueCount++;
            
        }
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n" + "Is there anything you would like to add?" + "\n");
		System.out.println("If so, say so now of forever hold your peace:");
		
		String userInput = scanner.readLine();
		
		System.out.println("\n" + "Interesting input...");
		System.out.println("What did you mean by: '" + userInput + "'?");
  
    }
  
}
