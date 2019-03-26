/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class ConexaoBanco {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
         System.out.println(JdbcUtil.getConnection());
         alunoDAO al=new alunoDAO(JdbcUtil.getConnection());
         
         al.inserir("zezinho");
         
    }
    
}
