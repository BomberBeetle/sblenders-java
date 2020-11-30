
package Principal;

/**
 *
 * @author lucas
 */
public class classeGetSet {
   private static String nomeusuario;
  private int   idProduto; 

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
     public static void setNome(String nomeproduto) {
    nomeusuario = nomeproduto;
}
     
    public static String getNome() {
    return nomeusuario;
}
}
