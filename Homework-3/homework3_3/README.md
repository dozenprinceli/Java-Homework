### 3. 按要求编写Java应用程序
#### 创建项目testpackage
在该项目下创建包pack1和包pack2

在pack1下创建类A和类B

在pack2下创建类B和类C

在pack1.B的main方法中创建一个类A的对象a

在pack2.C的main方法中创建一个类A的对象a
#### 在pack2.B中添加方法f如下
```
public void f(){		
    System.out.println("执行pack2包中的类B的方法f");
}
```

在pack2.C中创建pack2.B的对象b，并调用方法f
#### 在类A中添加如下三个成员变量
int型的私有变量i

float型的变量f

double型的公有变量d

在pack1.B的main方法中为对象a的成员变量f和d分别赋值为2和3

在pack2.C的main方法中为对象a的成员变量d赋值为3。
