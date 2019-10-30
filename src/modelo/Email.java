/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.awt.Panel;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaac Brenes Torres
 */
public class Email implements IConstants{
    
    
    public boolean enviarMail(String pMailCliente,String pProductos){
        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth","true");
        
        String Destinatario = pMailCliente;
        
        
        Session sesion = Session.getDefaultInstance(propiedad);
        String correoEnvia = MAIL_COUNTER;
        String contrasena = CONTRASEÑA_MAIL_COUNTER;
        String Receptor = Destinatario;
        String Asunto = "Entregables Pendientes";
        String Mensaje = pProductos;
        
                MimeMessage mail = new MimeMessage(sesion);
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress (Receptor));
            mail.setSubject(Asunto);
            mail.setText(Mensaje);
            
            Transport transportar = sesion.getTransport("smtp");
            transportar.connect(correoEnvia,contrasena);
            transportar.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));          
            transportar.close();
            
            JOptionPane.showMessageDialog(null, "Mail Enviado, Verifique su Correo");
            return true;
            
        } catch (AddressException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
