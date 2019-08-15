# java环境变量
## JAVA_HOME
* 目的，不需要进入到bin目录，也可以执行bin目录下的命令javac
    1. 点击，此电脑，右键属性-高级系统设置-高级-环境变量
    2. 在环境中新建JAVA_HOME=jdk的home目录
    3. 在系统环境变量中编辑path,追加路径%JAVA_HOME%\bin
    4. 在命令行可以输入echo %JAVA_HOME%\bin来查看环境变量

## CLASSPATH
* jvm在查找class文件时如果没有设置classpath会在当前路径查找，设置classpath后仅在classpath路径下查找class文件
* classpath不是必须配置的
* 一旦修改了环境变量的东西，一定要重新启动cmd命令行