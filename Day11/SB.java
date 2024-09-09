package Day11;

public class SB {
    public static void main(String[] args) {
        StringBuilder series = new StringBuilder();
        for(int i = 0; i < 26; i++){
            char ch = (char)('A' + i);
            series.append(ch + " ");
        }
        System.out.println(series);
    }
}
