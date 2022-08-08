package frequency;

public class CountOfRepeatingChars {

    public static String countOfRepeatingChars(String str){

        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char each : str.toCharArray()){
            if (temp == each){
                count++;
            }else{
                result += "" + temp + count;
                temp = each;
                count = 1;
            }
        }
        return result;

    }

    public static void main(String[] args) {

        System.out.println(countOfRepeatingChars("aabcccddaaaa"));


    }
}
/*
Write a method that compresses a string based on the count of repeated characters.
 aabcccddaaaa -->  a2b1c3d2a4
*/