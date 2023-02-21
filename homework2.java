public class homework2 {
    public static void main(String[] args) {
        String input = "Добрый день Как дела Все хорошо";
        String output = normalizeString(input);
        System.out.println(output);
    }

    public static String normalizeString(String input) {
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = Character.toUpperCase(word.charAt(0));
            result.append(firstChar).append(word.substring(1));
            if ((i + 1) % 2 == 0) {
                result.append(".");
            }
            if (i != words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}