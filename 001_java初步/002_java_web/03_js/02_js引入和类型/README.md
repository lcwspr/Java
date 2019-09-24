## javaScript引入
1. 直接在html中插入javascript代码
    * 如果需要在HTML页面中插入JavaScript代码，需要使用\<script>标签
    * 那些老旧的实例可能会在 \<script> 标签中使用 type="text/javascript"。现在已经不必这样做了。
    * JavaScript 是所有现代浏览器以及 HTML5 中的默认脚本语言。
    * 注意:\<script>标签可以出现在html页面的任意位置

2. 引入外部的JavaScript
    * 有时候，你可能希望在若干页面中运行javascript，同时不在每个页面中写相同的脚本，所以可以将js写入一个外部文件，然后使用js后缀保存这个文件
    * `<script src="xxx.js"></script>`

## 基本语法
1. Javascript基础语法
    * 变量声明
        * 变量是用于存储信息的容器
        * javascript中的变量与我们在java中的变量不一样。
        * 在javascript中使用 var 运算符（variable 的缩写）加变量名定义的
        * JavaScript 变量名称的规则：
        * 变量对大小写敏感（y 和 Y 是两个不同的变量） 
        * 变量必须以字母或下划线开始 
        * 注意：由于 JavaScript 对大小写敏感，变量名也对大小写敏感。

2. 数据类型
    * 在ECMAScript中，变量可以存在两种数据类型，即原始类型与引用类型。
    *原始类型，可以理解成是一个值类型。简单说，就是一个字面值，它是不可变的，例如: 10  “abc”
    * ECMAScript有五种原始类型
        * String  在javascript中字符串字符串字面值，可以使用单引号或双引号声明。
        * Number 在javascript中任何数字都看成是Number类型，它即可以表示32位整数，也可以表示64位浮点数。八进制首数字必须是0,十六进制使用0x开始。
        * Boolean 它有两个值true和false.
        * Undefined:该类型只有一个值undefined.表示的是未初始化的变量
        * Null 该类型只有一个值null,表示尚未存在的对象。值undefined实际上是从值null派生出来的。因此null==undefined得到的结果是true.
    * 通过typeof方法可以获取一个变量的类型
    * 注意：您也许会问，为什么 typeof 运算符对于 null 值会返回 "Object"。这实际上是 JavaScript 最初实现中的一个错误，然后被 ECMAScript 沿用了。现在，null 被认为是对象的占位符，从而解释了这一矛盾，但从技术上来说，它仍然是原始值。

3. 引用类型
    * 引用类型通常叫做类(class),也就是说，遇到引用值，所处理的就是对象。
    * 从传统意义上来说，ECMAScript 并不真正具有类。
    * ECMAScript 定义了“对象定义”，逻辑上等价于其他程序设计语言中的类。
    * 对象是由 new 运算符加上要实例化的对象的名字创建的var obj=new Object();
    * Object对象自身用处不大，但是 ECMAScript 中的 Object 对象与 Java 中的 java.lang.Object 相似，ECMAScript 中的所有对象都由这个对象继承而来，Object 对象中的所有属性和方法都会出现在其他对象中
    * 常用的javascript对象有 Boolean,Number,Array,String,Date,Math,RegExp.
    * 可以使用instanceof运算符来判断对象的类型。

## 类型转换

1. 类型转换
    * ECMAScript为开发者提供了大量的类型转换方法。
    * 大部分类型具有进行简单转换的方法，还有几个全局方法可以用于更复杂的转换。
    * Boolean 值、数字和字符串的原始值它们是伪对象，这意味着它们实际上具有属性和方法。

2. 转换成字符串
    * toString()方法.把number转成string,boolean转string
        ```
        <script>
            var x = 12;
            alert(x.toString())
        </script>
        ```

3. 转换成数字
    * parseInt() 和 parseFloat()。前者把值转换成整数，后者把值转换成浮点数。
    * 只有对 String 类型调用这些方法，它们才能正确运行；对其他类型返回的都是 NaN。
 

4. 强制类型转换
    * ECMAScript 中提供了三种强制类型转换：
        1.把给定的值转换成Boolean类型
            * `var x = 0; Boolean(x);`
        2.把给定的值转换成数字
            * `var y = "12"; Number(y);`
        3.把给定的值转换成字符串
            * `var z = true; String(z);`
            
	 

