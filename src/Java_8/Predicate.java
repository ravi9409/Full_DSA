package Java_8;

import java.util.List;

public class Predicate {

    public static void main(String[] args) {

        // --- 1. test(T) ---
        // Core abstract method: evaluates the predicate on the given argument
        java.util.function.Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("test() - Is 4 even? " + isEven.test(4));   // true
        System.out.println("test() - Is 7 even? " + isEven.test(7));   // false

        // --- 2. and(Predicate) ---
        // Returns a composed predicate: this AND other (short-circuits on false)
        java.util.function.Predicate<Integer> isPositive = n -> n > 0;
        java.util.function.Predicate<Integer> isEvenAndPositive = isEven.and(isPositive);
        System.out.println("\nand() - Is 4 even AND positive? " + isEvenAndPositive.test(4));    // true
        System.out.println("and() - Is -4 even AND positive? " + isEvenAndPositive.test(-4));   // false

        // --- 3. or(Predicate) ---
        // Returns a composed predicate: this OR other (short-circuits on true)
        java.util.function.Predicate<Integer> isNegative = n -> n < 0;
        java.util.function.Predicate<Integer> isEvenOrNegative = isEven.or(isNegative);
        System.out.println("\nor() - Is 3 even OR negative? " + isEvenOrNegative.test(3));    // false
        System.out.println("or() - Is -3 even OR negative? " + isEvenOrNegative.test(-3));   // true
        System.out.println("or() - Is 4 even OR negative? " + isEvenOrNegative.test(4));     // true

        // --- 4. negate() ---
        // Returns a predicate that is the logical negation of this predicate
        java.util.function.Predicate<Integer> isOdd = isEven.negate();
        System.out.println("\nnegate() - Is 5 odd? " + isOdd.test(5));   // true
        System.out.println("negate() - Is 6 odd? " + isOdd.test(6));    // false

        // --- 5. isEqual(Object) [static] ---
        // Returns a predicate that tests if the argument is equal to the target (uses Objects.equals)
        java.util.function.Predicate<String> isHello = java.util.function.Predicate.isEqual("hello");
        System.out.println("\nisEqual() - Is 'hello' equal? " + isHello.test("hello"));  // true
        System.out.println("isEqual() - Is 'world' equal? " + isHello.test("world"));   // false
        System.out.println("isEqual() - Is null equal? "  + isHello.test(null));         // false

        // isEqual handles null target safely
        java.util.function.Predicate<String> isNull = java.util.function.Predicate.isEqual(null);
        System.out.println("isEqual(null) - Is null equal? " + isNull.test(null));       // true

        // --- 6. not(Predicate) [static, Java 11+] ---
        // Static factory for negate — cleaner with method references
        List<String> words = List.of("hello", "  ", "world", "", "java");
        System.out.println("\nnot() - Non-blank words:");
        words.stream()
             .filter(java.util.function.Predicate.not(String::isBlank))
             .forEach(System.out::println);  // hello, world, java

        // --- Practical chaining example ---
        java.util.function.Predicate<String> longerThan3 = s -> s.length() > 3;
        java.util.function.Predicate<String> startsWithJ  = s -> s.startsWith("j");

        System.out.println("\nChaining - Words longer than 3 chars AND starting with 'j':");
        words.stream()
             .filter(longerThan3.and(startsWithJ))
             .forEach(System.out::println);  // java
    }
}
