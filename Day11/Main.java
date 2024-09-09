package Day11;

public class Main {
    public static void main(String[] args) {
        // String name = "Charu Kumar";
        // System.out.println(name);
        // String a = "Charu";
        // String b = "Charu";
        // // a = "Happy";
        // System.out.println(a == b);
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('A' + i);
            series +=ch + " ";
        }
        System.out.println(series);
    }
}
