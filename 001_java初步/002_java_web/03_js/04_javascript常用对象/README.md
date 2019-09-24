# javascript常用对象
1. Boolean
    *  Boolean 对象是一个将布尔值打包的布尔对象。主要用于提供将布尔值转换成字符串的toString()方法
    * 语法
        * new Boolean(value);	//构造函数
        * Boolean(value);		//转换函数
        * 当作为一个构造函数（带有运算符 new）调用时，Boolean() 将把它的参数转换成一个布尔值，并且返回一个包含该值的 Boolean 对象。
        * 如果作为一个函数（不带有运算符 new）调用时，Boolean() 只将把它的参数转换成一个原始的布尔值，并且返回这个值。
    * 转换规则  
        * 如果省略value参数，或者设置0,-0,null,"",false,undefined或者NaN，则该对象设置为false,否则设置为true

2. Number
    * JavaScript 还支持 Number 对象，该对象是原始数值的包装对象。
在必要时，JavaScript 会自动地在原始数据和对象之间转换。
    * 两种语法
        * 一般调用
            * `var myNum = new Number(v);`
        * 构造调用
            * `var myNum = Number(v);`

3. Array
    * Array对象用于在单个变量中存储多个值
    * 语法
        1. new Array()
        2. new Array(size)
        3. new Array(ele1,ele2,ele3...);
    * 常用方法
        1. concat()
        2. join()
        3. pop()
        4. push()
        5. reverse()
        6. shift()
        7. unshift()
        8. slice()
            * 可以从已有的数组中返回选定的元素
            * array.slice(start,end)
                * start, 指定从哪里开始
                * end, 规定或何处结束选取，没有指定默认尾部
            * 注意不会修改原数组，返回子数组
        9. splice()
            * 向数组中添加/删除项目，然后返回被删除的项目
            * array.splice(index, howmany,item1,item...)
                1. 规定删除，添加的位置
                2. 要删除的项目的数量
                3. 向数组添加的新项目
        10. toSource()
        11. toString()
        12. toLocaleString()
        13. valueOf()

4. String
    * String 类定义了大量操作字符串的方法，例如从字符串中提取字符或子串，或者检索字符或子串。
    * 需要注意的是，JavaScript 的字符串是不可变的（immutable），String 类定义的方法都不能改变字符串的内容。像 String.toUpperCase() 这样的方法，返回的是全新的字符串，而不是修改原始字符串。
    * 常用方法
        * charAt()
            * 返回指定位置的字符
        * charCodeAt()
            * 返回在指定位置的字符的unicode编码
        * concat()
            * 连接字符串
        * indexOf()
            *检索字符串
        * lastIndexOf()
            * 从后向前搜索字符串
        
5. Date
    * Date()
        * 返回当前日期和时间
    * getFullYear()
        * 返回年
    * getMonth()
        * 返回月(0-11)
    * getDay()
        * 返回日
    * getHours()
        * 返回时
    * getMinutes()
        * 返回分
    * getSeconds()
        * 返回秒

6. Math
    * Math对象用于执行数学任务，使用Math的属性和方法的语法
    * 常用方法
        * abs(x)  
            * 返回数的绝对值
        * ceil(x) 
            * 对数字向上取整
        * floor(x) 
            * 对数向下取整数
        * max(x,y)
            * 返回数中大的
        * min(x,y)
            * 返回树中的小的
        * sqrt(x)
            * 平方根

7. RegExp
    * RegExp 对象表示正则表达式，它是对字符串执行模式匹配的强大工具。
    * 直接量语法。
        * /pattern/attributes
        * new RegExp(pattern, attributes);
    * 规则
        * [0-9] 
        * [A-Z]
        * [a-z]
        * [A-z]
        * \d 代表数据
        * \D	非数字
        * \w	查找单词字符
        * \W	查找非单词字符
        * \s	查找空白字符
        * \S	查找非空白字符
        * n+	出现至少一次
        * n*	出现0次或多次
        * n?	出现0次或1次
        * {5}   出现5
        * {2,8} 2到8次




