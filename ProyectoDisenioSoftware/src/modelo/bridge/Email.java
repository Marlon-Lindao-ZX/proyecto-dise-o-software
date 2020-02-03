/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bridge;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  
import javax.activation.*;  
/**
 *
 * @author CORE I7
 */
public class Email implements Notificador {
    
    private String emailFrom;
    private String password;
    private String emailTo;
    
    public Email(String emailFrom, String password, String emailTo){
        this.emailFrom = emailFrom;
        this.password = password;
        this.emailTo = emailTo;
    }
    

    @Override
    public void send() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", "mail.javatpoint.com");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailFrom, password);
            }
        });

        //2) compose message     
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailFrom));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
            message.setSubject("Message Aleart");

            //3) create MimeBodyPart object and set your message text     
            BodyPart messageBodyPart1 = new MimeBodyPart();
            messageBodyPart1.setText("This is message body");

            //4) create new MimeBodyPart object and set DataHandler object to this object      
            MimeBodyPart messageBodyPart2 = new MimeBodyPart();

            String filename = "document.pdf";//change accordingly  
            DataSource source = new FileDataSource(filename);
            messageBodyPart2.setDataHandler(new DataHandler(source));
            messageBodyPart2.setFileName(filename);

            //5) create Multipart object and add MimeBodyPart objects to this object      
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart1);
            multipart.addBodyPart(messageBodyPart2);

            //6) set the multiplart object to the message object  
            message.setContent(multipart);

            //7) send message  
            Transport.send(message);

            System.out.println("message sent....");
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }

    
}