public class homework1_4 {
    public static void main(String[] args) {
        int deno = 1;//denominator
        int nume = 2;//numerator
        int temp;
        double sum = 0;
        double frac;//fraction
        for (int i = 1;i <= 20;i++) {
            frac = nume / deno;
            sum += frac;
            temp = nume + deno;
            deno = nume;
            nume = temp;
        }
        System.out.println(sum);
    }
}