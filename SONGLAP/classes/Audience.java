package classes;
import java.lang.*;
import interfaces.*;
import java.util.*;

public class Audience implements ITicket{
     

    protected String audienceName;
    protected int age;
    protected  String nid;
    protected Account account;
    private Ticket tickets[] = new Ticket [10];

	public Audience(){}

	public Audience(String nid){

		this.nid = nid;
		
	}

	public void setAudienceName(String audienceName){

		this.audienceName=audienceName;
	}

	public void setAge(int age){
		this.age=age;
	}

	public void setNid(String nid){

		this.nid = nid;
	}
	public  void setAccount(Account account){
		this.account = account;
	}

	public String getAudienceName(){

		return audienceName;
	}

	public int getAge(){
		return age;
	}

	public String getNid(){
		return nid;
	}

	public Account getAccount(){
		return account;
	}

	public void BookTicket(Ticket t)
	{
		int flag = 0;
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i] == null)
			{
				tickets[i] = t;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Ticket Booked");
		}
		else
		{
			System.out.println("Can Not Book ticket");
		}
	}
	
	public void cancelTicket(int ticketNumber)
	{
		int flag = 0;
		for(int i=0; i<tickets.length; i++)
		{
			if(tickets[i].getTicketNo().equals(ticketNumber))
			{
				tickets[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Ticket Cancelled");}
		else{System.out.println("Can Not Cancel Ticket/Ticket Not found.");}
	}


	}

	
		
