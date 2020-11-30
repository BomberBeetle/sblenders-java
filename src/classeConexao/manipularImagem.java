/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeConexao;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class manipularImagem {
    
    public static void exibiImagemLabel(byte[] minhaimagem, javax.swing.JLabel label)
{
        //primeiro verifica se tem a imagem
        //se tem convert para inputstream que é o formato reconhecido pelo ImageIO
       
        if(minhaimagem!=null)
        {
            InputStream input = new ByteArrayInputStream(minhaimagem);
            try {
                BufferedImage imagem = ImageIO.read(input);
                
                
                
                label.setIcon(new ImageIcon(imagem));
            } catch (IOException ex) {
            }
            
     //   lblLogin.setIcon(new ImageIcon(imagem.getImage().getScaledInstance(lblLogin.getWidth(), lblLogin.getHeight(), Image.SCALE_DEFAULT)));
        }
        else
        {
            label.setIcon(null);
            
        }
    
}   
}
