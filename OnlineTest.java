package myfirstproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
// create class OnlineTest and extends by JFrame and now implement ActionListener interface to handle actions
public class OnlineTest extends JFrame implements ActionListener {

	
	// here I will create JLbael,JRadioButton JButton on JFrame
	
	
	JLabel label;
	JRadioButton radioButton[]=new JRadioButton[5];
	JButton btnNext,btnBookmark;
	ButtonGroup bg;
	int count=0,current=0,x=1,y=1,now=0;
	int m[]=new int[10];
	
	
	
	
	// inside constructor will initialize. 
	OnlineTest(String message) {
		super(message);
		label=new JLabel();
		add(label);
		bg=new ButtonGroup();
		for(int i=0;i<5;i++) {
			radioButton[i]=new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
			
		}
		
		btnNext=new JButton("Next");
		btnBookmark=new JButton("Bookmark");
		btnNext.addActionListener(this);
		btnBookmark.addActionListener(this);
		add(btnNext);
		add(btnBookmark);
		set();
		label.setBounds(30,40,450,20);
		radioButton[0].setBounds(50,80,100,20);
		radioButton[1].setBounds(50,110,100,20);
		radioButton[2].setBounds(50,140,100,20);
		radioButton[3].setBounds(50,170,100,20);
		btnNext.setBounds(100,240,100,30);
		btnBookmark.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);

		
		
		
		
	}
	// Here I will write the code. How to display Questions with options on JFrame
	
	
	void set() {
		radioButton[4].setSelected(true);
		if(current==0) {
			label.setText("Ques 1- How does Harry first learn that he is a wizard?");
			radioButton[0].setText("The Dursleys tell him when he turns eight.");
			radioButton[1].setText("Dudley accidently lets it slip");
			radioButton[2].setText("Hagrid has to track him down to tell him");
			radioButton[3].setText("He reads about it in the Daily Prophet");
			
			
		}
		if(current==1) {
			label.setText("Ques 2- Who killed James and Lily Potter? ");
			radioButton[0].setText("Lord Voldemort");
			radioButton[1].setText("Lucius Malfoy");
			radioButton[2].setText("Albus Dumbledore");
			radioButton[3].setText("Harry Potter");
			
			
		}
		if(current==2) {
			label.setText("Ques 3- Who was the only person that survived the killing curse?");
			radioButton[0].setText("Tom Riddle");
			radioButton[1].setText("Harry Potter");
			radioButton[2].setText("Ginni Weasley");
			radioButton[3].setText("Hermoine Granger");
			
			
		}
		if(current==3) {
			label.setText("Ques 4- Professor McGonnagal could transform herself into?");
			radioButton[0].setText("A cat");
			radioButton[1].setText("A fox");
			radioButton[2].setText("A snake");
			radioButton[3].setText("A cow");
			
			
		}
		if(current==4) {
			label.setText("Ques 5- Who was Harry's Godfather?");
			radioButton[0].setText("Albus Dumbledore");
			radioButton[1].setText("Severus Snape");
			radioButton[2].setText("Voldemort");
			radioButton[3].setText("Sirius Black");
			
			
		}
		if(current==5) {
			label.setText("Ques 6- Who decides where the children will be housed at Hogwarts?");
			radioButton[0].setText("Dubledore");
			radioButton[1].setText("The sorting hat");
			radioButton[2].setText("The Broom");
			radioButton[3].setText("Each child decides for himself");
			
			
		}
		if(current==6) {
			label.setText("Ques 7- Which teacher is trying to steal Socerer's stone?");
			radioButton[0].setText("Snape");
			radioButton[1].setText("Dumbledore");
			radioButton[2].setText("Malfoy");
			radioButton[3].setText("Quirrell");
			
			
		}
		if(current==7) {
			label.setText("Ques 8- What position does Harry play in Quidditch?");
			radioButton[0].setText("Seeker");
			radioButton[1].setText("Keeper");
			radioButton[2].setText("Goal  keeper");
			radioButton[3].setText("None");
			
			
		}
		if(current==8) {
			label.setText("Ques 9- To whom does the invisibility cloak belong originally?");
			radioButton[0].setText("James Potter");
			radioButton[1].setText("The dark lord");
			radioButton[2].setText("Siruis Black");
			radioButton[3].setText("None of the above");
			
			
		}
		if(current==9) {
			label.setText("Ques 10- Who killed sirius black");
			radioButton[0].setText("Bellatrix Lestrange");
			radioButton[1].setText("Hermoine Granger");
			radioButton[2].setText("Ronald Weasley");
			radioButton[3].setText("Lily Potter");
			
			
		}
		label.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
		{
			radioButton[j].setBounds(50,80+i,200,20);
		}
		
		
	}
	
	
	// I have added 10 quesyion with options 
	
	// Now I will write the code to declare righht option 
	
	boolean check() {
		
		if(current==0)
			return(radioButton[2].isSelected());
		
		if(current==1)
			return(radioButton[0].isSelected());
		
		if(current==2)
			return(radioButton[1].isSelected());
		
		if(current==3)
			return(radioButton[0].isSelected());
		if(current==4)
			return(radioButton[3].isSelected());
		if(current==5)
			return(radioButton[1].isSelected());
		if(current==6)
			return(radioButton[3].isSelected());
		if(current==7)
			return(radioButton[0].isSelected());
		if(current==8)
			return(radioButton[0].isSelected());
		if(current==9)
			return(radioButton[0].isSelected());
		
		return false;
	}
	// Now I will OverRide actionPerfoemed method and handle all the actions perfored by user
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnNext) {
			if(check())	
				count=count+1;
			
			current++;
			set();
			if(current==9) {
				
				btnNext.setEnabled(false);
				btnBookmark.setText("Result");
				
			}
		}
		
		if(e.getActionCommand().equals("Bookmark")) {
			
			JButton bk=new JButton("Bookamark"+x);
			bk.setBounds(480,20+30*x,100,30);
			add(bk);
			bk.addActionListener(this);
			m[x]=current;
			current++;
			set();
			if(current==9)
			{
				btnBookmark.setText("Result");
				
			}
			setVisible(false);
			setVisible(true);
		}
		for(int i=0,y=1;i<x;i++,y++)
		{
			if(e.getActionCommand().equals("Bookmark"+y)) {
				
				if(check())
						count=count+1;
				current=m[y];
				set();
				((JButton)e.getSource()).setEnabled(false);
				current=now;
			}
		}
		
		if(e.getActionCommand().equals("Result")) {
			if(check())
				count=count+1;
			current++;
			JOptionPane.showMessageDialog(this, "Correct answers="+count);
			System.exit(0);
		}
		
		
		
	}
	public static void main(String[] args) {
		// Now I will call Constructor and initailize JFrame
				new OnlineTest("Online Test App");
				
		
	}
	
}
