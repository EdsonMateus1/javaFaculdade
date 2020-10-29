package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class fabricaConexao {
    
    public Connection conecta()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
return DriverManager.getConnection("jdbc:mysql://localhost:3306/condominioWEB","root","root");
          
        } catch (ClassNotFoundException | SQLException e) {
        throw new RuntimeException(e);
        }    
    }
}
