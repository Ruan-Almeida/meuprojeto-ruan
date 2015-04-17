package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cidade;

public class CidadeDAO {
    
        public Boolean inserir(Cidade cidade) 
    {
        Boolean retorno;
        String sql = "insert into cidade (nome) values (?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try {
            pst.setString(1, cidade.getNome());
            pst.executeUpdate();
            retorno = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Cidade> listar()
    {
        List<Cidade> lista = new ArrayList<Cidade>();
        String sql = "select * from cidade";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try 
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Cidade cidade = new Cidade();
                cidade.setCodigo(res.getInt("codigo"));
                cidade.setNome(res.getString("nome"));
                lista.add(cidade);
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Boolean excluir(Cidade cidade) {
        Boolean retorno;
        
        String sql = "delete from cidade where codigo = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try{
            pst.setInt(1, cidade.getCodigo());
            pst.executeUpdate();
            retorno = true;
        }
        
        catch (Exception ex) {
            ex.printStackTrace();
            retorno = false;
        }
        
        return retorno;
    }
}