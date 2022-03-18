### 7. 利用接口做参数，写个计算器，能完成+-*/运算
* 定义一个接口Compute含有一个方法int computer(int n,int m);
* 设计四个类分别实现此接口，完成+-*/运算
* 设计一个类UseCompute，含有方法：
```
public void useCom(Compute com, int one, int two)
```
此方法要求能够：
    
> 1. 用传递过来的对象调用computer方法完成运算
> 
> 2. 输出运算的结果
* 设计一个测试类，调用UseCompute中的方法useCom来完成+-*/运算。
