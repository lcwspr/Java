# 死循环&循环练习
1. 两种死循环
    * while语句无限循环while(true)
    * for 语句无限循环for(;;)

2. 注意for循环
    ```
        for(int i = 0; i <=1000; i++);
        {
            sout("我爱你");
        }
    ```

## 循环练习
1. 循环结构循环嵌套输出4行5列星星
    ```
    for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= 5; j++){
            sout("*")
        }
        soutln("");
    }
    ```
2. 循环结构循环嵌套输出直角三角形
    ```
    int row = 4;
    for(int i = 1; i <= row; i++)
    {
        for(int j = 1; j <= i; j++){
            sout("*");
        }
        soutln();
    }
    ```

3. 循环结构九九乘法表
    1. for循环实现
        ```
            for(int i = 1; i <= 9; i++){
                for(int j = 1; j <= i; i++){
                    sout("%d * %d = %d".formort(j, i, i*j));
                }
                soutln();
            }
        ```