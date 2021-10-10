public interface Foo {

    default String prepare() {
        String word = "HELLO WORLD";
        return lowCase(word);
    }

    private String lowCase(String word) {
        return word.toLowerCase();
    }

    static void printWord() {
        System.out.println("HELLO");
        printWorld();
    }
    
    private static void printWorld() {
        System.out.println("WORLD");
    }
}
