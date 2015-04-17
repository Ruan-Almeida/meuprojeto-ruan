import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class TesteBancodeDados {

    public static void main(String[] args) {
        inserir();
        List<Jogador> lista = listar();
        for (Jogador jogador : lista) {
            System.out.println(jogador.getLogin()+ "\n");
        }
                }
    
    public static List<Jogador> listar(){
        List<Jogador> jogadores = new ArrayList<Jogador>();
        try {
            String sql = "SELECT * FROM JOGADOR";
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet res = pst.executeQuery();
            while(res.next()){
                Jogador jog = new Jogador();
                jog.setLogin(res.getString("login"));
                jog.setSenha(res.getString("senha"));
                jog.setEmail(res.getString("email"));
                jogadores.add(jog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jogadores;
    }

    public static void inserir() {
        String sql, login, senha, email;
        login = JOptionPane.showInputDialog("Digite o login: ");
        senha = JOptionPane.showInputDialog("Digite a senha: ");
        email = JOptionPane.showInputDialog("Digite o email: ");
        sql = "INSERT INTO jogador(login, senha, email) VALUES (?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);

        try {
            pst.setString(1, login);
            pst.setString(2, senha);
            pst.setString(3, email);
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
