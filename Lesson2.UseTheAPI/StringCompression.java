/*
Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd; выход: a4b3c1d2
*/
public class StringCompression {
    public static void main(String[] args) {
        
        String example = "aaaabbbcdd";

        System.out.println(createNewString(example));
    }

    public static String createNewString(String example) {

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar = example.charAt(0);
        for (int i = 1; i < example.length(); i++) {
            if (example.charAt(i) == currentChar) {
                count++;
            }
            else {
                sb.append(currentChar).append(count);
                currentChar = example.charAt(i);
                count = 1;
            }
        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }
}
