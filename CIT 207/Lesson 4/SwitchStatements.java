import java.util.Scanner;
public class SwitchStatements {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        char try_again;
        

        do {
         

         System.out.print("Enter input(1 to 5): ");
         int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Welcome to Java!");
                break;
            case 2:
                System.out.println("Conditional Statements are awesome!");
                break;
            case 3:
                System.out.println("Programming is Hard?");
                break;
            case 4:
                System.out.println("All Programming languages have something in common");
                break;
            case 5: 
                System.out.println("Java’s Object Oriented implementation is great!");
                break;
            default:
                System.out.println("Your input is wrong please enter numbers from 1 to 5");
                break;
        }
        
    System.out.print("Do you want to try again? \r\nEnter Y for yes or N for no: ");
    try_again = input.next().charAt(0);
    } while(try_again == 'y' || try_again ==  'Y');
    

    input.close();
}
    
}