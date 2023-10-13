import java.util.*;
public class Main1 {
    public static int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the roman Number : ");
        String romanNumeral = sc.next(); // Replace this with the Roman numeral you want to convert
        int integerValue = romanToInt(romanNumeral);
        System.out.println(romanNumeral + " = " + integerValue);
    }
}
