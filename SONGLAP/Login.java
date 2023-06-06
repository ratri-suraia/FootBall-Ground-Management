import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Cursor;

public class Login
{
	public Login()
	{
		JFrame frame4=new JFrame("FOOTBALL GROUND MANAGEMENT");
		frame4.setSize(800,800);
		frame4.setResizable(true);
		frame4.setLayout(null);
		frame4.setVisible(true);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=new Container();
		c=frame4.getContentPane();
		c.setBackground(Color.RED);
		
		ImageIcon icon=new ImageIcon(getClass().getResource("ftb.jpg"));
		frame4.setIconImage(icon.getImage());
		
		Font font=new Font("Arial",Font.BOLD,20);
		Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		
		
		JLabel l1=new JLabel("User Name:");
		l1.setBounds(50,50,150,50);
		l1.setFont(font);
		c.add(l1);
		
		JTextField t1=new JTextField();
		t1.setBounds(170,50,200,50);
		t1.setBackground(Color.PINK);
		t1.setCursor(cursor);
		t1.setFont(font);
		c.add(t1);
		
		JLabel l2=new JLabel("Password:");
		l2.setBounds(50,120,150,50);
		l2.setFont(font);
		c.add(l2);
		
		JPasswordField p1=new JPasswordField();
		p1.setBounds(170,120,200,50);
		p1.setBackground(Color.PINK);
		p1.setCursor(cursor);
		p1.setFont(font);
		p1.setEchoChar('*');
		c.add(p1);
		
		
		JButton b1=new JButton("Login");
		b1.setBounds(170,190,90,50);
		b1.setFont(font);
		c.add(b1);
		
		JButton b2=new JButton("Exit");
		b2.setBounds(280,190,90,50);
		b2.setFont(font);
		c.add(b2);
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				t1.setText("");
				p1.setText("");
			}
		});
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				String username=t1.getText();
				String password=p1.getText();
				if(username.equals("songlap")&& password.equals("1234"))
				{
					JOptionPane.showMessageDialog(null," Login Successfull");
					new Option();
					
					frame4.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid username or password");
				}
			}
		});
	}
}
		
		
		