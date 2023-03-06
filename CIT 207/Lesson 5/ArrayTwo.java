import java.util.Scanner;
public class ArrayTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array: ");

        String[] morningRoutine = new String[input.nextInt()];
        input.nextLine(); 
        
        for(int i = 0; i < morningRoutine.length; i++) {
            System.out.println("Enter the value for index " + i);
            morningRoutine[i] = input.nextLine();
        }
        System.out.println("");
        for(String Routine: morningRoutine){
            System.out.println(Routine);
        }
        input.close();

    }
    
}


