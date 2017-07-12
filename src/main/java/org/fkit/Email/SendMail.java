package org.fkit.Email;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {
		private static String KEY_SMTP="mail.smtp.host";
		private static String VALUE_SMTP="smtp.163.com";
		private static String KEY_PROPS="mail.smtp.auth";
		private static boolean VALUE_PROPS=true;
		private String SEND_USER="bennyla@163.com";
		private String SEND_UNAME="bennyla";
		private String SEND_PWD="liuxin09153798";
		private MimeMessage message;
		private Session s;
		public SendMail(){
			Properties props=System.getProperties();
			props.setProperty(KEY_SMTP, VALUE_SMTP);
			props.put(KEY_PROPS, VALUE_PROPS);
			//Authenticator authenticator = new MyAuthenticator("1252367043@qq.com", "kcbgiiffnnwzidgb");
			//Session session = Session.getDefaultInstance(props, authenticator);
			s=Session.getInstance(props);
			s.setDebug(true);
			message=new MimeMessage(s);
			
		}
		public void sendHtmlMail(String headName,String sendHtml,String receiveUser){
			try{
				InternetAddress from=new InternetAddress(SEND_USER);
				message.setFrom(from);
				InternetAddress to=new InternetAddress(receiveUser);
				message.setRecipient(Message.RecipientType.TO, to);
				message.setSubject(headName);
				String content=sendHtml.toString();
				message.setContent(content, "text/html;charset=GBK");
				message.saveChanges();
				Transport transport=s.getTransport("smtp");
				transport.connect(VALUE_SMTP, SEND_UNAME, SEND_PWD);
				transport.sendMessage(message,message.getAllRecipients());
				transport.close();
				System.out.println("send success!");
				
			}catch(AddressException e){
				e.printStackTrace();
			}catch(MessagingException e){
				e.printStackTrace();
			}
		}
}
