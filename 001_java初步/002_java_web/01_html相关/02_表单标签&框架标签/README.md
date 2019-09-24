# 表单标签&框架标签
## 表单标签
1. form标签
    * \<form>标签代表一个表单，表单用于向服务器传输数据。
    * \<form>标签能够包含\<input>，可以是文本字段，复选框，单选框或提交按钮等。还可以包含\<textarea> \<select>等。
    * \<form>常用属性:
        * name:用于定义表单的名称
        * action:用于规定提交表单时向何处发送表单数据。
        * method:用于规定提交的方式。一般取值 POST或GET
        * 关于POST与GET方式区别:
        * get方式只能少量数据,而post可以携带大数据。
        * get方式提交时，数据会在地址栏上显示，安全性差。Post方式提交不会在地址栏上显示数据，更加安全。
2. 常用表单标签
    * \<input> 标签用于搜集用户信息。
        * 根据不同的 type 属性值，输入字段拥有很多种形式。输入字段可以是文本字段、复选框、掩码后的文本控件、单选按钮、按钮等等。
        * 关于<input>标签type属性值说明 :
    1. text
        * \<input type=”text”> 
        * 定义单行的输入字段，用户可在其中输入文本。默认宽度为 20 个字符。
        * 其它常用属性:
            * name:定义标签名称
            * value:定义标签值
            * size:定义输入字段的长度
            * maxlength:定义可输入最大字符个数
            * Placeholder: 提示内容
    2. password
        * \<input type=”password”>
        * 定义密码字段。该字段中的字符被掩码.
        * 其它常用属性:
            * name:定义标签名称
            * value:定义标签值
            * size:定义输入字段的长度
            * maxlength:定义可输入最大字符个数

    3. radio
        * \<input type=”radio”>
        * 定义单选按钮。
        * 其它常用属性:
            * name:定义标签名称.注意，对于单选按钮，如果要想做到单一选择，多个radion的name值必一样。
            * value:定义标签值
            * checked:定义该标签默认被选中。

    4. checkbox
        * \<input type=”checkbox”>
        * 定义复选框。
        * 其它常用属性:
            * name:定义标签名称.注意，一组的checkbox它们的name值应该是一样的。
            * value:定义标签值
            * checked:定义该标签默认被选中。

    5. button
        * \<input type=”button”>
        * 定义可点击按钮（多数情况下，用于通过 JavaScript 启动脚本）
        * 其它常用属性:
            * name:定义标签名称
            * value:按钮显示名称

    6. hidden
        * \<input type=”hidden”>
        * 定义隐藏的输入字段。
        * 其它常用属性:
            * name:定义标签名称
            * value:定义标签值

    7. file
        * \<input type=”file”>
        * 定义输入字段和 "浏览"按钮，供文件上传。
        * 其它常用属性:
            * name:定义标签名称

    8. submit
        * \<input type=”submit”>
        * 定义提交按钮。提交按钮会把表单数据发送到服务器。
        * 其它常用属性:
            * name:定义标签名称
            * value:按钮显示名称

    9. reset
        * \<input type=”reset”>
        * 定义重置按钮。重置按钮会清除表单中的所有数据。(清楚一个form标签里面的)
        * 其它常用属性:
            * name:定义标签名称
            * value:按钮显示名称

    10. image
        * \<input type=”image”>
        * 定义图像形式的提交按钮。
        * 这个标签主要是用了替换submit按钮，因为默认产生的提交按钮并不漂亮，这个标签允许你采用指定的图片做为提交按钮。
        * 其它常用属性:
            * name:定义标签名称
            * src:定义作为提交按钮显示的图像的url
            * alt:定义作用图像的替代文本。

    11. select与option标签 
        * \<select>用于定义一个下拉列表
        * 常用属性:
            * name:定义下拉列表的名称
            * size:定义下拉列表中可见选项的数目
            * multiple:定义可选择多个选项
        * \<option>用于定义下拉列表中的选项。
        * \<option>需要位于\<select>标签内部
        * 常用属性:
            * value:定义送往服务器的选项值
            * selected:定义选项为选中状态。
 

    12. textarea标签 
        * \<textarea>标签用于定义一个多行文本输入控件(多行文本框,文本域)
        * 常用属性:
            * name:定义多行文本框名称
            * cols:定义多行文本框可见宽度
            * rows:定义多行文本框可见行数
            * wrap:规定多行文本框中文字如何换行。

## 元信息标签&特殊字符
1. meta标签
    * \<meta> 元素可提供有关页面的元信息（meta-information），比如针对搜索引擎和更新频度的描述和关键词。
        * \<meta> 标签位于文档的头部，不包含任何内容。
        * \<meta> 标签的属性定义了与文档相关联的名称/值对。
    * 常用属性：
        * content:定义与http-equiv或name属性相关的元信息
        * http-equiv:把content属性关联到HTTP头部
        * name:把content属性关联到一个名称。
    * HTML4设置编码格式
        * \<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    * HTML5设置编码格式
        * \<meta charset="UTF-8">

2. link标签
    * \<link> 标签定义文档与外部资源的关系。
    * \<link> 标签最常见的用途是链接样式表。
    * \<link>只能存在于 head 部分，不过它可出现任何次数。	
    * 常用属性:
        * type:定义被链接的文档的MIME类型
        * href:定义被链接的文档的URL
        * rel:定义当前文档与被链接文档之间的关系。

## 框架
* 所谓框架就是将页面划分成几个窗框，就可以让我们在同一个浏览器中显示不止一个页面。
1. \<frameset>
    * \<frameset>是框架结构标签，它定义如何将窗口分割为框架.
    * 注意:不能与 \<frameset>\</frameset> 标签一起使用 \<body>\</body> 标签。
    * 常用属性:
        * cols:垂直切割，就是分为左右
        * rows:横向切割， 就是分为上下
        * frameborder:定义框架的边框，其值可以有0和 1，0表示不要边框，1表示要显示边框。
        * border:定义框架的边框厚度
        * bordercolor:定义框架的边框颜色
        * framespacing:定义框架与框架之间的距离。
1. \<frame>
    * \<frame>是框架标签，它定义放置在每个框架中的页面。
    * 常用属性:
        * src:定义此框架要显示的页面url
        * name:定义此框架的名称
        * frameborder:定义框架的边框，其值可以有0和 1，0表示不要边框，1表示要显示边框。
        * framespacing:定义框架与框架之间的距离
        * bordercolor:定义框架的边框颜色
        * scrolling:定义是否显示卷轴，YES表示要显示，NO表示不显示，AUTO视情况而定。
        * noresize:定义框架大小不可以改变。
        * marginhight:定义框架高度部分边缘所保留的空间。
        * marginwidth:定义框架宽度部分边缘所保留的空间。
<iframe>
    * iframe 元素会创建包含另外一个文档的内联框架（即行内框架）
    * 常用属性:
        * src:定义些框架要显示的页面url
        * name:定义些框架的名称
        * width:定义些框架的宽度
        * height:定义些框架的高度
        * marginwidth:定义插入的页面与框边所保留的宽度
        * marginheight: 定义插入的页面与框边所保留的高度
        * frameborder:定义框架的边框，1表示显示边框 ，0表示不显示
        * scrolling:定义是否允许卷动，YES允许，NO不允许。



