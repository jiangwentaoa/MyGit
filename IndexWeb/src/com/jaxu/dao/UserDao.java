package com.jaxu.dao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
* jdbc�����Ĺ�����
   * @author xiaoqiu
 */
public class UserDao {

   private static DataSource datesource=null;
   //ִֻ��һ��
   static{
   datesource=new ComboPooledDataSource();
   }   
   //�������Դ
   public static DataSource getdDataSource(){
   return datesource;
   }     
   //��������Դ��һ��connection����
   public static Connection getConnection() throws SQLException{
       return datesource.getConnection();
       }

  //�ͷ�connection��Դ
  public static void closeConnection(){

   }   
}
