package Library;

import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){
        try{

            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Vinh2001");
            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}

