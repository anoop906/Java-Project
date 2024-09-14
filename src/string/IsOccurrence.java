package string;

public class IsOccurrence {

    public static void main(String[] args) {
        String str = "This is java";
        String[] newStr = str.toLowerCase().split(" ");
        int len = newStr.length;
        String word = "is";
        int count = 0;

        for (int i = 0; i < len; i++) {
        	if (newStr[i].contains(word)) {
                count++;
            }
        }
        System.out.println("Count of 'is' = " + count);
    }
}
