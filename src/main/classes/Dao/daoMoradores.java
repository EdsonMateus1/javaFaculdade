
package dao;

import Conexao.fabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class daoMoradores {
     private final Connection conectar;
     private PreparedStatement stmt;
     
     public daoMoradores()
     {
     conectar = new fabricaConexao().conecta();
     }
     
     public void Inserir(modelo.modeloMoradores mo)
     {
         try {
            String sql = "INSERT INTO moradores (nome, cpf, telefone) VALUES (?,?,?)";
            stmt = conectar.prepareStatement(sql);
            stmt.setString(1,mo.getNome());
            stmt.setString(2,mo.getCpf());
            stmt.setString(3, mo.getTelefone());
            stmt.execute();
            stmt.close();
         } catch (SQLException e) {
         }
     
     
     
     }
     
}
