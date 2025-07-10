package utils;

public class JavaPrograms {

    private static String Reversed;

    public static void main(String[] args) {
        reverseString();
        findLargestInArray();
        CheckPalindrome();

    }


    static void reverseString() {
String original = "selenium"; // योग्य नाव वापरा
String reversed = "";

 for (int i = original.length() - 1; i >= 0; i--) {
 reversed += original.charAt(i);
 }

 System.out.println("Reverse String: " + reversed);
    }

    static void findLargestInArray()
    {
        int[] arr = {4,1,9,6,2};
                int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Largest Number:"+max);
    }
    static void  CheckPalindrome()
    {
        String str = "madam";
        String rev = new
                StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        {
            System.out.println(str + "is a Palindrome");

        }
        else
        {
            System.out.println(str + "is not a Palindrome");
        }
    }
}
