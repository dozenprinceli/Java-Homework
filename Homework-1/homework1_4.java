/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class homework1_4 {
    
    public static void main(String[] args) {
        int deno = 1, nume = 2, temp;// 分母、分子、缓冲数
        double sum = 0, frac;
        
        for (int i = 1;i <= 20;i++) {
            frac = nume / deno;
            sum += frac;

            temp = nume + deno;
            deno = nume;
            nume = temp;
        }
        
        System.out.println("数列的前20项和为" + sum);
    }
}