import java.util.HashMap;
import java.util.Set;

/*"Given an input string, return the frequency of the most frequent character."
Your function should also handle the empty string as an input.
 */
public class frequency {
	   public static int Max(String words) {
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        int max = 0;
	        char[] charwords = words.toCharArray();
	        for (char ch : charwords) {
	            int frequency;
	            if (map.containsKey(ch)) {
	                frequency = map.get(ch) + 1;
	            } else {
	                frequency = 1;
	            }
	            map.put(ch, frequency);

	            if (frequency > max) {
	                max = frequency;
	            }
	        }
	        return max;
	    }

	


	public static void main(String[] args) {

		System.out.println(Max("aabbcccduuuu"));
	}

}

	
	
	
	
	
