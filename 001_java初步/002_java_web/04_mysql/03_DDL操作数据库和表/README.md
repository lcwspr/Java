# DDL
## DDL 操作数据库
1. 创建
    1. `create database mydb1;`
    2. `create database mydb2 character set gbk;`
    3. `create database mydb3 character set gbk COLLATE gbk_chinese_ci;`
        * COLLATE： 指排序规则。

2. 查询
    1. `show databases;`
        * 查看当前数据库服务器中的所有数据库
    2. `show create database mydbname;`
        * 查询某个数据库的定义信息
    3. `drop database mydb;`
        * 删除前面创建的数据库

3. 修改
    * `alter database mydb character set utf8;`
        * 产看服务器中的数据库，并把mydb2的字符集修改为utf-8

4. 删除
    * `drop database mydb;`

5. 其他
    1. `select database();`
        * 查看当前使用的数据库
    2. `use mydb`
        * 切换数据库

## DDL操作表
1. 常用数据类型
    ```
    分类	数据类型	说明
    数值类型	BIT(M)	位类型。M指定位数，默认值1，范围1-64
        TINYINT [UNSIGNED] [ZEROFILL] 	带符号的范围是-128到127, 无符号0到255。
        BOOL，BOOLEAN 	使用0或1表示真或假
        SMALLINT [UNSIGNED] [ZEROFILL]  	2的16次方
        INT [UNSIGNED] [ZEROFILL] 	2的32次方
        BIGINT [UNSIGNED] [ZEROFILL] 	2的64次方
        FLOAT[(M,D)] [UNSIGNED] [ZEROFILL] 	M指定显示长度，d指定小数位数
        DOUBLE[(M,D)] [UNSIGNED] [ZEROFILL] 	表示比float精度更大的小数
    文本、二进制类型
        CHAR(size) char(20)	固定长度字符串
        VARCHAR(size)  varchar(20)	可变长度字符串
        BLOB   LONGBLOB	二进制数据
        TEXT(clob)          LONGTEXT(longclob)	大文本
    时间日期
        DATE/DATETIME/TimeStamp	日期类型(YYYY-MM-DD)  (YYYY-MM-DD HH:MM:SS)，TimeStamp表示时间戳，它可用于自动记录insert、update操作的时间

        **** VARCHAR、BLOB和TEXT类是变长类型。每个类型的存储需求取决于列值的实际长度。 
    ```
2. 创建表
    ```
    create table employee(
	id int,
	name varchar(20), 
    gender varchar(6), -- male 男性 female:女性
	birthday date,
	Entry_date date,
	job varchar(20),
	salary float,
	resume text
    );
    ```
2. 查看数据库中的所有的表
    * `show tables;`

3. 查看表的字段信息
    * `DESC employee;`

4. 增加一个image列
    * `ALTER TABLE employee ADD image blob`

5. 修改列的数据类型
    * `ALTER TABLE employee MODIFY job varchar(60)`

6. 删除表的一列
    * `ALTER TABLE employee DROP image;`
        * 一次只能删除一个列

7. 修改表名
    * `RENAME TABLE employee TO user;`

8. 查看表的创建细节
    * `SHOW CREATE TABLE user;`
        * 表的创建语句

9. 修改表的字符集为gbk
    * `ALTER TABLE user CHARACTER SET gbk`

10. 列名name修改为username
    * `ALTER TABLE user CHANGE name username varchar(100);`

11. 删除表
    * `DROP TABLE user;`