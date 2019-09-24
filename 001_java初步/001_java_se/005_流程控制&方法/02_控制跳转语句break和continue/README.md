# 控制跳转语句
## break, continue
* 只能放在循环，(break)能够用于 switch,break cannot be used outside of a loop or a switch 

## 循环标记
* 标记： 给循环结构指定一个名字
* 作用： 标记某个循环然后对其进行控制
```
public static void main(String[] args){
    out:for(int i = 1; i <= 10; i++){      // 外循环
        inner:for(int j = 1; j <=1; j++){  // 内循环
            if(i % 3 == 0){
                // 看下continue out 和inner的区别
                continue out;
            }
            sout("*");
        }

    }
}
```

# return
* return 的作用
    1. 返回
    2. 其实他的作用是结束方法
    3. 也就是return 后面的代码都不执行了
* return 和 break以及continue的区别
    1. return是结束方法
    2. break是跳出循环
    3. continue是终止本次循环继续下层循环