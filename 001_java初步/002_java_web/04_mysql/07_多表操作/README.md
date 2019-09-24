# 多表查询
* 合并结果集合 UNION, UNION ALL
* 连接查询
    * 内连接  [ INNER ]JOIN ON
    * 外连接  OUTER JOIN ON
    * 左外连接 LEFT [ OUTER ] JOIN
    * 右外连接 RIGHT [ OUTER ] JOIN
    * 全外连接 (mysql不支持) FULL JOIN
    * 自然连接 NATURAL join

## 合并结果集合
* 作用：合并结果集就是把两个select语句的查询结果合并到一起！
* 合并结果集有两种方式：
    * UNION：去除重复记录，例如：`SELECT * FROM t1 UNION SELECT * FROM t2；`
    * UNION ALL：不去除重复记录，例如：`SELECT * FROM t1 UNION ALL SELECT * FROM t2`。
* 要求：被合并的两个结果：列数、列类型必须相同(列完全相同)
* 例如
    ```
    CREATE TABLE employee_china(
	id int,
	name varchar(50)
    );
    CREATE TABLE employee_usa(
        id int,
        name varchar(50)
    );
    ```

## 连接查询
* 连接查询就是求出多个表的乘积,例如t1连接t2,那么查询出来的结果就是t1* t2.
    * `SELECT * FROM employee_china,employee_usa`
* 连接查询会产生笛卡尔积，假设集合A={a,b}，集合B={0,1,2}，则两个集合的笛卡尔积为{(a,0),(a,1),(a,2),(b,0),(b,1),(b,2)}。可以扩展到多个集合的情况。
那么多表查询产生这样的结果并不是我们想要的，那么怎么去除重复的，不想要的记录呢，当然是通过条件过滤。通常要查询的多个表之间都存在关联关系，那么就通过关联关系去除笛卡尔积。
