package examples;

public class Example2 {

        public static int matchResult(int result1, int result2, int bet1, int bet2) {
            int result;
            if (result1 == bet1 && result2 == bet2) {
                result = 2;
            } else if ((result1 > result2 && bet1 > bet2) || (result1 < result2 && bet1 < bet2) || (result1 == result2 && bet1 == bet2)) {
                result = 1;
            } else {
                result = 0;
            }
            System.out.println(result);
            return result;
        }

public static int matchResult1(int result1, int result2, int bet1, int bet2) {
int result = (result1 == bet1 && result2 == bet2) ? 2 : ((result1 > result2 && bet1 > bet2) ||
        (result1 < result2 && bet1 < bet2) || (result1 == result2 && bet1 == bet2)) ? 1 : 0;

        System.out.println(result);
        return result;
}

    public static void main(String[] args) {
        matchResult1(0, 1, 1, 0); //0
        matchResult1(1, 2, 2, 3); //1
        matchResult1(1, 1, 2, 2); // 1
        matchResult1(2, 1, 2, 1); // 2
    }
}
