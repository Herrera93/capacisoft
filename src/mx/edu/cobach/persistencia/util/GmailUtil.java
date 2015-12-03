/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cobach.persistencia.util;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.Label;
import com.google.api.services.gmail.model.ListLabelsResponse;
import com.google.api.services.gmail.model.Message;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Alex
 */
public class GmailUtil {
    //Nombre la aplicacion
     private static final String APPLICATION_NAME =
        "CapaciSoft";

    /** Directory to store user credentials. */
    private static final java.io.File DATA_STORE_DIR = new java.io.File(
        System.getProperty("user.home"), ".credenciales/gmail");

    /** Global instance of the {@link FileDataStoreFactory}. */
    private static FileDataStoreFactory DATA_STORE_FACTORY;

    /** Global instance of the JSON factory. */
    private static final JsonFactory JSON_FACTORY =
        JacksonFactory.getDefaultInstance();

    /** Global instance of the HTTP transport. */
    private static HttpTransport HTTP_TRANSPORT;

    /** Global instance of the scopes required by this quickstart. */
    private static final List<String> SCOPES =
        Arrays.asList(GmailScopes.MAIL_GOOGLE_COM, GmailScopes.GMAIL_COMPOSE);
    
    static {
        try {
            HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            DATA_STORE_FACTORY = new FileDataStoreFactory(DATA_STORE_DIR);
        } catch (Throwable t) {
            t.printStackTrace();
            System.exit(1);
        }
    }
    
    /**
     * Creates an authorized Credential object.
     * @return an authorized Credential object.
     * @throws IOException
     */
    public static Credential autorizar() throws IOException {
        // load client secrets
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY,
            new InputStreamReader(GmailUtil.class.getResourceAsStream("client_secret.json")));
        // set up authorization code flow
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
            HTTP_TRANSPORT, JSON_FACTORY, clientSecrets,
            Collections.singleton(GmailScopes.MAIL_GOOGLE_COM)).setDataStoreFactory(DATA_STORE_FACTORY)
            .build();
        // authorize
        return new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
    }

    /**
     * Build and return an authorized Gmail client service.
     * @return an authorized Gmail client service
     * @throws IOException
     */
    public static Gmail getServicioGmail() throws IOException {
        Credential credential = autorizar();
        return new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, credential)
                .setApplicationName(APPLICATION_NAME)
                .build();
    }

    public static MimeMessage crearEmail(String to, String from, String subject,
        String bodyText) throws MessagingException {
      Properties props = new Properties();
      Session session = Session.getDefaultInstance(props, null);

      MimeMessage email = new MimeMessage(session);
      InternetAddress tAddress = new InternetAddress(to);
      InternetAddress fAddress = new InternetAddress(from);

      email.setFrom(new InternetAddress(from));
      email.addRecipient(javax.mail.Message.RecipientType.TO,
                         new InternetAddress(to));
      email.setSubject(subject);
      email.setText(bodyText);
      return email;
    }
    
    public static Message crearMensajeConEmail(MimeMessage email)
        throws MessagingException, IOException {
      ByteArrayOutputStream bytes = new ByteArrayOutputStream();
      email.writeTo(bytes);
      String encodedEmail = Base64.encodeBase64URLSafeString(bytes.toByteArray());
      Message message = new Message();
      message.setRaw(encodedEmail);
      return message;
    }
    
    public static void enviarMensaje(Gmail service, String userId, MimeMessage email)
      throws MessagingException, IOException {
        Message message = crearMensajeConEmail(email);
        message = service.users().messages().send(userId, message).execute();

        System.out.println("Message id: " + message.getId());
        System.out.println(message.toPrettyString());
      }
    
    public static void main(String[] args) {
         try {
            //Se crea el correo por medio del API de Gmail
            MimeMessage correo = GmailUtil.crearEmail("herrera.luis@uabc.edu.mx", "capacisoft@gmail.com", "PRUEBA", "PRUEBA");
            //Se envia el correo por medio del API de Gmail
            GmailUtil.enviarMensaje(GmailUtil.getServicioGmail(), "capacisoft@gmail.com", correo);
        } catch (MessagingException | IOException ex) {
        }
        // Build a new authorized API client service.
//        Gmail service;
//         try {
//             service = getServicioGmail();
//            // Print the labels in the user's account.
//            String user = "me";
//            ListLabelsResponse listResponse =
//                service.users().labels().list(user).execute();
//            List<Label> labels = listResponse.getLabels();
//            if (labels.size() == 0) {
//                System.out.println("No labels found.");
//            } else {
//                System.out.println("Labels:");
//                for (Label label : labels) {
//                    System.out.printf("- %s\n", label.getName());
//                }
//            }
//         } catch (IOException ex) {
//             Logger.getLogger(GmailUtil.class.getName()).log(Level.SEVERE, null, ex);
//         }

    }
}
