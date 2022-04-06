package pers.dozenlee.exp.exp3.exp3_7;

/**
 * @author DozenPrince Li
 * @date 2022/3/25
 */
public class UseCompute {
    // 为了方便使用JUnit4进行测试，修改了这里的返回值
    public int useCom(Compute com, int one, int two) {
        int res = com.computer(one, two);
        System.out.println(res);
        return res;
    }
}
