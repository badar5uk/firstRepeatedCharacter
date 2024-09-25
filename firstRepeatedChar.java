public class FirstRepeatedChar {

    public static void main(String[] args) {

        String word = "successs";
        char[] stringtoChar = word.toCharArray();
        boolean[] booleans = new boolean[26];
        for (char checker : stringtoChar) {
            int index = checker - 'a';
            if (booleans[index] == true) {
                System.out.println("Found " + checker);
                break;
            }
            if (booleans[index] != true) {
                booleans[index] = true;
            }
        }
    }
}




