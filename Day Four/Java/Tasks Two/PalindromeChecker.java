import java.util.*;

public class PalindromeChecker {

    public static List<Boolean> getPalindromeFlags(List<String> words) {
        
	List<Boolean> results = new ArrayList<>();
        
	for (String word : words) {
        
	    results.add(isPalindrome(word)); 
        }
        return results;
    }

    private static boolean isPalindrome(String str) {
        
	int left = 0, right = str.length() - 1;
        
	while (left < right) {
            
	    if (str.charAt(left) != str.charAt(right)) {
                
	        return false;
            }
            
	    left++;
            right--;
        }
        
	return true;
    }

    
    public static void main(String[] args) {
        
	List<String> testList = Arrays.asList("madam", "racecar", "hello", "noon");
        List<Boolean> output = getPalindromeFlags(testList);
        
	System.out.println(output);
    }
}