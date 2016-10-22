// Nikolas Bekris
import java.util.*;
import java.io.*;

public class CreditScore {
  public static void main(String [] args) 
    throws FileNotFoundException {
        
    Scanner console = new Scanner(new File("creditapps.txt"));
        
    while (console.hasNextLine()) {
        Scanner line = new Scanner(console.nextLine());
        String next = line.next();
        String name = next;
        
        while (line.hasNext()) {
            next = line.next();
            name += (" " + next);
            
            while (line.hasNextInt()) {
                int credScore = line.nextInt();
                double intRate = EvalCred(credScore);
                System.out.println("Account " + name);
                System.out.println(name + "'s credit score is, " + credScore);
                    
        if (intRate == -1) {
            System.out.println(name + " does not qualify for a loan.\n");
        } else {
            System.out.println(name + " is approved for a rate of " + intRate + "%\n");
        }
      }
    }      
  }
}

    public static int EvalCred(int credScore) {
        if (credScore <= 500) {
            int intRate = -1;
            return intRate;
        } else if (credScore >= 500 && credScore <= 599){
            int intRate = 24;
            return intRate;
        } else if (credScore >= 600 && credScore <= 699) {
            int intRate = 19;
            return intRate;
        } else if (credScore >= 700 && credScore <= 799) {
            int intRate = 12;
            return intRate;
        } else {
            int intRate = 06;
            return intRate;
        }
    }
}

