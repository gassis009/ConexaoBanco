/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
import java.sql.*;

public class alunoDAO {
    private Connection conn;
    alunoDAO(Connection c)
    {
    this.conn=c;
    }
   
    public void inserir(String nome)
    
    {
        try
        
        {
            String sql="insert into aluno values ('"+nome+"')";
            java.sql.PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("deu certo");
        }
        catch(Exception ex){System.out.println(ex);}
        
        
    }
    
    
}
