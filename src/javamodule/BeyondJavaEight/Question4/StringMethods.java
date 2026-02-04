package javamodule.BeyondJavaEight.Question4;

public class StringMethods {
    public static void main(String[] args) {
        String s = "   Java   ";

        System.out.println(s.trim());
        System.out.println(s.strip());
        System.out.println("".isBlank());

        System.out.println("Hi\n".repeat(3));

        System.out.println("Java".indent(4));

        String result = "hello".transform(str -> str.toUpperCase());
        System.out.println(result);

        String text = "   A\n   B";
        System.out.println(text.stripIndent());

        System.out.println("Line1\\nLine2".translateEscapes());

        String block = """
        This is
        Text Block
        """;

        System.out.println(block);

        System.out.println("My name is %s".formatted("Ishmeet"));

    }
}
