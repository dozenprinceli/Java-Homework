### 2. 按要求编写一个Java应用程序
#### 编写一个矩形类Rect，包含：两个protected属性：矩形的宽width；矩形的高height。 
> 两个构造方法
* 一个带有两个参数的构造方法，用于将width和height属性初化；
* 一个不带参数的构造方法，将矩形初始化为宽和高都为10。
> 两个方法
* 求矩形面积的方法area()
* 求矩形周长的方法perimeter()
#### 通过继承Rect类编写一个具有确定位置的矩形类PlainRect，其确定位置用矩形的左上角坐标来标识，包含：
* 添加两个属性：矩形左上角坐标startX和startY。
* 两个构造方法：带4个参数的构造方法，用于对startX、startY、width和height属性
* 初始化；不带参数的构造方法，将矩形初始化为左上角坐标、长和宽都为0的矩形；
* 添加一个方法：判断某个点是否在矩形内部的方法isInside(double x,double y)。如在矩形内，返回true, 否则，返回false。

##### 提示：点在矩形类是指满足条件：x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)。
