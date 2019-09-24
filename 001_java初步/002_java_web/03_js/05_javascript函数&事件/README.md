# javascript 函数
1. 创建函数
    1. 直接创建
        ```
        function 函数名称(参数列表){
            函数体
            return 返回值
        }
        ```  
    2. 函数表达式
        ```
            var 函数名称(参数列表){
                函数体
            }
        ```
    3. Function构造函数
        ```
        var 函数名称 = new Function(参数列表，函数体);
        ```

2. 全局函数简介
    1. decodeURI()
        * 解码某个编码的URI
    2. decodeURIComponent()
        * 编码一个编码的URI组件
    3. encodeURI()
        * 把字符串编码为URI
    4. encodeURIComponent()
        * 把字符串编码位URI
    5. escape()
        * 对字符串编码
    6. unescape()
        * 对字符串解码
    7. eval()
        * 计算JavaScript字符串，并作为脚本执行
    8. getClass()
    9. isFinite()
        * 是不是无穷
    10. isNaN()
        * 是不是NaN
    11. Number()
        * 把对象的值转换为数字
    12. parseFloat()
        * 解析一个字符串
    13. parseInt()
        * 解析一个整数
    14. String()
        * 把对象的值转换为字符串

3. 事件
    1. onblur
        * 元素失去焦点
    2. onchange
        * 用户改变域的内容
    3. onclick
        * 鼠标点击某个对象
    4. ondblclick
        * 鼠标双击
    5. onerror
        * 文档加载或图像发生某个错误
    6. onfocus
        * 元素获得焦点
    7. onkeydown
        * 某个键盘的键被按下
    8. onkeypress
        * 某个键盘的键被按下或按住
    9. onkeup
        * 某个键盘的键被松开
    10. onload
        * 某个页面或图像被完成加载
    11. onmousedown
        * 鼠标某个按键被按下
    12. onmousemove
        * 鼠标被移动
    13. onmouseout
        * 鼠标从某元素移开
    14. onmouseover
        * 鼠标被移动某元素之上
    15. onmouseup
        * 某个鼠标按键被松开
    16. onreset
        * 重置按钮被点击

4. 事件绑定
    * 在javascript中事件经常与函数一起使用，那么我们介绍一下怎样将一个事件与函数绑定到一起，简单说，就是某个事件被触发后，函数如果被调用。事件的三要素：事件、事件源、响应行为
    * onclick 事件
        ```
            <script type="text/javascript">
                function clickMe(){
                    alert('click');
                }
            </script>
        ```
        ```
        <button onclick="clickMe()">click me</button>
        ```
    * onChange 事件
        * [source](file/01_onchange事件.html)
    
    * onfoucus onblur 事件
        * [source](file/02_onfoucus_onblur事件.html)
    * onmouseout onmouseover 事件
    * onload 事件