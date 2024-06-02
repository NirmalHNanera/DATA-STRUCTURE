import java.util.Scanner;

public class AIBIForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string to check if it is of the form aib^i: ");
        String input = scanner.nextLine();
        
        if (isValidAIBIForm(input)) {
            System.out.println("The input string is of the form aib^i.");
        } else {
            System.out.println("The input string is not of the form aib^i.");
        }
        
        scanner.close();
    }
    
    public static boolean isValidAIBIForm(String str) {
        int countA = 0;
        int countB = 0;
        
        for (char ch : str.toCharArray()) {
            if (ch == 'a') {
                countA++;
            } else if (ch == 'b') {
                countB++;
            } else {
                return false;
            }
        }
        
        return countA == countB && countA > 0;
    }
}