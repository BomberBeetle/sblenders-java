
package classeConexao;
import java.sql.*;



public class ClasseConexaoJava {
   // String strConexao = "Password=etesp; Persist Security Info=True; User ID=sa; Initial Catalog=Teste; Data Source=" + Environment.MachineName;
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private final String caminho = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;" + "DatabaseName=dbSblenders";
    private String usuario = "sa";
    private String senha = "etesp";
    //private String senha = "12345";
    private Connection conn;
    public boolean conectar(){
        try {
            Class.forName(this.driver);
            this.setConn(DriverManager.getConnection(caminho,usuario,senha));
            return true;
        }
        catch (Exception erro){
            erro.printStackTrace();
            return false;
        }
    }
    
    public void desconectar(){
        try {
            this.getConn().close();
        } 
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    public Connection getConn(){
        return conn;
    }
    
    public void setConn(Connection conn){
        this.conn = conn;
    }
}
