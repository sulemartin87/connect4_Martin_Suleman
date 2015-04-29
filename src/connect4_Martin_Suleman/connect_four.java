package connect4_Martin_Suleman;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Window;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URL;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.SystemColor;

public class connect_four implements ActionListener{


	// icons
	ImageIcon arrow = new ImageIcon("arrow.gif");
	
	//button declarations
	JButton gameButton_1 = new JButton("");
	JButton gameButton_2 = new JButton("");
	JButton gameButton_3 = new JButton("");
	JButton gameButton_4 = new JButton("");
	JButton gameButton_5 = new JButton("");
	JButton gameButton_6 = new JButton("");
	JButton gameButton_7 = new JButton("");
	JButton gameButton_8 = new JButton("");
	JButton gameButton_9 = new JButton("");
	JButton gameButton_10 = new JButton("");
	JButton gameButton_11 = new JButton("");
	JButton gameButton_12 = new JButton("");
	JButton gameButton_13 = new JButton("");
	JButton gameButton_14 = new JButton("");
	JButton gameButton_15 = new JButton("");
	JButton gameButton_16 = new JButton("");
	JButton gameButton_17 = new JButton("");
	JButton gameButton_18 = new JButton("");
	JButton gameButton_19 = new JButton("");
	JButton gameButton_20 = new JButton("");
	JButton gameButton_21 = new JButton("");
	JButton gameButton_22 = new JButton("");
	JButton gameButton_23 = new JButton("");
	JButton gameButton_24 = new JButton("");
	JButton gameButton_25 = new JButton("");
	JButton gameButton_26 = new JButton("");
	JButton gameButton_27 = new JButton("");
	JButton gameButton_28 = new JButton("");
	JButton gameButton_29 = new JButton("");
	JButton gameButton_30 = new JButton("");
	JButton gameButton_31 = new JButton("");
	JButton gameButton_32 = new JButton("");
	JButton gameButton_33 = new JButton("");
	JButton gameButton_34 = new JButton("");
	JButton gameButton_35 = new JButton("");
	JButton gameButton_36 = new JButton("");
	JButton gameButton_37 = new JButton("");
	JButton gameButton_38 = new JButton("");
	JButton gameButton_39 = new JButton("");
	JButton gameButton_40 = new JButton("");
	JButton gameButton_41 = new JButton("");
	JButton gameButton_42 = new JButton("");
	JButton button_1 = new JButton(arrow);
	JButton button_2 = new JButton(arrow);
	JButton button_3 = new JButton(arrow);
	JButton button_4 = new JButton(arrow);
	JButton button_5 = new JButton(arrow);
	JButton button_6 = new JButton(arrow);
	JButton button_7 = new JButton(arrow);
	
	//Colors 
	Color playerOne = Color.RED;
	Color playerTwo = Color.CYAN;
	Color playerColor = playerOne;
	
	
	// Text
	String playerOneText = ("1");
	String playerTwoText = "2";
	JLabel playerLabel = new JLabel("player one's turn");
	JLabel winner = new JLabel("");
	//Stuff
	private  int player;
	private int lastVar;
	private int CheckedVariable;
	private JFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "welcome to connect 4: Player One Starts!"
				+ " player one is red, player two is Cyan");
		
		connect_four window = new connect_four();
		window.frame.setVisible(true);
		
	}
	
	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 *you don't say
	 *8=======D
	 */
private void layout() 
{
		frame = new JFrame();
		frame.setBounds(100, 100, 514, 644);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 478, 55);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
			
		
		JPanel gamePanel = new JPanel();
		gamePanel.setBounds(10, 82, 478, 457);
		frame.getContentPane().add(gamePanel);
		gamePanel.setLayout(new GridLayout(6,7));
		
		
		
//buttons
		gameButton_1.setBackground(Color.WHITE);
		gamePanel.add(gameButton_1);
		
		gameButton_2.setBackground(Color.WHITE);
		gamePanel.add(gameButton_2);
		
		gameButton_3.setBackground(Color.WHITE);
		gamePanel.add(gameButton_3);
		
		gameButton_4.setBackground(Color.WHITE);
		gamePanel.add(gameButton_4);
		
		gameButton_5.setBackground(Color.WHITE);
		gamePanel.add(gameButton_5);
		
		gameButton_6.setBackground(Color.WHITE);
		gamePanel.add(gameButton_6);
		
		gameButton_7.setBackground(Color.WHITE);
		gamePanel.add(gameButton_7);
		
		gameButton_8.setBackground(Color.WHITE);
		gamePanel.add(gameButton_8);
				
		gameButton_9.setBackground(Color.WHITE);
		gamePanel.add(gameButton_9);
		
		gameButton_10.setBackground(Color.WHITE);
		gamePanel.add(gameButton_10);		
		
		gameButton_11.setBackground(Color.WHITE);
		gamePanel.add(gameButton_11);
		
		gameButton_12.setBackground(Color.WHITE);
		gamePanel.add(gameButton_12);
		
		gameButton_13.setBackground(Color.WHITE);
		gamePanel.add(gameButton_13);
		
		gameButton_14.setBackground(Color.WHITE);
		gamePanel.add(gameButton_14);

		gameButton_15.setBackground(Color.WHITE);
		gamePanel.add(gameButton_15);

		gameButton_16.setBackground(Color.WHITE);
		gamePanel.add(gameButton_16);
		
		gameButton_17.setBackground(Color.WHITE);
		gamePanel.add(gameButton_17);
		
		gameButton_18.setBackground(Color.WHITE);
		gamePanel.add(gameButton_18);
		
		gameButton_19.setBackground(Color.WHITE);
		gamePanel.add(gameButton_19);
		
		gameButton_20.setBackground(Color.WHITE);
		gamePanel.add(gameButton_20);
		
		gameButton_21.setBackground(Color.WHITE);
		gamePanel.add(gameButton_21);
		
		gameButton_22.setBackground(Color.WHITE);
		gamePanel.add(gameButton_22);
		
		gameButton_23.setBackground(Color.WHITE);
		gamePanel.add(gameButton_23);
		
		gameButton_24.setBackground(Color.WHITE);
		gamePanel.add(gameButton_24);
		
		gameButton_25.setBackground(Color.WHITE);
		gamePanel.add(gameButton_25);
		
		gameButton_26.setBackground(Color.WHITE);
		gamePanel.add(gameButton_26);
		
		gameButton_27.setBackground(Color.WHITE);
		gamePanel.add(gameButton_27);
		
		gameButton_28.setBackground(Color.WHITE);
		gamePanel.add(gameButton_28);
		
		gameButton_29.setBackground(Color.WHITE);
		gamePanel.add(gameButton_29);
		
		gameButton_30.setBackground(Color.WHITE);
		gamePanel.add(gameButton_30);
		
		gameButton_31.setBackground(Color.WHITE);
		gamePanel.add(gameButton_31);
		
		gameButton_32.setBackground(Color.WHITE);
		gamePanel.add(gameButton_32);
		
		gameButton_33.setBackground(Color.WHITE);
		gamePanel.add(gameButton_33);
		
		gameButton_34.setBackground(Color.WHITE);
		gamePanel.add(gameButton_34);
		
		gameButton_35.setBackground(Color.WHITE);
		gamePanel.add(gameButton_35);
		
		gameButton_36.setBackground(Color.WHITE);
		gamePanel.add(gameButton_36);
		
		gameButton_37.setBackground(Color.WHITE);
		gamePanel.add(gameButton_37);
		
		gameButton_38.setBackground(Color.WHITE);
		gamePanel.add(gameButton_38);
		
		gameButton_39.setBackground(Color.WHITE);
		gamePanel.add(gameButton_39);
		
		gameButton_40.setBackground(Color.WHITE);
		gamePanel.add(gameButton_40);
		
		gameButton_41.setBackground(Color.WHITE);
		gamePanel.add(gameButton_41);
		
		gameButton_42.setBackground(Color.WHITE);
		gamePanel.add(gameButton_42);
	
		button_1.addActionListener(this);
		
		button_2.addActionListener(this);

		button_3.addActionListener(this);
		
		button_4.addActionListener(this);
		
		button_5.addActionListener(this);
		
		button_6.addActionListener(this);
		
		button_7.addActionListener(this);
		
		button_1.setBackground(Color.WHITE);
		panel.add(button_1);
						
		button_2.setBackground(Color.WHITE);
		panel.add(button_2);
		
		button_3.setBackground(Color.WHITE);
		panel.add(button_3);
		
		button_4.setBackground(Color.WHITE);
		panel.add(button_4);

		button_5.setBackground(Color.WHITE);
		panel.add(button_5);
				
		button_6.setBackground(Color.WHITE);
		panel.add(button_6);
				
		button_7.setBackground(Color.WHITE);
		panel.add(button_7);
		
		
		playerLabel.setForeground(new Color(0, 0, 128));
		playerLabel.setFont(new Font("Yu Mincho", Font.PLAIN, 16));
		playerLabel.setBounds(10, 561, 135, 33);
		frame.getContentPane().add(playerLabel);
		
		JButton resetButton = new JButton("reset");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				connect_four martin = new connect_four();
				martin.frame.setVisible(true);
			}
		});
		resetButton.setFont(new Font("Yu Mincho", Font.PLAIN, 14));
		resetButton.setBounds(300, 561, 89, 33);
		frame.getContentPane().add(resetButton);
		
		JButton exitButton = new JButton("exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "thank you for playing");
				System.exit(0);
			}
		});
		//random b.s
		exitButton.setFont(new Font("Yu Mincho", Font.PLAIN, 16));
		exitButton.setBounds(399, 561, 89, 33);
		frame.getContentPane().add(exitButton);
		
		
		winner.setForeground(Color.RED);
		winner.setFont(new Font("Yu Mincho", Font.BOLD, 16));
		winner.setBounds(155, 561, 135, 36);
		frame.getContentPane().add(winner);
		
}							



 public  connect_four() 
 {
	
	 layout();
	 System.out.println(playerColor);
 }
 
 public Color gameButton_1(Color playerColor_1) 
 {
	
 	if (gameButton_1.getBackground() == Color.WHITE) 
 				
 		{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_1.setText(playerOneText);
 						gameButton_1.setForeground(playerColor_1);
 						playerColor_1 = playerOne;
 						gameButton_1.setBackground(playerColor_1);
 						playerLabel.setText("player two's turn");
 	 					
 					}
 					else {
 						
 						gameButton_1.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_1.setForeground(playerColor_1);
 						gameButton_1.setBackground(playerColor_1);
 						playerLabel.setText("player one's turn");
 	 				

 					}
 					
 		}	
 	 
 	 
 	 
 	return gameButton_1.getBackground();
 	 
  }

  public Color gameButton_2(Color playerColor_1){
  if (gameButton_2.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_2.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_2.setBackground(playerColor_1);
 	 					gameButton_2.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_2.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_2.setBackground(playerColor_1);
 	 					gameButton_2.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}

 				}
return gameButton_2.getBackground();
 			}

  public Color gameButton_3(Color playerColor_1){
  if (gameButton_3.getBackground() == Color.WHITE) 
 	{
 				if (playerColor_1 == playerOne) 
 					{
 					playerLabel.setText("player one's turn");
 						
 						playerColor_1 = playerOne;
 						gameButton_3.setBackground(playerColor_1);
 	 					gameButton_3.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 				else 
 					{
 					playerLabel.setText("player two's turn");
 						
 						playerColor_1 = playerTwo;
 						gameButton_3.setBackground(playerColor_1);
 	 					gameButton_3.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 	}
  System.out.println(playerColor_1);
  return gameButton_3.getBackground();

 }

 public Color gameButton_4(Color playerColor_1){

 if (gameButton_4.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_4.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_4.setBackground(playerColor_1);
 	 					gameButton_4.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						playerLabel.setText("player two's turn");
 						gameButton_4.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_4.setBackground(playerColor_1);
 	 					gameButton_4.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_4.getBackground();

 }
 public Color gameButton_5(Color playerColor_1){
 if (gameButton_5.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_5.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_5.setBackground(playerColor_1);
 	 					gameButton_5.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 	 					
 					}
 					else {
 						
 						gameButton_5.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_5.setBackground(playerColor_1);
 	 					gameButton_5.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_5.getBackground();
 }

 public Color gameButton_6(Color playerColor_1) {


 if (gameButton_6.getBackground() == Color.WHITE)
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_6.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_6.setBackground(playerColor_1);
 	 					gameButton_6.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_6.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_6.setBackground(playerColor_1);
 	 					gameButton_6.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_6.getBackground();

 }


 public Color gameButton_7(Color playerColor_1) {

 if (gameButton_7.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_7.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_7.setBackground(playerColor_1);
 	 					gameButton_7.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 	 					
 					}
 					else {
 						playerLabel.setText("player two's turn");
 						gameButton_7.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						
 						gameButton_7.setBackground(playerColor_1);
 	 					gameButton_7.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 	 				
 					}
 					
 				}
 return gameButton_7.getBackground();


 }

 public Color gameButton_8(Color playerColor_1) {

	 if (gameButton_8.getBackground() == Color.WHITE) 
	 				{
	 					if (playerColor_1 == playerOne) {
	 						playerLabel.setText("player one's turn");
	 						gameButton_8.setText(playerOneText);
	 						playerColor_1 = playerOne;
	 						gameButton_8.setBackground(playerColor_1);
		 					gameButton_8.setForeground(playerColor_1);
		 					playerLabel.setText("player two's turn");
	 					}
	 					else {
	 						playerLabel.setText("player two's turn");
	 						gameButton_8.setText(playerTwoText);
	 						playerColor_1 = playerTwo;
	 						gameButton_8.setBackground(playerColor_1);
		 					gameButton_8.setForeground(playerColor_1);
		 					playerLabel.setText("player one's turn");
	 					}
	 					
	 				}
	 return gameButton_8.getBackground();
 }
 public Color gameButton_9(Color playerColor_1) {

 if (gameButton_9.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_9.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_9.setBackground(playerColor_1);
 	 					gameButton_9.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 						
 					}
 					else {
 						
 						gameButton_9.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_9.setBackground(playerColor_1);
 	 					gameButton_9.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_9.getBackground();
 }

 public Color gameButton_10(Color playerColor_1) {


 		if (gameButton_10.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_10.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_10.setBackground(playerColor_1);
 	 					gameButton_10.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					else {
 						gameButton_10.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_10.setBackground(playerColor_1);
 	 					gameButton_10.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 		return gameButton_10.getBackground();
 }

 public Color gameButton_11(Color playerColor_1) {
 if (gameButton_11.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_11.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_11.setBackground(playerColor_1);
 	 					gameButton_11.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 					
 						gameButton_11.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_11.setBackground(playerColor_1);
 	 					gameButton_11.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_11.getBackground();

 }

 public Color gameButton_12(Color playerColor_1) {
 if (gameButton_12.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_12.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_12.setBackground(playerColor_1);
 	 					gameButton_12.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						gameButton_12.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_12.setBackground(playerColor_1);
 	 					gameButton_12.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_12.getBackground();

 }

 public Color gameButton_13(Color playerColor_1) {

 if (gameButton_13.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_13.setText(playerOneText);
 						playerColor_1 = playerOne;
 	 					gameButton_13.setBackground(playerColor_1);
 	 					gameButton_13.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_13.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 	 					gameButton_13.setBackground(playerColor_1);
 	 					gameButton_13.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}

 				}
 return gameButton_13.getBackground();
 }

 public Color gameButton_14(Color playerColor_1) {

 if (gameButton_14.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_14.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_14.setBackground(playerColor_1);
 	 					gameButton_14.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_14.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_14.setBackground(playerColor_1);
 	 					gameButton_14.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_14.getBackground();
 }

 public Color gameButton_15(Color playerColor_1) {
 if (gameButton_15.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) 
 					{
 						
 						gameButton_15.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_15.setBackground(playerColor_1);
 	 					gameButton_15.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else 
 					{
 						
 						gameButton_15.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						//boom boom
 						gameButton_15.setBackground(playerColor_1);
 	 					gameButton_15.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 						
 					}
 					
 				}
 return gameButton_15.getBackground();

 }

 public Color gameButton_16(Color playerColor_1) {
 if (gameButton_16.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_16.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_16.setBackground(playerColor_1);
 	 					gameButton_16.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 						
 					}
 					else {
 						
 						gameButton_16.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_16.setBackground(playerColor_1);
 	 					gameButton_16.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_16.getBackground();

 }

 public Color gameButton_17(Color playerColor_1) {

 if (gameButton_17.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_17.setText(playerOneText);
 						gameButton_17.setForeground(playerColor_1);
 						playerColor_1 = playerOne;
 						gameButton_17.setBackground(playerColor_1);
 	 					gameButton_17.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						playerLabel.setText("player two's turn");
 						gameButton_17.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_17.setBackground(playerColor_1);
 	 					gameButton_17.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_17.getBackground();
 }

 public Color gameButton_18(Color playerColor_1) {
 if (gameButton_18.getBackground() == Color.WHITE) 
 				{	
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_18.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_18.setBackground(playerColor_1);
 	 					gameButton_18.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_18.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_18.setBackground(playerColor_1);
 	 					gameButton_18.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_18.getBackground();

 }

 public Color gameButton_19(Color playerColor_1) {
 if (gameButton_19.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_19.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_19.setBackground(playerColor_1);
 	 					gameButton_19.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_19.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_19.setBackground(playerColor_1);
 	 					gameButton_19.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_19.getBackground();

 }

 public Color gameButton_20(Color playerColor_1) {

 if (gameButton_20.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						playerLabel.setText("player one's turn");
 						gameButton_20.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_20.setBackground(playerColor_1);
 	 					gameButton_20.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						playerLabel.setText("player one's turn");
 						gameButton_20.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_20.setBackground(playerColor_1);
 	 					gameButton_20.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_20.getBackground();
 }

 public Color gameButton_21(Color playerColor_1) {
 if (gameButton_21.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 					
 						gameButton_21.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_21.setBackground(playerColor_1);
 	 					gameButton_21.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 						
 					}
 					else {
 						
 						gameButton_21.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_21.setBackground(playerColor_1);
 	 					gameButton_21.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_21.getBackground();

 }

 public Color gameButton_22(Color playerColor_1) {
 if (gameButton_22.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) 
 					{
 						
 						gameButton_22.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_22.setBackground(playerColor_1);
 	 					gameButton_22.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else 
 					{
 						
 						gameButton_22.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_22.setBackground(playerColor_1);
 	 					gameButton_22.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 					
 				}
 return gameButton_22.getBackground();

 }

 public Color gameButton_23(Color playerColor_1) {

 if (gameButton_23.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_23.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_23.setBackground(playerColor_1);
 	 					gameButton_23.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						playerLabel.setText("player two's turn");
 						gameButton_23.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_23.setBackground(playerColor_1);
 	 					gameButton_23.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					
 					}
 					
 				}
 return gameButton_23.getBackground();
 }

 public Color gameButton_24(Color playerColor_1) {

 if (gameButton_24.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_24.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_24.setBackground(playerColor_1);
 	 					gameButton_24.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						playerLabel.setText("player two's turn");
 						gameButton_24.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_24.setBackground(playerColor_1);
 	 					gameButton_24.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_24.getBackground();
 }

 public Color gameButton_25(Color playerColor_1) {
 if (gameButton_25.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_25.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_25.setBackground(playerColor_1);
 	 					gameButton_25.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_25.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_25.setBackground(playerColor_1);
 	 					gameButton_25.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_25.getBackground();

 }

 public Color gameButton_26(Color playerColor_1) {

 if (gameButton_26.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_26.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_26.setBackground(playerColor_1);
 	 					gameButton_26.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_26.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_26.setBackground(playerColor_1);
 	 					gameButton_26.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_26.getBackground();
 }

 public Color gameButton_27(Color playerColor_1) {
 if (gameButton_27.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_27.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_27.setBackground(playerColor_1);
 	 					gameButton_27.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_27.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_27.setBackground(playerColor_1);
 	 					gameButton_27.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_27.getBackground();

 }

 public Color gameButton_28(Color playerColor_1) {

 if (gameButton_28.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_28.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_28.setBackground(playerColor_1);
 	 					gameButton_28.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_28.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_28.setBackground(playerColor_1);
 	 					gameButton_28.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_28.getBackground();
 }

 public Color gameButton_29(Color playerColor_1) {


	 					if (playerColor_1 == playerOne) {
	 						
	 						gameButton_29.setText(playerOneText);
	 						playerColor_1 = playerOne;
	 						gameButton_29.setBackground(playerColor_1);
		 					gameButton_29.setForeground(playerColor_1);
		 					playerLabel.setText("player two's turn");
	 					}
	 					else {
	 						
	 						gameButton_29.setText(playerTwoText);
	 						playerColor_1 = playerTwo;
	 						gameButton_29.setBackground(playerColor_1);
		 					gameButton_29.setForeground(playerColor_1);
		 					playerLabel.setText("player one's turn");
	 					}
	 					
	 				
	 return gameButton_29.getBackground();
	 }
 

 public Color gameButton_30(Color playerColor_1) {
 if (gameButton_30.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_30.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_30.setBackground(playerColor_1);
 	 					gameButton_30.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 						
 					}
 					else {
 						
 						gameButton_30.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_30.setBackground(playerColor_1);
 	 					gameButton_30.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 		
 					}
 					
 				}
 return gameButton_30.getBackground();

 }


 public Color gameButton_31(Color playerColor_1) {

 if (gameButton_31.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_31.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_31.setBackground(playerColor_1);
 	 					gameButton_31.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_31.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_31.setBackground(playerColor_1);
 	 					gameButton_31.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_31.getBackground();
 }

 public Color gameButton_32(Color playerColor_1) {

 if (gameButton_32.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_32.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_32.setBackground(playerColor_1);
 	 					gameButton_32.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_32.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_32.setBackground(playerColor_1);
 	 					gameButton_32.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_32.getBackground();
 }

 public Color gameButton_33(Color playerColor_1) {
 if (gameButton_33.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_33.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_33.setBackground(playerColor_1);
 	 					gameButton_33.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_33.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_33.setBackground(playerColor_1);
 	 					gameButton_33.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_33.getBackground();

 }

 public Color gameButton_34(Color playerColor_1) {
 if (gameButton_34.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_34.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_34.setBackground(playerColor_1);
 	 					gameButton_34.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						
 						gameButton_34.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_34.setBackground(playerColor_1);
 	 					gameButton_34.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_34.getBackground();

 }

 public Color gameButton_35(Color playerColor_1) {

 if (gameButton_35.getBackground() == Color.WHITE) 
 				{
 					if (playerColor_1 == playerOne) {
 						
 						gameButton_35.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_35.setBackground(playerColor_1);
 	 					gameButton_35.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 					}
 					else {
 						playerLabel.setText("player one's turn");
 						gameButton_35.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_35.setBackground(playerColor_1);
 	 					gameButton_35.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 					}
 					
 				}
 return gameButton_35.getBackground();
 }

 public Color gameButton_36(Color playerColor_1) {



 					
 					if (playerColor_1 == playerOne) 
 					{
 						
 						gameButton_36.setText(playerOneText);
 						playerColor_1 = playerOne;
 						gameButton_36.setBackground(playerColor_1);
 	 					gameButton_36.setForeground(playerColor_1);
 	 					playerLabel.setText("player two's turn");
 	 					
 					}
 					else if (playerColor_1 == playerTwo)
 					{
 						
 						gameButton_36.setText(playerTwoText);
 						playerColor_1 = playerTwo;
 						gameButton_36.setBackground(playerColor_1);
 	 					gameButton_36.setForeground(playerColor_1);
 	 					playerLabel.setText("player one's turn");
 	 					
 					}
 					
 					
 					

 return gameButton_36.getBackground();
 }

 public Color gameButton_37(Color playerColor_1) {
		if (playerColor_1 == playerOne) 
		{
			
			gameButton_37.setText(playerOneText);
			playerColor_1 = playerOne;
			gameButton_37.setBackground(playerColor_1);
			gameButton_37.setForeground(playerColor_1);
			playerLabel.setText("player two's turn");

		}
		else if (playerColor_1 == playerTwo)
		{
			
			gameButton_37.setText(playerTwoText);
			playerColor_1 = playerTwo;
			gameButton_37.setBackground(playerColor_1);
			gameButton_37.setForeground(playerColor_1);
			playerLabel.setText("player one's turn");
		}

 return gameButton_37.getBackground();
 }

 public Color gameButton_38(Color playerColor_1) {
	 if (playerColor_1 == playerOne) 
		{
			gameButton_38.setText(playerOneText);
			playerColor_1 = playerOne;
			gameButton_38.setBackground(playerColor_1);
			gameButton_38.setForeground(playerColor_1);
			playerLabel.setText("player two's turn");

		}
		else if (playerColor_1 == playerTwo)
		{
			
			gameButton_38.setText(playerTwoText);
			playerColor_1 = playerTwo;
			gameButton_38.setBackground(playerColor_1);
			gameButton_38.setForeground(playerColor_1);
			playerLabel.setText("player one's turn");
		}
 return gameButton_38.getBackground();

 }

 public Color gameButton_39(Color playerColor_1) {
	 if (playerColor_1 == playerOne) 
		{
			
			gameButton_39.setText(playerOneText);
			playerColor_1 = playerOne;
			gameButton_39.setBackground(playerColor_1);
			gameButton_39.setForeground(playerColor_1);
			playerLabel.setText("player two's turn");

		}
		else if (playerColor_1 == playerTwo)
		{
			
			gameButton_39.setText(playerTwoText);
			playerColor_1 = playerTwo;
			gameButton_39.setBackground(playerColor_1);
			gameButton_39.setForeground(playerColor_1);
			playerLabel.setText("player one's turn");
		}
 return gameButton_39.getBackground();
 }

 public Color gameButton_40(Color playerColor_1) {

	 if (playerColor_1 == playerOne) 
		{
			
			gameButton_40.setText(playerOneText);
			playerColor_1 = playerOne;
			gameButton_40.setBackground(playerColor_1);
			gameButton_40.setForeground(playerColor_1);
			playerLabel.setText("player two's turn");

		}
		else if (playerColor_1 == playerTwo)
		{
			
			gameButton_40.setText(playerTwoText);
			playerColor_1 = playerTwo;
			gameButton_40.setBackground(playerColor_1);
			gameButton_40.setForeground(playerColor_1);
			playerLabel.setText("player one's turn");
		}
 return gameButton_40.getBackground();
 }

 public Color gameButton_41(Color playerColor_1) {
	 if (playerColor_1 == playerOne) 
		{
			
			gameButton_41.setText(playerOneText);
			playerColor_1 = playerOne;
			gameButton_41.setBackground(playerColor_1);
			gameButton_41.setForeground(playerColor_1);
			playerLabel.setText("player two's turn");

		}
		else if (playerColor_1 == playerTwo)
		{
			playerLabel.setText("player two's turn");
			gameButton_41.setText(playerTwoText);
			playerColor_1 = playerTwo;
			gameButton_41.setBackground(playerColor_1);
			gameButton_41.setForeground(playerColor_1);
			playerLabel.setText("player one's turn");
		}
 return gameButton_41.getBackground();
 }

 public Color gameButton_42(Color playerColor_1) {
	 if (playerColor_1 == playerOne) 
		{
			
			gameButton_42.setText(playerOneText);
			playerColor_1 = playerOne;
			gameButton_42.setBackground(playerColor_1);
			gameButton_42.setForeground(playerColor_1);
			playerLabel.setText("player two's turn");

		}
		else if (playerColor_1 == playerTwo)
		{
			
			gameButton_42.setText(playerTwoText);
			playerColor_1 = playerTwo;
			gameButton_42.setBackground(playerColor_1);
			gameButton_42.setForeground(playerColor_1);
			playerLabel.setText("player one's turn");
		}
 return gameButton_42.getBackground();

 }

 //actions
 
@Override
public void actionPerformed(ActionEvent buttons) {
	// TODO Auto-generated method tellie tubbies
	int checker = checking();
	int playerChecker = lastButton(0);

if (buttons.getSource() == button_1){
		
	if (gameButton_36.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
		
		gameButton_36(playerOne);
		playerChecker = lastButton(1);
		match();
		;
		

	}
	else if (gameButton_36.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
		gameButton_36(playerOne);
		playerChecker = lastButton(1);
		match();
		

	}
	else if (gameButton_36.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
		gameButton_36(playerTwo);
		playerChecker = lastButton(2);
		match();
		;
	}
	else if (gameButton_36.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
		gameButton_36(playerOne);
		System.out.println(playerChecker);
		playerChecker = lastButton(1);
		match();
		

	}
	
		else if(gameButton_29.getBackground()== Color.WHITE){
			
			if (playerChecker == 2){
				System.out.println(playerChecker);
				gameButton_29(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_29(playerOne);
				playerChecker = lastButton(1);
				System.out.println(playerChecker);
				match();
				
			}
		}
		else if (gameButton_22.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_22(playerTwo);
				playerChecker = lastButton(2);
				match();
				
				
			}
			else {
				gameButton_22(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_15.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_15(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_15(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_8.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_8(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_8(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_1.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_1(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_1(playerOne);
				playerChecker = lastButton(1);
				match();
			}
			if (gameButton_1.getBackground() != Color.WHITE){
				button_1.setEnabled(false);
				match();
			}
		}

	}
	else if (buttons.getSource() == button_2){
	
		if (gameButton_37.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
			
			gameButton_37(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_37.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
			gameButton_37(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_37.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
			gameButton_37(playerTwo);
			playerChecker = lastButton(2);
			match();
			
		}
		else if (gameButton_37.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
			gameButton_37(playerOne);
			System.out.println(playerChecker);
			playerChecker = lastButton(1);
			match();
			

		}
	
		else if(gameButton_30.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_30(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_30(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_23.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_23(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_23(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_16.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_16(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_16(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_9.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_9(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_9(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_2.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_2(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_2(playerOne);
				playerChecker = lastButton(1);
				match();
			}
			if (gameButton_2.getBackground() != Color.WHITE){
				button_2.setEnabled(false);
				match();
			}
		}

		
	}
	else if (buttons.getSource() == button_3)
	{
if (gameButton_38.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
			
			gameButton_38(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_38.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
			gameButton_38(playerOne);
			playerChecker = lastButton(1);
			match();

		}
		else if (gameButton_38.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
			gameButton_38(playerTwo);
			playerChecker = lastButton(2);
			match();
		}
		else if (gameButton_38.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
			gameButton_38(playerOne);
			
			System.out.println(playerChecker);
			playerChecker = lastButton(1);
			match();

		}
	
	
		else if(gameButton_31.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_31(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_31(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_24.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_24(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_24(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_17.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_17(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_17(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_10.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_10(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_10(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_3.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_3(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_3(playerOne);
				playerChecker = lastButton(1);
				match();
			}
			if (gameButton_3.getBackground() != Color.WHITE){
				button_3.setEnabled(false);
				match();
			}
		}

	}
	else if (buttons.getSource() == button_4){
if (gameButton_39.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
			
			gameButton_39(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_39.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
			gameButton_39(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_39.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
			gameButton_39(playerTwo);
			playerChecker = lastButton(2);
			match();
		}
		else if (gameButton_39.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
			gameButton_39(playerOne);
			System.out.println(playerChecker);
			playerChecker = lastButton(1);
			match();
			
		}
	
		else if(gameButton_32.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_32(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_32(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_25.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_25(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_25(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_18.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_18(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_18(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_11.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_11(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_11(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_4.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_4(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_4(playerOne);
				playerChecker = lastButton(1);
				match();
			}
			if (gameButton_4.getBackground() != Color.WHITE){
				button_4.setEnabled(false);
				match();
			}
		}
	
	}
	else if (buttons.getSource() == button_5){
if (gameButton_40.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
			
			gameButton_40(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_40.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
			gameButton_40(playerOne);
			playerChecker = lastButton(1);
			match();

		}
		else if (gameButton_40.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
			gameButton_40(playerTwo);
			playerChecker = lastButton(2);
			match();
		}
		else if (gameButton_40.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
			gameButton_40(playerOne);
			System.out.println(playerChecker);
			playerChecker = lastButton(1);
			match();
			

		}
	
	
		else if(gameButton_33.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_33(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_33(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_26.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_26(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_26(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_19.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_19(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_19(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_12.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_12(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_12(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_5.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_5(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_5(playerOne);
				playerChecker = lastButton(1);
				match();
				
			}
			if (gameButton_5.getBackground() != Color.WHITE){
				button_5.setEnabled(false);
				match();
			}
		}

		
	}
else if (buttons.getSource() == button_6){
  if (gameButton_41.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
			
			gameButton_41(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_41.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
			gameButton_41(playerOne);
			playerChecker = lastButton(1);
			match();

		}
		else if (gameButton_41.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
			gameButton_41(playerTwo);
			playerChecker = lastButton(2);
			match();
		}
		else if (gameButton_41.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
			gameButton_41(playerOne);
			System.out.println(playerChecker);
			playerChecker = lastButton(1);
			match();

		}
	
	
		else if(gameButton_34.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_34(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_34(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_27.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_27(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_27(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_20.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2 ){
				gameButton_20(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_20(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_13.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_13(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_13(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_6.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_6(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_6(playerOne);
				playerChecker = lastButton(1);
				match();
			}
			if (gameButton_6.getBackground() != Color.WHITE){
				button_6.setEnabled(false);
				match();
			}
		}

		
	}
	else if (buttons.getSource() == button_7){
if (gameButton_42.getBackground()== Color.WHITE &&  checker == 1 &&playerChecker == 0){
			
			gameButton_42(playerOne);
			playerChecker = lastButton(1);
			match();
			
			

		}
		else if (gameButton_42.getBackground()== Color.WHITE && checker == 1 &&playerChecker == 1){
			gameButton_42(playerOne);
			playerChecker = lastButton(1);
			match();
			

		}
		else if (gameButton_42.getBackground()== Color.WHITE &&  checker == 2 &&playerChecker == 2) {
			gameButton_42(playerTwo);
			playerChecker = lastButton(2);
			match();
		}
		else if (gameButton_42.getBackground()== Color.WHITE &&  checker == 2 && playerChecker == 1) {
			gameButton_42(playerOne);
			System.out.println(playerChecker);
			playerChecker = lastButton(1);
			match();

		}
		
	
	
		else if(gameButton_35.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_35(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_35(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_28.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_28(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_28(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_21.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_21(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_21(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_14.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_14(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_14(playerOne);
				playerChecker = lastButton(1);
				match();
			}
		}
		else if (gameButton_7.getBackground()== Color.WHITE ){
			
			if (playerChecker == 2){
				gameButton_7(playerTwo);
				playerChecker = lastButton(2);
				match();
			}
			else {
				gameButton_7(playerOne);
				playerChecker = lastButton(1);
				match();
			}
			if (gameButton_7.getBackground() != Color.WHITE){
				button_7.setEnabled(false);
				match();
			}
		}

}
}


public int checking(){
System.out.println(player);
	if ((gameButton_36.getBackground() == Color.WHITE)&& (gameButton_37.getBackground() == Color.WHITE)&&
	(gameButton_38.getBackground() == Color.WHITE)&&(gameButton_39.getBackground() == Color.WHITE)&&
	(gameButton_40.getBackground() == Color.WHITE)&&(gameButton_41.getBackground() == Color.WHITE)&&
	(gameButton_41.getBackground() == Color.WHITE) && (gameButton_42.getBackground() == Color.WHITE))
	{
		player = 1;
	}
	else {
		player = 2;
	}
	System.out.println(player);
	return player;
}

public int lastButton(int inputVar) {
	
	if (inputVar == 1) {
		
		lastVar = 2;
	}
	else if (inputVar == 2){
		
		lastVar = 1;
	}
	return lastVar;
}

public int checkLastButton(int checkVar) {
	int mine = 0 + checkVar;
	System.out.println(mine);
if (mine == 10){
	if (checkVar == 1) {
		
		CheckedVariable = 2;
	}
	else if (checkVar == 2) {
		
		CheckedVariable = 1;
	}
	System.out.println(mine);
}
else {
	System.out.println(mine);
}
	return CheckedVariable;
}

public void match(){
	//button number 1
	if (gameButton_1.getText().equals(playerOneText) && gameButton_8.getText().equals(playerOneText) && gameButton_15.getText().equals(playerOneText) && gameButton_22.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	}
	if (gameButton_1.getText().equals(playerOneText) && gameButton_2.getText().equals(playerOneText) && gameButton_3.getText().equals(playerOneText) && gameButton_4.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	if (gameButton_1.getText().equals(playerOneText) && gameButton_9.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	//button number 1 number 2
	if (gameButton_1.getText().equals(playerTwoText) && gameButton_8.getText().equals(playerTwoText) && gameButton_15.getText().equals(playerTwoText) && gameButton_22.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_1.getText().equals(playerTwoText) && gameButton_2.getText().equals(playerTwoText) && gameButton_3.getText().equals(playerTwoText) && gameButton_4.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	if (gameButton_1.getText().equals(playerTwoText) && gameButton_9.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	//button number 2
	if (gameButton_2.getText().equals(playerOneText) && gameButton_9.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText) && gameButton_23.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_2.getText().equals(playerOneText) && gameButton_3.getText().equals(playerOneText) && gameButton_4.getText().equals(playerOneText) && gameButton_5.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	if (gameButton_2.getText().equals(playerOneText) && gameButton_10.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	//button number 2 number 2
	if (gameButton_2.getText().equals(playerTwoText) && gameButton_9.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_2.getText().equals(playerTwoText) && gameButton_3.getText().equals(playerTwoText) && gameButton_4.getText().equals(playerTwoText) && gameButton_5.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	if (gameButton_2.getText().equals(playerTwoText) && gameButton_10.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	//button number 3
	if (gameButton_3.getText().equals(playerOneText) && gameButton_4.getText().equals(playerOneText) && gameButton_5.getText().equals(playerOneText) && gameButton_6.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_3.getText().equals(playerOneText) && gameButton_10.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	if (gameButton_3.getText().equals(playerOneText) && gameButton_11.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	//button number 3 number 2
	if (gameButton_3.getText().equals(playerTwoText) && gameButton_4.getText().equals(playerTwoText) && gameButton_5.getText().equals(playerTwoText) && gameButton_6.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_3.getText().equals(playerTwoText) && gameButton_10.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	if (gameButton_3.getText().equals(playerTwoText) && gameButton_11.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	//button number 4
	if (gameButton_4.getText().equals(playerOneText) && gameButton_5.getText().equals(playerOneText) && gameButton_6.getText().equals(playerOneText) && gameButton_7.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_4.getText().equals(playerOneText) && gameButton_12.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText) && gameButton_28.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	if (gameButton_4.getText().equals(playerOneText) && gameButton_11.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	if (gameButton_4.getText().equals(playerOneText) && gameButton_10.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText) && gameButton_22.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
		}
	//button number 4 number 2
	if (gameButton_4.getText().equals(playerTwoText) && gameButton_5.getText().equals(playerTwoText) && gameButton_6.getText().equals(playerTwoText) && gameButton_7.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_4.getText().equals(playerTwoText) && gameButton_12.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText) && gameButton_28.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	if (gameButton_4.getText().equals(playerTwoText) && gameButton_11.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	if (gameButton_4.getText().equals(playerTwoText) && gameButton_10.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText) && gameButton_22.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
		}
	//button number 5
	if (gameButton_5.getText().equals(playerOneText) && gameButton_12.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_5.getText().equals(playerOneText) && gameButton_11.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_23.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	//button number 5 number 2
	if (gameButton_5.getText().equals(playerTwoText) && gameButton_12.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_5.getText().equals(playerTwoText) && gameButton_11.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	//button number 6
	if (gameButton_6.getText().equals(playerOneText) && gameButton_13.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_6.getText().equals(playerOneText) && gameButton_12.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	//button number 6 number 2
	if (gameButton_6.getText().equals(playerTwoText) && gameButton_13.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_6.getText().equals(playerTwoText) && gameButton_12.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	//button number 7
	if (gameButton_7.getText().equals(playerOneText) && gameButton_14.getText().equals(playerOneText) && gameButton_21.getText().equals(playerOneText) && gameButton_28.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_7.getText().equals(playerOneText) && gameButton_13.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText)){
	winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
	confirm();
	}
	//button number 7 number 2
	if (gameButton_7.getText().equals(playerTwoText) && gameButton_14.getText().equals(playerTwoText) && gameButton_21.getText().equals(playerTwoText) && gameButton_28.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_7.getText().equals(playerTwoText) && gameButton_13.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText)){
	;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
	confirm();
	}
	//button number 8
		if (gameButton_8.getText().equals(playerOneText) && gameButton_9.getText().equals(playerOneText) && gameButton_10.getText().equals(playerOneText) && gameButton_11.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
		}
		if (gameButton_8.getText().equals(playerOneText) && gameButton_15.getText().equals(playerOneText) && gameButton_22.getText().equals(playerOneText) && gameButton_29.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
		}
		if (gameButton_8.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
		}
		//button number 8 number 2
			if (gameButton_8.getText().equals(playerTwoText) && gameButton_9.getText().equals(playerTwoText) && gameButton_10.getText().equals(playerTwoText) && gameButton_11.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			if (gameButton_8.getText().equals(playerTwoText) && gameButton_15.getText().equals(playerTwoText) && gameButton_22.getText().equals(playerTwoText) && gameButton_29.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			if (gameButton_8.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			
			//button number 9
			if (gameButton_9.getText().equals(playerOneText) && gameButton_10.getText().equals(playerOneText) && gameButton_11.getText().equals(playerOneText) && gameButton_12.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			if (gameButton_9.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText) && gameButton_23.getText().equals(playerOneText) && gameButton_30.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			if (gameButton_9.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			//button number 9 number 2
			if (gameButton_9.getText().equals(playerTwoText) && gameButton_10.getText().equals(playerTwoText) && gameButton_11.getText().equals(playerTwoText) && gameButton_12.getText().equals(playerTwoText)){
						;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
						confirm();
					}
			if (gameButton_9.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText) && gameButton_30.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
					}
			if (gameButton_9.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText)){
						;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
						confirm();
					}
			//button number 10
			if (gameButton_10.getText().equals(playerOneText) && gameButton_11.getText().equals(playerOneText) && gameButton_12.getText().equals(playerOneText) && gameButton_13.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			if (gameButton_10.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_31.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			if (gameButton_10.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_34.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			//button number 10 number 2
			if (gameButton_10.getText().equals(playerTwoText) && gameButton_11.getText().equals(playerTwoText) && gameButton_12.getText().equals(playerTwoText) && gameButton_13.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			if (gameButton_10.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_31.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			if (gameButton_10.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_34.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			//button number 11 fat one
			if (gameButton_11.getText().equals(playerOneText) && gameButton_12.getText().equals(playerOneText) && gameButton_13.getText().equals(playerOneText) && gameButton_14.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			if (gameButton_11.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			if (gameButton_11.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_23.getText().equals(playerOneText) && gameButton_29.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			if (gameButton_11.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText) && gameButton_35.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			//button number 11 number 2
			if (gameButton_11.getText().equals(playerTwoText) && gameButton_12.getText().equals(playerTwoText) && gameButton_13.getText().equals(playerTwoText) && gameButton_14.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			if (gameButton_11.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			if (gameButton_11.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText) && gameButton_35.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			if (gameButton_11.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText) && gameButton_29.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
		
			//button number 12
			if (gameButton_12.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			if (gameButton_12.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_30.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			//button number 12 number 2
			if (gameButton_12.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			if (gameButton_12.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_30.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			//button number 13
			if (gameButton_13.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText) && gameButton_34.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			if (gameButton_13.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_31.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			//button number 13 number 2
			if (gameButton_13.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText) && gameButton_34.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			if (gameButton_13.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_31.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			//button number 14
			if (gameButton_14.getText().equals(playerOneText) && gameButton_21.getText().equals(playerOneText) && gameButton_28.getText().equals(playerOneText) && gameButton_35.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			if (gameButton_14.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
			}
			//button number 14 number 2
			if (gameButton_14.getText().equals(playerTwoText) && gameButton_21.getText().equals(playerTwoText) && gameButton_28.getText().equals(playerTwoText) && gameButton_35.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			if (gameButton_14.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
			}
			
			//button number 15 is 
			if (gameButton_15.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			//button number 15 number 2
			if (gameButton_15.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			//button number 16
			if (gameButton_16.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			//button number 16 number 2
			if (gameButton_16.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			//button number 17
			if (gameButton_17.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			//button number 17 number 2
			if (gameButton_17.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			//button number 18
			if (gameButton_18.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText) && gameButton_21.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
			}
			//button number 18 number 2
			if (gameButton_18.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText) && gameButton_21.getText().equals(playerTwoText)){
			;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
			confirm();
			}
			//button number 19
			//button number 20
			//button number 21
			//button number 22
			if (gameButton_22.getText().equals(playerOneText) && gameButton_23.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 22 number 2
			if (gameButton_22.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			
			//button number 23 so 
			if (gameButton_23.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 23 number 2
			if (gameButton_23.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			//button number 24
			if (gameButton_24.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 24 number 2
			if (gameButton_24.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			//button number 25
			if (gameButton_25.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText) && gameButton_28.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 25 number 2
			if (gameButton_25.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText) && gameButton_28.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			//button number 26
			//button number 27
			//button number 28
			
			//button number 29
			if (gameButton_29.getText().equals(playerOneText) && gameButton_30.getText().equals(playerOneText) && gameButton_31.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 29 number 2
			if (gameButton_29.getText().equals(playerTwoText) && gameButton_30.getText().equals(playerTwoText) && gameButton_31.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			//button number 30
			if (gameButton_30.getText().equals(playerOneText) && gameButton_31.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 30 number 2
			if (gameButton_30.getText().equals(playerTwoText) && gameButton_31.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			//button number 31
			if (gameButton_31.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText) && gameButton_34.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 31 number 2
			if (gameButton_31.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText) && gameButton_34.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			//button number 32 fat
			if (gameButton_32.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText) && gameButton_34.getText().equals(playerOneText) && gameButton_35.getText().equals(playerOneText)){
				winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
				confirm();
				}
			//button number 32 number 2
			if (gameButton_32.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText) && gameButton_34.getText().equals(playerTwoText) && gameButton_35.getText().equals(playerTwoText)){
				;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
				confirm();
				}
			
	//button number 36
	if (gameButton_36.getText().equals(playerOneText) && gameButton_37.getText().equals(playerOneText) && gameButton_38.getText().equals(playerOneText) && gameButton_39.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_36.getText().equals(playerOneText) && gameButton_29.getText().equals(playerOneText) && gameButton_22.getText().equals(playerOneText) && gameButton_15.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_36.getText().equals(playerOneText) && gameButton_30.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	//button number 36 player two
	if (gameButton_36.getText().equals(playerTwoText) && gameButton_37.getText().equals(playerTwoText) && gameButton_38.getText().equals(playerTwoText) && gameButton_39.getText().equals(playerTwoText)){
		JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_36.getText().equals(playerTwoText) && gameButton_29.getText().equals(playerTwoText) && gameButton_22.getText().equals(playerTwoText) && gameButton_15.getText().equals(playerTwoText)){
		JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_36.getText().equals(playerTwoText) && gameButton_30.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText)){
		JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	//button number 37
	if (gameButton_37.getText().equals(playerOneText) && gameButton_38.getText().equals(playerOneText) && gameButton_39.getText().equals(playerOneText) && gameButton_40.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_37.getText().equals(playerOneText) && gameButton_31.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_37.getText().equals(playerOneText) && gameButton_30.getText().equals(playerOneText) && gameButton_23.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	//button number 37 player two 
	if (gameButton_37.getText().equals(playerTwoText) && gameButton_38.getText().equals(playerTwoText) && gameButton_39.getText().equals(playerTwoText) && gameButton_40.getText().equals(playerTwoText)){
		JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_37.getText().equals(playerTwoText) && gameButton_31.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText)){
		JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_37.getText().equals(playerTwoText) && gameButton_30.getText().equals(playerTwoText) && gameButton_23.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText)){
		JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	//button number 38
	if (gameButton_38.getText().equals(playerOneText) && gameButton_39.getText().equals(playerOneText) && gameButton_40.getText().equals(playerOneText) && gameButton_41.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_38.getText().equals(playerOneText) && gameButton_31.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_38.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	//button number 38 number two
	if (gameButton_38.getText().equals(playerTwoText) && gameButton_39.getText().equals(playerTwoText) && gameButton_40.getText().equals(playerTwoText) && gameButton_41.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_38.getText().equals(playerTwoText) && gameButton_31.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_38.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	//button number 39
	if (gameButton_39.getText().equals(playerOneText) && gameButton_40.getText().equals(playerOneText) && gameButton_41.getText().equals(playerOneText) && gameButton_42.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_39.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText) && gameButton_21.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	if (gameButton_39.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText)){
		winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
		confirm();
	}
	//button number 39 number 2
	if (gameButton_39.getText().equals(playerTwoText) && gameButton_40.getText().equals(playerTwoText) && gameButton_41.getText().equals(playerTwoText) && gameButton_42.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_39.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText) && gameButton_21.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	if (gameButton_39.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText)){
		;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
		confirm();
	}
	//button number 40
		if (gameButton_40.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_19.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
		}
		if (gameButton_40.getText().equals(playerOneText) && gameButton_32.getText().equals(playerOneText) && gameButton_24.getText().equals(playerOneText) && gameButton_16.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
		}
	//button number 40 number 2
		if (gameButton_40.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_19.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
			}
		if (gameButton_40.getText().equals(playerTwoText) && gameButton_32.getText().equals(playerTwoText) && gameButton_24.getText().equals(playerTwoText) && gameButton_16.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
				}
		//button number 41
		if (gameButton_41.getText().equals(playerOneText) && gameButton_34.getText().equals(playerOneText) && gameButton_27.getText().equals(playerOneText) && gameButton_20.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
		}
		if (gameButton_41.getText().equals(playerOneText) && gameButton_33.getText().equals(playerOneText) && gameButton_25.getText().equals(playerOneText) && gameButton_17.getText().equals(playerOneText)){
			winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
			confirm();
		}
		//button number 41
				if (gameButton_41.getText().equals(playerTwoText) && gameButton_34.getText().equals(playerTwoText) && gameButton_27.getText().equals(playerTwoText) && gameButton_20.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
				}
				if (gameButton_41.getText().equals(playerTwoText) && gameButton_33.getText().equals(playerTwoText) && gameButton_25.getText().equals(playerTwoText) && gameButton_17.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
				}
		//button number 42
				if (gameButton_42.getText().equals(playerOneText) && gameButton_35.getText().equals(playerOneText) && gameButton_28.getText().equals(playerOneText) && gameButton_21.getText().equals(playerOneText)){
					winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
					confirm();
				}
				if (gameButton_42.getText().equals(playerOneText) && gameButton_34.getText().equals(playerOneText) && gameButton_26.getText().equals(playerOneText) && gameButton_18.getText().equals(playerOneText)){
					winner.setText("player one wins");JOptionPane.showMessageDialog(null, "player one wins");winner.setText("player one wins");
					confirm();
				}
		//button number 42 number 2
				if (gameButton_42.getText().equals(playerTwoText) && gameButton_35.getText().equals(playerTwoText) && gameButton_28.getText().equals(playerTwoText) && gameButton_21.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
				}
				if (gameButton_42.getText().equals(playerTwoText) && gameButton_34.getText().equals(playerTwoText) && gameButton_26.getText().equals(playerTwoText) && gameButton_18.getText().equals(playerTwoText)){
					;winner.setText("player Two wins");JOptionPane.showMessageDialog(null, "player Two wins");
					confirm();
				}
	
				if (button_1.isEnabled() == false && button_2.isEnabled() == false && button_3.isEnabled() == false
						&& button_4.isEnabled() == false && button_5.isEnabled() == false && button_6.isEnabled() == false
						&& button_7.isEnabled() == false){
					winner.setText("it is a draw");
					JOptionPane.showMessageDialog(null, "It is a draw");
					
					confirm();
				}


}

public void confirm(){

	int Query=JOptionPane.showConfirmDialog(frame, "Would you like to play again??","Connect 4",JOptionPane.YES_NO_OPTION);
	if(Query==0)
	{
		this.frame.setVisible(false);
		connect_four martin = new connect_four();
		martin.frame.setVisible(true);
	}
	else if(Query==1)
	{
		JOptionPane.showMessageDialog(null, "thank you for playing");
		System.exit(0);
	}
	
}
}


//end program