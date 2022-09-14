

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class Connecter {
        Connection con;
    public Connecter(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
    }catch(ClassNotFoundException e){ 
        System.err.println(e);//pour afficher l'erreur
    }
        //pour afficher l errer  
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bentajer1","root","");
    }catch(SQLException e){System.err.println(e);}
  
}
Connection obtenirconnexion(){return con;}
}


