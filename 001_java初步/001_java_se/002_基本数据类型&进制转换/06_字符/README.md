# 字符
* 字符是指计算机中使用的字母，数字，符号。。
    * 在ascii编码中，一个英文字母字符存储需要1个字节
    * 在GB2312编码或者GBK编码，一个汉字字符存储需要2个字节
    * 在UTF-8中，一个英文字母需要占用1个字节，一个汉字存储需要3-4个字节
## 字符的定义
1. 使用char来定义字符类型
2. 给char赋值，如果是字母或者其他字符使用单引用号
    * `char a = 'a';`
3. 给char赋值时，可以直接使用ascii表的数字
    * `char b = 97;` 
4. 在ascii码表中A与小写的a相差32

## 字符的相加
* 字符相加会把字符对应的ascii数字相加
    ```
        char c1 = 'a';
        char c2 = 'b';
        sout(c1 + c2)  // 195
    ```
* 记住三个ASCII编码的值
    * '0' 为 48
    * 'A' 为 65
    * 'a' 为 97

## 字符与字符串的相加
```
    char ch1 = 'a';
    char ch2 = 'b';
    char ch3 = 48;
    sout(ch3)        // 0

    char c1 = 'a';           // 97
    char c2 = 'b';           // 98
    sout(c1 + c2 + "java");  // 195java
    sout(c1 + "java" + c2)   // ajavab
```

## char数据与中文
* char数据类型
    * char在ascii编码中占1个字节，取值在0-127
    * char在unicode编码中占2个字节，取值在0-65535
* java语言中的字符char可以存储一个中文吗？
    * 可以java语言采用的时unicode编码，unicode编码中每个字符占用两个字节，中文也是占用的两个字节，utf-8编码时unicode中的一种编码，所以Java中的字符可以存储一个中文汉字