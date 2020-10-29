
package dao;

import Conexao.fabricaConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class daoApartamentos {
    
  private final Connection conectar;
  private PreparedStatement stmt;  
    
  public daoApartamentos()
  {
  conectar = new fabricaConexao().conecta();
  }
    public void Inserir(modelo.modeloApartamentos ap)
    {
 String sql = "INSERT INTO apartamentos (numero, andar, bloco, quartos) VALUES (?,?,?,?)";
      try {
          stmt = conectar.prepareStatement(sql);
          stmt.setString(1, ap.getNumero());
          stmt.setString(2, ap.getAndar());
          stmt.setString(3, ap.getBloco());
          stmt.setString(4, ap.getQuartos());
          stmt.execute();
          stmt.close();
      } catch (SQLException ex) {
          Logger.getLogger(daoApartamentos.class.getName()).log(Level.SEVERE, null, ex);
      }
 
    }
    
}
