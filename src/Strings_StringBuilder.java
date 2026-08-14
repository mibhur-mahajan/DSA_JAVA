import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Strings_StringBuilder {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 5, 4, 19};
//        int num = 10;
//        String name = "Kunal Kushwaha";
//        System.out.println(name);

//        String a = "Kunal";
//        System.out.println(a);
//        a = "Kushwaha";
//        System.out.println(a);

//        String a = "Kunal";
//        String b = "Kunal";
//        System.out.println(a == b);
//        System.out.println(a.equals(b));

//        String name1 = new String("Kunal");
//        String name2 = new String("Kunal");
//        System.out.println(name1 == name2);
//        System.out.println(name1.equals(name2));
//        System.out.println(name1.charAt(0));

//          Integer num = new Integer(56);
//          System.out.println(num.toString());
//          System.out.println(num);

//        float a = 453.1234f;
//        System.out.printf("Formatted number is %.2f",a);

//        System.out.printf("Pie: %.3f",Math.PI);

//        System.out.printf("Hello my name is %s and I am %s", "Kunal", "Cool");

//         System.out.println('a' + 'b');
//         System.out.println("a" + "b");
//         System.out.println((char)('a' + 3));
//
//         System.out.println((char)('a' + 1));
//         // this is same after a few steps: "a" + "1"
//        // integer will be converted to Integer that will call toString()
//
//        System.out.println("Kunal" + new ArrayList<>());
//        System.out.println("Kunal" + new Integer(56));
//
//        String ans = new Integer(56) + "" + new ArrayList<>();
//        System.out.println(ans);

        // String Performance
//        String series = "";
//        for(int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            series += ch; // series += ch
//        }
//        System.out.println(series);

        // StringBuilder

//        StringBuilder builder = new StringBuilder();
//        for(int i=0;i<26;i++){
//            char ch = (char)('a'+i);
//            builder.append(ch);
//        }
//        System.out.println(builder.toString());

//        builder.reverse();
//        System.out.println(builder.toString());

//        builder.deleteCharAt(builder.length()-1);
//        System.out.println(builder.toString());

//          builder.insert(0,'a');

        // METHODS:

//        String name = "Kunal Kushwaha";
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.indexOf('a'));
//        System.out.println(Arrays.toString(name.split(" ")));

        // Ques : String is a Palindrome or not:

        String str = "abcda";
        System.out.println(isPalindrome(str));
    }
        static boolean isPalindrome(String str){
            if(str == null || str.length() == 0){
                return true;
            }
            str = str.toLowerCase();
            for (int i = 0; i <= str.length() / 2; i++) {
                char start = str.charAt(i);
                char end = str.charAt(str.length() - 1 - i);
                if (start != end) {
                    return false;
                }
            }
            return true;
        }

    }
