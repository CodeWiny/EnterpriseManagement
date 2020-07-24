package test;

import oracle.jdbc.driver.OracleDriver;
import org.junit.Test;

import java.sql.*;

public class datasource_connection {
    @Test
    public void testDatasource() throws Exception {
        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //获取连接
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "ssm", "ssm");
        PreparedStatement psmt = connection.prepareStatement("select * from product");
        ResultSet resultSet = psmt.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString("productNum"));
        }
        resultSet.close();
        psmt.close();
        connection.close();
    }

}
