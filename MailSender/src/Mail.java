import java.net.Authenticator;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.management.RuntimeErrorException;
public class Mail {
static String host = "smtp.gmail.com";
static String sslPort = "465";

	public static void Send(Sender sender, Receiver receiver,String text, String subject)
	{
		String userName = sender.getUserName();
		String password = sender.getPassword();
		String myAddress = sender.getAddress();
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.socketFactory.port", sslPort);
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", sslPort);
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(userName, password);
			}
		});
		
		try
		{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(myAddress));
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(receiver.getAddress()));
			message.setSubject(subject);
			message.setText("Dear "+receiver.getFirstName()+" "+receiver.getLastName()+"\n\n"+ text +"\n\nSincerely yours " + sender.getFirstName()+ " "+ sender.getLastName());
			
		    Transport.send(message);
		    System.out.println("Done!!! " + text);
		}
		catch(MessagingException e)
		{
			throw new RuntimeException(e);
		}
	}
	public static void Send(Sender sender, AddressBook myBook, String Text, String subject){
		for(int i = 0; i <myBook.size();i++)
		{
			Send(sender,myBook.getReceiver(i),Text,subject);
		}
	}
}
