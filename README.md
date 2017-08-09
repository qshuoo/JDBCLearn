# JDBCLearn
learn  jdbc

1、导入mysql-connector-java-version-bin.jar 包
2、编写测试类
3、加载驱动类 
	Class.forName("com.mysql.jdbc.Driver");
4、建立链接
	Connection connection = 
	DriverManager.getConnection("jdbc:mysql://host:port/database", "user", "password");
5、执行SQL语句
	