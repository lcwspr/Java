# helloworld编写与编译
## jdk目录解析
* jdk的主目录，home就是主安装路径
    * bin
        * 存放可执行程序，javac,java,jar,javadoc
    * db
        * java实现的开源数据库
    * jre
        * java runtime environment的缩写
    * include
        * jdk是使用c/c++实现的，所以启动是需要引用一些c的头文件
    * lib
        * java类库或者库文件
    * src.zip
        * java基础类源代码

## helloworld编写
1. 创建Helloworld.java
2. 编写代码
    ```
        class HelloWorld{
            public static void main(String[] args){
                System.out.println('hello world');
            }
        }
    ```
3. 编译
    * javac HelloWorld.java
4. 执行class文件
    * java HelloWorld

## javac && java命令执行的路径
1. javac 是一个将.java编译为.class文件命令
2. javac命令的具体路径是jdk的home目录的bin文件夹下
3. cmd中寻找每一个命令都是从当前目录中寻找，找不到去path中寻找
4. 如果在命令行执行javac HelloWorld.java返回javac不是内部或者外部命令，也不是可运行的程序， 