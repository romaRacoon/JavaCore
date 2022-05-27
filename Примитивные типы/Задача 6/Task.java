public class Task {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw?"));
    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("\\W","");
        return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }
}