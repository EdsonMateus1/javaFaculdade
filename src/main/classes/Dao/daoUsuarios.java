
package dao;

import Conexao.fabricaConexao;
import modelo.modeloUsuarios;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoUsuarios {
    private final Connection conectar;
    private PreparedStatement stmt;
     private ResultSet rs;
     
   
    private final ArrayList<modelo.modeloUsuarios> lista = new ArrayList<>();
    public daoUsuarios()
    {
    conectar = new fabricaConexao().conecta();
    }
    public void Inserir(modeloUsuarios usuarios)
    {
        try {
            String sql = "INSERT INTO usuarios (nome, email) VALUES (?,?)";
            stmt = conectar.prepareStatement(sql);
            stmt.setString(1,usuarios.getNome());
            stmt.setString(2,usuarios.getEmail());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
     public void Update(modeloUsuarios usu) {
        try {
            String sql = "Update usuarios set nome=?,email=? where id=?";

            stmt = conectar.prepareStatement(sql);

            stmt.setString(1, usu.getNome());
            stmt.setString(2, usu.getEmail());
            stmt.setInt(3, usu.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
      public void Delete(String id) {
        try {
            String sql = "delete from usuarios where id=?";

            stmt = conectar.prepareStatement(sql);
            stmt.setString(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     
     
     
     
    public ArrayList<modeloUsuarios> ListarTodos() throws SQLException {
        try {
            String sql = "SELECT * FROM usuarios";
            stmt = conectar.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                modelo.modeloUsuarios usu = new modelo.modeloUsuarios();
                usu.setId(rs.getInt("id"));
                usu.setNome(rs.getString("nome"));
                usu.setEmail(rs.getString("email"));
               
                lista.add(usu);
            }
            rs.close();
            stmt.close();
            conectar.close();
        } catch (Exception e) {
        }
        return lista;
    }
    
    
   
    public int validar(modelo.modeloUsuarios usu)
    {
         int resultado = 0;
    String sql = "SELECT * FROM usuarios WHERE nome = ? and email = ?";
        try {
            
            stmt = conectar.prepareStatement(sql);
            stmt.setString(1,usu.getNome());
            stmt.setString(2, usu.getEmail());
            rs = stmt.executeQuery();
            
            while (rs.next()) {                
                usu.setNome(rs.getString("nome"));
                usu.setEmail(rs.getString("email"));
                resultado=resultado+1;
            }
            if (resultado==1) {
               return 1;
            } else {
                return 0;
            }
            
        } catch (Exception e) {
             return 0;
        }
    
   
    }
    
    
    
    
    
}
