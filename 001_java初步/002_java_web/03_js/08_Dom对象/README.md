# DOM 介绍
## DOM 介绍
1. DOM(文档对象模型)是HTML和xml的应用程序接口(api),DOM将把整个页面规划成由节点层级构成的文档，html或xml页面的每个部分都是一个节点的衍生物。
## DOM元素的获取
1. getElementById()
2. getElementByTagName()
3. getElementsByName()

## DOM 节点操作
1. hasChildNodes()
2. firstChild/lastChild
3. replaceChild()
    * ![example](file/01_replace.html)
4. getAttribute
5. setAttribute

## 节点增删查改
1. document.createElement
2. document.createTextNode
3. 都是使用父元素
    * appendChild
    * insertBefore
    * insertAfter ---  jquery才有
    * removeChild