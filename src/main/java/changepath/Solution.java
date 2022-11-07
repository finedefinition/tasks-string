package changepath;

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13.02";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int index = path.indexOf("/");
        int index2 = path.indexOf("/", index + 1);
        int index3 = path.indexOf("/", index2 + 1);
        int index4 = path.indexOf("/", index3 + 1);

        String first = path.substring(0, index3 + 1);
        String last = path.substring(index4);
        String result = first + jdk + last;
        System.out.println(result);
        return result;
    }
}
