# 构造方法 Constructor
## 构造方法基本
1. 构造方法作用： 给对象的数据(属性)进行初始化赋值
2. 构造方法格式特点：
    1. 方法名与类名要相同(大小也要与类名一致)
    2. 没有返回值类型，连void都没有
    3. 没有具体的返回值return 
3. 构造方法分为(有参构造)(无参构造)
4. 构造方法重载：
    * 指的方法名相同，与返回值类型无关，只看参数列表

## 构造方法注意
1. 如果我们没有给出构造方法，系统将会自动提供一个无参构造方法
2. 如果我们给出了构造方法，系统将不再提供默认的无参数构造
3. 如果已经声明了有参构造，还想要使用无参数的构造，必须要自己给出

## 正确的set和get方法，构造方法的书写
```
    public void setAge(int age){
        this.age = age;
    }
```
## 成员变量赋值的三种方式
1. 直接给属性赋值
    ```
    Student stu = new Student();
    stu.name = "zhangsan";
    ```
2. 通过setXxx()方法给属性赋值
3. 构造方法，给对象中属性进行初始化

## 手机类的创建
```
class Phone{
    private String brand;
    private double price;
    // 一般无参的构造方法不会干啥事，就空着就行
    public Phone(){}
    public Phone(String brand,double price){
        this.brand = brand;
        this.price = price;
    }

    // brand的set/get方法
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

}
```

## 创建一个对象的步骤内存分析
* 对象创建步骤
    1. Duck.class文件加载进入内存
    2. 声明一个Duck类型引用duck
    3. 在堆内存创建对象
    4. 给对象中属性默认初始化值
    5. 属性进行显示初始化
    6. 构造方法进栈，对对象中的属性赋值，构造方法弹栈
    7. 将对象地址赋值给duck

* [图解](img/01_创建一个的步骤分析.png)