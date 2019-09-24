# DQL 操作
## 查询关键字 SELECT 语法
* select 语法
    ```
    SELECT selection_list             /*要查询的列名称*/
    FROM table_list                   /*要查询的表名称*/
    WHERE condition                   /*行条件*/
    GROUP BY groupint_columns         /*对结果分组*/ 
    HAVING condition                  /*分组后的行条件*/
    ORDERBY BY sortion_columns        /*对结果排序*/
    LIMIT offset_start,row_count      /*结果限定*/
    ```
* 插入语法
    * 如果时插入所有字段，那么列选择名可以不写
    * 可以指定插入指定的列的值
* 基本查询
    1. 查询所有的列
        * `select * from 表名`
    2. 查询表的部分列
        * `select 列名1,列名2 from 表名`
* 条件查询
    1. 条件查询就是在查询的时候给出WHERE子句，在WHERE子句中可以使用如下关系运算符和关键字
        * =, !=, <>, <, <=, >, >=
        * BETWEEN AND
        * in (set)
        * IS NULL, IS NOT NULL
        * AND
        * OR
        * NOT
    * 例如
        * 查询性别为女，并且年龄为50的学生
            * `SELECT * FROM stu WHERE gender='female' and age>50`
        * 查询学号为S_1001，S_1002，S_1003的记录 (in ())
            * `select * from stu where sid in ('S_1001','S_1002','S_1003');`
        * 查询学号不是S_1001，S_1002，S_1003的记录[no in ()]
            * `select * from stu where sid not in ('S_1001','S_1002','S_1003');`
        * 查询年龄为null的记录[is null]
            * `SELECT * FROM　stu WHERE age IS NULL`
        * 查询年龄在20~40之间
            * `select * from stu where age >= 20 and age <= 40;`
            * `select * from stu where age between 20 and 40;`
        * 查询性别为非男的学生
            * `SELECT * FROM stu WHERE gender!='male';`
            * `SELECT * FROM stu WHERE gender<>'male';`
            * `SELECT * FROM stu WHERE NOT gender='male';`
        * 查询姓名不为null的学生记录
            * `SELECT * FROM stu WHERE sname IS NOT NULL;`
            * `SELECT * FROM stu WHERE NOT sname IS NULL;`

* 模糊查询
    * 当想要查询姓名中包含a字母的学生时就需要使用模糊查询，模糊查询需要使用关键字LIKE
        * 通配符
            * `_ 任意一个字符`
            * `% 任意0~n个字符`
    * 例子
        * 查询姓名由5个字母构成的学生记录
            * `SELECT * FROM stu WHERE sname LIKE '_____'`
        * 查询名字中包含字母a的学生
            * `SELECT * FROM stu WHERE sname LIKE '%a%'`

* 字段的控制
    * 去除重复记录
        * 去除重复记录（两行或两行以上记录中系列的上的数据都相同），例如emp表中sal字段就存在相同的记录。当只查询emp表的sal字段时，那么会出现重复记录，那么想去除重复记录，需要使用DISTINCT：
        * `SELECT DISTINCT sal FROM emp;`

    * 列之间可以进行算数运算
        * 因为sal和comm两列的类型都是数值类型，所以可以做加运算。如果sal或comm中有一个字段不是数值类型，那么会出错。
            * `SELECT *,sal+comm FROM emp;`
        * comm列有很多记录的值为NULL，因为任何东西与NULL相加结果还是NULL，所以结算结果可能会出现NULL。下面使用了把NULL转换成数值0的函数IFNULL：
            * `SELECT *,sal+IFNULL(comm,0) FROM emp`
    * 给列名添加别名
        * 在上面查询中出现列名为sal+IFNULL(comm,0)，这很不美观，现在我们给这一列给出一个别名，为total：
        * `SELECT *, sal+IFNULL(comm,0) AS total FROM emp;`
        * SELECT *,sal+IFNULL(comm,0)  total FROM emp;  其实可以省略as关键字

* 排序
    * `order by 列名 asc(默认) 升序 desc 降序`
        * 查询所有学生的记录，按年龄升序排序
            * `select * from stu order by age;`
        * 查询所有雇员，按月薪降序排序，如果月薪相同时，按编号升序排序
            * `SELECT * FROM emp ORDER BY sal DESC,empno ASC;`
        
* 聚合函数
    * COUNT()：*** 统计指定列不为NULL的记录行数；***
        * 查询emp表中的记录数
            * `select count(*) from emp;`
        * 查询emp表中有佣金的人数
            * `SELECT COUNT(comm) cnt FROM emp;`
                * 给出了comm列，所以只会统计comm列非NULL的行数
        * 查询emp中由佣金，且佣金不为0的
            * `SELECT COUNT(comm) cnt FROM emp where comm != 0`
        * 查询月薪大于2500的人数
            * `SELECT count(*) from emp where sa1 > 2500;`
            * `SELECT count(*) from emp WHERE sal+ifnull(comm,0)>2500`
        * 查询有佣金的人数，有领导的人数
            * `SELECT COUNT(comm) FROM emp WHERE comm != 0 AND mgr IS NOT NULL;`
        
    * MAX()：计算指定列的最大值，如果指定列是字符串类型，那么使用字符串排序运算；
        
    * MIN()：计算指定列的最小值，如果指定列是字符串类型，那么使用字符串排序运算；
        * 查询最高和最低工资
            * `SELECT MAX(sal),MIN(sal) FROM emp;`

    * SUM()：计算指定列的数值和，如果指定列类型不是数值类型，那么计算结果为0；
        * 查询所有雇员月薪和(sum)
            * `SELECT SUM(sal) FROM emp;`
        * 查询所有雇员月薪和，以及所有雇员佣金和
            * `SELECT SUM(sal),SUM(comm) FROM emp;`
        * 查询所有雇员月薪+佣金和
            * `SELECT SUM(sal) + SUM(ifnull(comm,0)) FROM emp;`
            * `SELECT SUM(sal + comm) '总支出' FROM emp`

    * AVG()：计算指定列的平均值，如果指定列类型不是数值类型，那么计算结果为0；
        * 统计所有员工平均工资 [avg 求平均数]
            * `SELECT AVG(sal) FROM emp;`

* 分组查询
    1. 查询每个部门的部门编号和每个部门的工资和
        * `SELECT deptno,SUM(sal) FROM emp GROUP BY deptno;`
    2. 查询每个部门的部门编号以及每个部门的人数
        * `SELECT deptno,COUNT(*) FROM emp GROUP BY deptno;`
    3. 查询每个部门的部门编号以及每个部门，以及每个部门工资大于5000的人数
        * `SELECT deptno,COUNT(*) FROM emp  WHERE sal > 1500 GROUP BY deptno`

* HAVING子句
    * 查询工资总和大于9000的部门编号以及工资和
    * having和where的区别
		1.having是在分组后对数据进行过滤.
		  * where是在分组前对数据进行过滤
        2.having后面可以使用聚合函数(统计函数)
          * where后面不可以使用聚合函数。
    * WHERE是对分组前记录的条件，如果某行记录没有满足WHERE子句的条件，那么这行记录不会参加分组；而HAVING是对分组后数据的约束。

* limit 
    * 注意：是一个方言，mysql独有的，oracle和SQL Server没有limit用法。用于分页显示数据
    * 假设员工表有14条数据，分页显示，每页显示5条数据，总共需要3页来显示
    * `select * from emp LIMIT 0, 5`
        * 从第0条数据开始，显示5条
    * `select * from emp LIMIT 5, 5`
    * 公式
        * `当前页数p   (p-1) * 每页的条数`

