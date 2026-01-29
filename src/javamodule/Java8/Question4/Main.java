package javamodule.Java8.Question4;

public class Main extends Thread {

    public static void main(String[] args) {
        CharArrayToString cts = String::new;
        String str = cts.convert(new char[]{'H','e','l','l','o'});
        System.out.println("String from char array: "+str);

    }
}