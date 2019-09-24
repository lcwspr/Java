# 基本知识练习题
1. java是那个公司开发的？ 候来被哪个公司收购
    * sun
    * oracle
2. 查看环境变量
    * path
3. java跨平台是因为
    * JVM的支持
4. JDK里面包含JRE对不对
    * 对的
5. JRE包含JVM对吗
    * 对的
6. 简单解释一下什么是JVM
    * JVM 是Java虚拟机，用来解释执行class文件
7. window中配置jdk的bin目录到环境变量path,目的是什么
    * 在任意目录下都可以执行javac,java命令
8. classpath配置环境变量有什么作用
    * classpath路径是java虚拟机寻找class文件的路径
9. java中的基本数据类型4类8种指的是什么
    * 整数类型
        * byte, short, int, long
    * 浮点类型
        * float, double
    * 字符类型
        * char
    * 布尔类型
        * boolean
10. long 和 float的取值范围谁的大
    * float,因为float和long值的计算方式不一样。
    * long最大值2^63-1,float = (-s) * M * 2 ^ E
        * s是一位符号位
        * E是2~9位，指数位  (-128 ~ 127)
        * M是其余有效数字

11. 有一个小于500的三位数abc,对于这个三位数，甲乙丙丁有如下说法
    1. 甲： 这个三位数能够被2整除3次
    2. 乙： 这个三位数能被3整除2次
    3. 丙： 这个三位数能够被7整除
    4. 丁： 这个三位数的各个数字之和是15
    * 如果甲乙丙丁中有一个人说了谎，那么2a+b-c等于多少