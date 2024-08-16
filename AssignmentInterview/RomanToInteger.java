import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "IX";  // You can replace this with any Roman numeral
        int result = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }
}
