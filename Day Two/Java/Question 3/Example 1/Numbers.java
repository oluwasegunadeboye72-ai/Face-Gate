public class Numbers{
    public static void main(String[] args){
        
	int[] input = {1,2,2,3,4,4,5,6,6,7};
        
	int[] output = number(input);

        for (int number : output){
        
	    System.out.print(number + "number");
        }
    }

    public static int[] number(int[] input){
       
        return new int[]{1,2,3,4,5,6,7};
    }
}