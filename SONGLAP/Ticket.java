import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color; 
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Container;
public class Ticket
{
	public Ticket()
	{
		JFrame frame2=new JFrame("TICKET MANAGEMENT");
		frame2.setSize(800,800);
		frame2.setResizable(true);
		
		frame2.setLayout(null);
		frame2.setVisible(true);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=new Container();
		c=frame2.getContentPane();
		c.setBackground(Color.RED);
		
		
		Font font=new Font("Arial",Font.BOLD,16);
		 Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		
		JLabel l1=new JLabel("Ticket No:");
		l1.setBounds(10,80,140,30);
		l1.setFont(font);
		c.add(l1);
		
		JTextField f1=new JTextField();
		f1.setBounds(110,80,200,30);
		f1.setCursor(cursor);
		c.add(f1);
		
		JButton k1=new JButton("BOOK");
		k1.setBounds(400,80,100,30);
		k1.setCursor(cursor);
		k1.setFont(font);
		c.add(k1);
		
		JLabel l2=new JLabel("Match Time:");
		l2.setBounds(10,130,150,30);
		l2.setFont(font);
		c.add(l2);
		
		JTextField f2=new JTextField();
		f2.setBounds(110,130,200,30);
		f2.setCursor(cursor);
		f2.setFont(font);
		c.add(f2);
		
		JButton c2=new JButton("CANCEL");
		c2.setBounds(400,130,100,30);
		c2.setCursor(cursor);
		c2.setFont(font);
		c.add(c2);
		
		JLabel l3=new JLabel("Ticket Type:");
		l3.setBounds(10,180,150,30);
		l3.setFont(font);
		c.add(l3);
		
		JTextField f3=new JTextField();
		f3.setBounds(110,180,200,30);
		f3.setCursor(cursor);
		f3.setFont(font);
		c.add(f3);
		
		
		JLabel l4=new JLabel("Seat No:");
		l4.setBounds(10,230,150,30);
		l4.setFont(font);
		c.add(l4);
		
		JTextField f4=new JTextField();
		f4.setBounds(110,230,200,30);
		f4.setCursor(cursor);
		f4.setFont(font);
		c.add(f4);
		
		JLabel l5=new JLabel("Payment:");
		l5.setBounds(10,280,150,30);
		l5.setFont(font);
		c.add(l5);
		
		String[] option = new String[]{"BKASH","NAGAD","DOUCH BANGLA","ATM"};
		
		JComboBox c1=new JComboBox(option);
		c1.setBounds(110,280,200,30);
		c.add(c1);
		
		JLabel l6=new JLabel("Phone:");
		l6.setBounds(10,330,150,30);
		l6.setFont(font);
		c.add(l6);
		
		JTextField f5=new JTextField();
		f5.setBounds(110,330,200,30);
		f5.setCursor(cursor);
		f5.setFont(font);
		c.add(f5);
		

		JButton a3=new JButton("BACK");
		a3.setBounds(153,380,100,30);
		a3.setCursor(cursor);
		a3.setFont(font);
		c.add(a3);
		
		JButton g4=new JButton("Logout");
		g4.setBounds(280,380,100,30);
		g4.setCursor(cursor);
		g4.setFont(font);
		c.add(g4);
		
		a3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Option();
				frame2.dispose();
			}
		});
		
		g4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Login();
				frame2.dispose();
			}
		});
		
	
	}
}
