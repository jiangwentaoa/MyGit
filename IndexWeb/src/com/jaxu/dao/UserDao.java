package com.jaxu.dao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
* jdbc操作的工具类
   * @author xiaoqiu
 */
public class UserDao {

   private static DataSource datesource=null;
   //只执行一次
   static{
   datesource=new ComboPooledDataSource();
   }   
   //获得数据源
   public static DataSource getdDataSource(){
   return datesource;
   }     
   //返回数据源的一个connection对象
   public static Connection getConnection() throws SQLException{
       return datesource.getConnection();
       }

  //释放connection资源
  public static void closeConnection(){

   }   
}
