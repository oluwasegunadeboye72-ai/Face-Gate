import java.util.*;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        
	List<Integer> testList = Arrays.asList(4, 9, 25, 49);
        
	List<Boolean> result = getPerfectSquare(testList);
        
	System.out.println(result);
    
     }

    public static List<Boolean> getPerfectSquare(List<Integer> numbers) {
        
	List<Boolean> result = new ArrayList<>();
        
	for (int number : numbers) {
        
	    int sqrt = (int) Math.sqrt(number);
        
	    result.add(sqrt * sqrt == number);
        
	}
        
	return result;
    }
}