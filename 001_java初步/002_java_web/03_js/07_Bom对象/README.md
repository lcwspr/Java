# javascript BOM
## javascript bom介绍
* IE 3.0 和 Netscape Navigator 3.0 提供了一种特性 - BOM（浏览器对象模型），可以对浏览器窗口进行访问和操作。
* 使用 BOM，开发者可以移动窗口、改变状态栏中的文本以及执行其他与页面内容不直接相关的动作。
* 使 BOM 独树一帜且又常常令人怀疑的地方在于，它只是 JavaScript 的一个部分，没有任何相关的标准。
* BOM 主要处理浏览器窗口和框架，不过通常浏览器特定的 JavaScript 扩展都被看做 BOM 的一部分。这些扩展包括：
    * 弹出新的浏览器窗口
    * 移动、关闭浏览器窗口以及调整窗口大小
    * 提供 Web 浏览器详细信息的定位对象
    * 提供用户屏幕分辨率详细信息的屏幕对象
    * 对 cookie 的支持
    * IE 扩展了 BOM，加入了 ActiveXObject 类，可以通过 JavaScript 实例化 ActiveX 对象
* 由于没有相关的 BOM 标准，每种浏览器都有自己的 BOM 实现。有一些事实上的标准，如具有一个窗口对象和一个导航对象，不过每种浏览器可以为这些对象或其他对象定义自己的属性和方法。

## Window 对象
* window 对象表示浏览器中打开的窗口
* 如果文档包含框架(frame或iframe标签)，浏览器会为html文档创建一个window对象，并为每个框架创建一个额外的window对象
* window对象集合
    *  frame[] 
* window对象 属性列表
    1. closed
        * 返回窗口是否已被关闭
    2. defaultStatus
        * 设置或返回冲口状态栏中的默认文本
    3. document
        * 文档
    4. history
        * History对象的只读引用
    5. innerheight
        * 返回窗口的文档显示区的高度
    6. innerwidth
        * 返回窗口的文档显示区的宽度
    7. location
        * 窗口或框架的Location对象
    8. name
        * 设置或返回窗口的名称
    9. Navigator
        * 对于Navigator的只读引用
    10. opener
        * 返回对于创建此窗口的引用
    11. screen

* window 对象方法
    1. alert()
    2. blur()
    3. clearInterval()
    4. clearTimeout()
    5. close()
    6. confirm()
    7. createPopup
    8. ....

* 例子
    * 三个弹窗的方法
        1. alert()
        2. prompt('warn')
        3. confirm('warn')
    
    * open方法
        * window.open()
            * 可以打开另一个窗口
    * setTimeout 方法
        * 基本都一样
    * setInterval 方法
    