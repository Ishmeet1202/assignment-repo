package javamodule.IntroToJava1.Question7;

public class MultiCatchExp {
    public static void main(String[] args) {
        try {

            int[] arr = {1,2,3};
            System.out.println(arr[3]);

        } catch (IndexOutOfBoundsException  e) {
            System.out.println("Exception: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: "+e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
