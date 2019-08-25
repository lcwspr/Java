# Switch
## 语法
```
switch(expression){
    case: value:
    // 语句
    break;
    case: value:
    // 语句
    break;
    default: // 可选
    // 语句
}
```
## switch语法规则
1. switch语句中的变量类型可以是：byte,short,int,long或char,从jdk 7开始，能够支持字符串类型，同时case标签必须为字符串常量或字面量
2. switch语句可以拥有多个case语句，每个case后面跟一个要比较的值和冒号。
3. case语句中的值的数据类型必须与变量的数据类型相同，而且只能是常量或者字面常量。
4. 当变量的值与case语句的值相等时，那么case语句之后的语句开始执行，直到出现break才会跳出switch
5. 当遇到break语句，switch语句终止，如果没有出现break语句那么程序会继续执行下一个case的内容，直到出现break语句
6. switch语句可以包含一个default分支，在没有case语句的值和表达式相等会执行，不需要break

## 练习
```
int y = 3;
switch(y){
    case 3:
        y++;
    case 4:
        y++;
    default:
        y++;
        break;
} // 6
```

```
byte可以作为switch的表达式吗
long可以作为switch的表达式吗
String可以作为switch的表达式吗  jdk1.7以后
```