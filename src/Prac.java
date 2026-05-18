public class Prac {
    public static void main(String[] args) {
        String[] arr = { "banana", "apple", "kiwi", "grape" };

        String shortest = arr[0];

        for (String word : arr) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Lowest word: " + shortest);
    }
}