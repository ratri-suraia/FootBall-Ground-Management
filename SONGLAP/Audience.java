import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color; 
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Container;
public class Audience
{
	public Audience()
	{
		JFrame frame1=new JFrame("AUDIENCE MANAGEMENT");
		frame1.setSize(700,700);
		frame1.setResizable(true);
		
		frame1.setLayout(null);
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=new Container();
		c=frame1.getContentPane();
		c.setBackground(Color.RED);
		
		
		
		Font font=new Font("Arial",Font.BOLD,16);
		 Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		
		JLabel l1=new JLabel("First Name:");
		l1.setBounds(10,80,140,30);
		l1.setFont(font);
		c.add(l1);
		
		JTextField f1=new JTextField();
		f1.setBounds(110,80,200,30);
		f1.setBackground(Color.PINK);
		f1.setCursor(cursor);
		c.add(f1);
		
		JButton bt=new JButton("INSERT");
		bt.setBounds(400,80,100,30);
		bt.setCursor(cursor);
		bt.setFont(font);
		c.add(bt);
		
		JLabel l2=new JLabel("Last Name:");
		l2.setBounds(10,130,150,30);
		l2.setFont(font);
		c.add(l2);
		
		JTextField f2=new JTextField();
		f2.setBounds(110,130,200,30);
		f2.setBackground(Color.PINK);
		f2.setCursor(cursor);
		f2.setFont(font);
		c.add(f2);
		
		JButton bt1=new JButton("DELETE");
		bt1.setBounds(400,130,100,30);
		bt1.setCursor(cursor);
		bt1.setFont(font);
		c.add(bt1);
		
		JLabel l3=new JLabel("NID:");
		l3.setBounds(10,180,150,30);
		l3.setFont(font);
		c.add(l3);
		
		JTextField f3=new JTextField();
		f3.setBounds(110,180,200,30);
		f3.setBackground(Color.PINK);
		f3.setCursor(cursor);
		f3.setFont(font);
		c.add(f3);
		
		JButton bt2= new JButton("CANCEL");
		bt2.setBounds(400,180,100,30);
		bt2.setCursor(cursor);
		bt2.setFont(font);
		c.add(bt2);
		
		
		JLabel l4=new JLabel("Age:");
		l4.setBounds(10,230,150,30);
		l4.setFont(font);
		c.add(l4);
		
		JTextField f4=new JTextField();
		f4.setBounds(110,230,200,30);
		f4.setBackground(Color.PINK);
		f4.setCursor(cursor);
		f4.setFont(font);
		c.add(f4);
		

		JButton bt3=new JButton("BACK");
		bt3.setBounds(153,280,100,30);
		bt3.setCursor(cursor);
		bt3.setFont(font);
		c.add(bt3);
		
		bt3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Option();
				frame1.dispose();
			}
		});
	}
}
