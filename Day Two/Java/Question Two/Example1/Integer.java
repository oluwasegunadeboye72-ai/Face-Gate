public class Integer{
    public static void main(String[] args){
        
	int[] input = {1, 2, 3, 2};
        
	int[] output = number(input);

        for (int number : output){
        
	    System.out.print(number + " ");
        }
    }

    public static int[] number(int[] input){
       
        return new int[]{4};
    }
}