# 基本数据类型变量的定义注意事项
1. 赋值的时候要注意float类型和long类型，加大写的F和L
2. 作用域问题，同一个作用域不能使用相同的变量名
3. 初始化值问题，局部变量在使用之前必须赋值
    * 否则会报错，The local variable b may not have been initialized
    * b这个局部变量没有被初始化
4. 一条语句可以定义多个变量，eg:int a, b, c
    `int a, b, c`
