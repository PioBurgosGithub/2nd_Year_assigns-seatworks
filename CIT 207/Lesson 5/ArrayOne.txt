public class ArrayOne {
    public static void main(String[] args){

        String[] morningRoutine = new String[5];
        morningRoutine[0] = "Fix Bed";
        morningRoutine[1] = "Wash Face";
        morningRoutine[2] = "Set Table";
        morningRoutine[3] = "Watch Youtube Videos";
        morningRoutine[4] = "Eat Breakfast";

        for(int i=0; i < morningRoutine.length; i++) {
            System.out.println(morningRoutine[i]);
        }
    }
    
}
