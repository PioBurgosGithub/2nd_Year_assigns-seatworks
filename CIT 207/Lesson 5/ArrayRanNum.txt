import java.util.Random;
public class ArrayRanNum {
    public static void main(String[] args){
      Random rd = new Random(); // creating Random object
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(); // storing random integers in an array
      }

      for(int num: arr){
        if(num % 2 == 0){
            System.out.println(num + " is divisible by 2");
        }
        else{
            System.out.println(num + " is not divisible by 2");
        }
        
      }


    }
    
}
