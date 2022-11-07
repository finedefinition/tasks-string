package examples;

public class Example1 {

    char a = '1';
    char b = '2';
    char c = '3';
    char[] chars = new char[]{a, b, c,};
}

    class Example1Test {

        public static void main(String[] args) {
            Example1 a = new Example1();
            String s = new String(a.chars);
            System.out.println(s);
        }
    }


