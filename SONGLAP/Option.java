import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Cursor;

public class Option
{
	public Option()
	{
		JFrame frame5=new JFrame("FOOTBALL GROUND MANAGEMENT");
		frame5.setSize(800,800);
		frame5.setResizable(true);
	
		frame5.setLayout(null);
		frame5.setVisible(true);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Font font=new Font("Arial",Font.BOLD,16);
		Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
		
		Container c=new Container();
		c=frame5.getContentPane();
		c.setBackground(Color.RED);
		
		JButton e1=new JButton("EMPLOYEE");
		e1.setBounds(170,50,200,50);
		e1.setFont(font);
		c.add(e1);
		
		
		JButton a2=new JButton("AUDIENCE");
		a2.setBounds(170,120,200,50);
		a2.setFont(font);
		c.add(a2);
		
		JButton n3=new JButton("TICKET");
		n3.setBounds(170,190,200,50);
		n3.setFont(font);
		c.add(n3);
		
		e1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Employee();
				frame5.dispose();
			}
		});
		a2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Audience();
				frame5.dispose();
			}
		});
		
		n3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Ticket();
				frame5.dispose();
			}
		});
		
	}
}
