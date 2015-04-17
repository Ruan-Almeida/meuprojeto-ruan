package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

public class PerguntaDAO {
    public Boolean inserir(Pergunta pergunta){
        Boolean retorno;
        
        String sql = "INSERT INTO pergunta(a,b,c,d,nivel,certa,enunciado) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try{
            pst.setString(1, pergunta.getA());
            pst.setString(2, pergunta.getB());
            pst.setString(3, pergunta.getC());
            pst.setString(4, pergunta.getD());
            pst.setInt(5, pergunta.getNivel());
            pst.setString(6, pergunta.getCerta());
            pst.setString(7, pergunta.getEnunciado());
            
            pst.executeUpdate();
            
            retorno = true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
    public List<Pergunta> listar(){
        List<Pergunta> lista = new ArrayList<Pergunta>();
        
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            ResultSet res = pst.executeQuery();
                while(res.next()){
                    Pergunta pergunta = new Pergunta();
                    pergunta.setId(res.getInt("id"));
                    pergunta.setA(res.getString("a"));
                    pergunta.setB(res.getString("b"));
                    pergunta.setC(res.getString("c"));
                    pergunta.setD(res.getString("d"));
                    pergunta.setNivel(res.getInt("nivel"));
                    pergunta.setCerta(res.getString("certa"));
                    pergunta.setEnunciado(res.getString("enunciado"));
                    lista.add(pergunta);
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }    
    
    public Boolean excluir(Pergunta pergunta){
        Boolean retorno;
        
        String sql = "DELETE FROM pergunta WHERE id = ?";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try{
            pst.setInt(1, pergunta.getId());
            
            pst.executeUpdate();
            retorno = true;
        }
        catch(Exception ex){
            ex.printStackTrace();
            retorno = false;
        }
        return retorno;
    }
    
}
