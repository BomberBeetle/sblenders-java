

package Principal;

public class PrjMenu1 
{
    public static void main(String[] args) 
    { 
                //Qual o form a ser aberto
          frmPrincipal f1 = new frmPrincipal();
            //   f1.setModal(true);
                f1.setLocationRelativeTo(null); //Centraliza o frmLogin
                f1.setVisible(true);
    }
}
