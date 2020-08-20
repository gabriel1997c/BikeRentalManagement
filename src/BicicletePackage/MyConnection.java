package BicicletePackage;

/**
 *
 * @author Gabi
 */

import java.sql.Connection;
import java.sql.DriverManager;



public class MyConnection {
    
  
    
    
    public static Connection getConnection(){
    
    Connection con=null;
    
    
    //realizarea conexiunii intre baza de date microsoft sql server si aplicatia de interfata vizuala
    
    try{
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con=DriverManager.getConnection("jdbc:sqlserver://BN95819;databaseName=CentruBiciclete", "sa", "bdproiect9");
    } catch(Exception ex){
    System.out.println(ex.getMessage());
    }
    
    return con;
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
