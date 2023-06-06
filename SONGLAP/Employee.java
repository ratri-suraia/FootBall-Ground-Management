import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color; 
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Container;
public class Employee
{
	public Employee()
	{
		JFrame frame=new JFrame("EMPLOYEE MANAGEMENT");
		frame.setSize(800,800);
		frame.setResizable(true);
		
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=new Container();
		c=frame.getContentPane();
		c.setBackground(Color.RED);
		
		
		
		Font font=new Font("Arial",Font.BOLD,16);
		 Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		
		JLabel l1=new JLabel("First Name:");
		l1.setBounds(10,80,140,30);
		l1.setFont(font);
		c.add(l1);
		
		JTextField f1=new JTextField();
		f1.setBounds(110,80,200,30);
		f1.setCursor(cursor);
		c.add(f1);
		
		JButton bb1=new JButton("INSERT");
		bb1.setBounds(400,80,100,30);
		bb1.setCursor(cursor);
		bb1.setFont(font);
		c.add(bb1);
		
		JLabel l2=new JLabel("Last Name:");
		l2.setBounds(10,130,150,30);
		l2.setFont(font);
		c.add(l2);
		
		JTextField f2=new JTextField();
		f2.setBounds(110,130,200,30);
		f2.setCursor(cursor);
		f2.setFont(font);
		c.add(f2);
		
		JButton bb2=new JButton("DELETE");
		bb2.setBounds(400,130,100,30);
		bb2.setCursor(cursor);
		bb2.setFont(font);
		c.add(bb2);
		
		JLabel l3=new JLabel("ID:");
		l3.setBounds(10,180,150,30);
		l3.setFont(font);
		c.add(l3);
		
		JTextField f3=new JTextField();
		f3.setBounds(110,180,200,30);
		f3.setCursor(cursor);
		f3.setFont(font);
		c.add(f3);
		
		JButton bb3= new JButton("CANCEL");
		bb3.setBounds(400,180,100,30);
		bb3.setCursor(cursor);
		bb3.setFont(font);
		c.add(bb3);
		
		
		JLabel l4=new JLabel("Salary:");
		l4.setBounds(10,230,150,30);
		l4.setFont(font);
		c.add(l4);
		
		JTextField f4=new JTextField();
		f4.setBounds(110,230,200,30);
		f4.setCursor(cursor);
		f4.setFont(font);
		c.add(f4);
		

		JButton bb4=new JButton("BACK");
		bb4.setBounds(153,280,100,30);
		bb4.setCursor(cursor);
		bb4.setFont(font);
		c.add(bb4);
		
		bb4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Option();
				frame.dispose();
			}
		});
	}
}



		
		
		