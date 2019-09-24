# DML 操作数据库记录
## 简介
* DML就是对表中的数据进行增，删，查，改的操作
* 主要有INSERT,UPDATE,DELETE
* 在mysql中，字符串类型和日期类型都要用单引号括起来。'tom'  '2015-09-04'

## INSERT
1. 语法： `INSERT INTO 表名(列名1，列名2..)VALUES(列值1，列值2..);`
    * 注意：列名与列值的类型、个数、顺序要一一对应。
    * 可以把列名当做java中的形参，把列值当做实参。
    * 值不要超出列定义的长度。
    * 如果插入空值，请使用null
    * 插入的日期和字符一样，都使用引号括起来。
2. 批量插入
    * 语法
        ```
        insert into emp(id,name,gender,birthday,salary,entry_date,resume) values 
        (4,'gyf1','female','1988-10-12',100000.00,'2000-10-12','good good'),
        (5,'mayun1','female','1988-10-12',100000.00,'2000-10-12','good good'),
        (6,'mht1','female','1988-10-12',100000.00,'2000-10-12','good good');

        ```

## 修改语法
1. 语法
    * `UPDATE 表名 SET 列名1=列值1，列名2=列值2 .. WHERE 列名=值`
2. 例子
    1. 将所有人薪水改为5000
        * `UPDATE emp SET salary = 5000`
    2. 将姓名为zhangsan的员工薪水修改为3000元
        * `UPDATE emp SET salary=3000 WHERE name="zhangsan"`
    3. 将姓名为lisi的员工薪水修改为4000,job改为工程师
        * `UPDATE emp SET salary=4000,gender="female" WHERE name='lisi';`
    4. 将wangwu的薪水在原来的基础上增加1000元
        * `UPDATE emp SET salary=salary+1000 WHERE name='wangwu'`

## DELETE 
* 语法
    * `DELETE FROM 表名 [where 列名=值]`
* 例如
    1. 删除表中名称为'zs'的记录
        * `DELETE FROM emp WHERE name='zs';`
    2. 删除表中所有的记录
        * `DELETE FROM emp;`
    3. 使用truncate删除表中记录
        * `TRUNCATE TABLE emp;`
* delete和truncat的区别 
    * DELETE 删除表中的数据，表结构还在;删除后的数据可以找回
    * TRUNCATE 删除是把表直接DROP掉，然后再创建一个同样的新表。删除的数据不能找回。执行速度比DELETE快。


