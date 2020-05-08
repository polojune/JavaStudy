package a;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class TestEx01 extends JFrame {

	public TestEx01() {
		setTitle("SMS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(null);
		ImageIcon message = new ImageIcon("img/m1.png");
		JLabel iml = new JLabel(message);
		iml.setSize(300, 200);
		iml.setLocation(20, 40);

		JLabel la1 = new JLabel("to");
		la1.setSize(20, 20);
		la1.setLocation(30, 50);

		JTextArea ta1 = new JTextArea("phone number");
		ta1.setSize(100, 20);
		ta1.setLocation(80, 50);

		JLabel la2 = new JLabel("Message");
		la2.setSize(50, 20);
		la2.setLocation(30, 100);

		JTextArea ta2 = new JTextArea("input a message");
		ta2.setSize(300, 100);
		ta2.setLocation(80, 100);

		c.add(la1);
		c.add(ta1);
		c.add(la2);
		c.add(ta2);
		c.add(iml);

		JButton btn1 = new JButton("send");
		btn1.setBackground(Color.YELLOW);
		btn1.setSize(100, 30);
		btn1.setLocation(250, 300);

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta1.setText("");
				ta2.setText("");
			}
		});

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String phoneNumber = ta1.getText();
				String text = ta2.getText();
				if (phoneNumber.length() == 11) {
					toSend(phoneNumber, text);
				}
			}
		});

		c.add(btn1);

		setSize(400, 400);
		setVisible(true);

	}

	public static void toSend(String phoneNumber, String text) {
		String api_key = "";
		String api_secret = "";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01088540350");
		params.put("from", "01027258574");
		params.put("type", "SMS");
		params.put("text", text);
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
	}

	public static void main(String[] args) {
		new TestEx01();
	}

}