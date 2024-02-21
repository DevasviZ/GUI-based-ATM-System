package ATM;

import java.awt.EventQueue;

import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
public class ATm_Sys {

	private JFrame frame;
	private JTextField jlblDisplay;
	private JTextField jtxtEnter;
	private JTextField jtxtnumberofyears;
	private JTextField jtxtEnteloanamount;
	private JTextField jlblmonthlyPayment;
	private JTextField jlbltotalPayment;
	private JTextField jtxtReceipt;
	
	private JButton btnExit;
	private JButton btnReset;
	private JButton btnLoan;
	private JButton btnReceipt;
	
	private JButton jbtnLoan,jbtnBalance,jbtnWithdrawal,jbtnDeposit;
	private JButton jbtn1,jbtn2,jbtn3,jbtn4,jbtn5,jbtn6,jbtn7,jbtn8,jbtn9,jbtn0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATm_Sys window = new ATm_Sys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATm_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1450, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 89, 113, 119);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtnBalance = new JButton("->");
		jbtnBalance.setEnabled(false);
		jbtnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnBalance.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnBalance.setBounds(10, 22, 83, 39);
		panel.add(jbtnBalance);
		
		JButton jbtnWithdrawal = new JButton("->");
		jbtnWithdrawal.setEnabled(false);
		jbtnWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnWithdrawal.setBounds(10, 71, 83, 39);
		panel.add(jbtnWithdrawal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(133, 89, 227, 119);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel jlblBalance = new JLabel("Balance");
		jlblBalance.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblBalance.setBounds(10, 22, 67, 13);
		panel_1.add(jlblBalance);
		
		JLabel jlblWithdrawal = new JLabel("Withdrawl");
		jlblWithdrawal.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblWithdrawal.setBounds(10, 82, 82, 13);
		panel_1.add(jlblWithdrawal);
		
		JLabel jlblLoan = new JLabel("Loan");
		jlblLoan.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblLoan.setBounds(172, 22, 45, 13);
		panel_1.add(jlblLoan);
		
		JLabel jlblDeposit = new JLabel("Deposit");
		jlblDeposit.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblDeposit.setBounds(163, 75, 54, 27);
		panel_1.add(jlblDeposit);
		
		jlblDisplay = new JTextField();
		jlblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		jlblDisplay.setFont(new Font("Tahoma", Font.BOLD, 14));
		jlblDisplay.setBounds(10, 45, 207, 30);
		panel_1.add(jlblDisplay);
		jlblDisplay.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(370, 89, 103, 119);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton jbtnLoan = new JButton("<-");
		jbtnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit.setEnabled(true);
				btnReset.setEnabled(true);
				btnLoan.setEnabled(true);
				btnReceipt.setEnabled(true);
			}
		});
		jbtnLoan.setEnabled(false);
		jbtnLoan.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnLoan.setBounds(10, 24, 83, 39);
		panel_2.add(jbtnLoan);
		
		JButton jbtnDeposit = new JButton("<-");
		jbtnDeposit.setEnabled(false);
		jbtnDeposit.setFont(new Font("Tahoma", Font.BOLD, 36));
		jbtnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		jbtnDeposit.setBounds(10, 73, 83, 36);
		panel_2.add(jbtnDeposit);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(10, 218, 465, 347);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"1";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn1.setBounds(20, 29, 94, 53);
		panel_3.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"2";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn2.setBounds(124, 29, 94, 53);
		panel_3.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"3";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn3.setBounds(228, 29, 94, 53);
		panel_3.add(jbtn3);
		
		JButton jbtnCancel = new JButton("CANCEL");
		jbtnCancel.setForeground(new Color(0, 0, 0));
		jbtnCancel.setBackground(new Color(255, 0, 0));
		jbtnCancel.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtnCancel.setBounds(332, 29, 94, 53);
		panel_3.add(jbtnCancel);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"4";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn4.setBounds(20, 105, 94, 53);
		panel_3.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"5";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn5.setBounds(124, 105, 94, 53);
		panel_3.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"6";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn6.setBounds(228, 105, 94, 53);
		panel_3.add(jbtn6);
		
		JButton jbtnClear = new JButton("CLEAR");
		jbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jlblDisplay.setText("");
			}
		});
		jbtnClear.setBackground(new Color(255, 255, 0));
		jbtnClear.setForeground(new Color(0, 0, 0));
		jbtnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtnClear.setBounds(332, 105, 94, 53);
		panel_3.add(jbtnClear);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"7";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn7.setBounds(20, 180, 94, 53);
		panel_3.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"8";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn8.setBounds(124, 180, 94, 53);
		panel_3.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"9";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn9.setBounds(228, 180, 94, 53);
		panel_3.add(jbtn9);
		
		JButton jbtnEnter = new JButton("ENTER");
		jbtnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pin1=Integer.parseInt(jlblDisplay.getText());
				int pin2=Integer.parseInt(jlblDisplay.getText());
				int pin3=Integer.parseInt(jlblDisplay.getText());
				int pin4=Integer.parseInt(jlblDisplay.getText());

				if(pin1 == 1234){
				jbtnBalance.setEnabled(true);
				jbtnLoan.setEnabled(true);
				jbtnWithdrawal.setEnabled(true);
				jbtnDeposit.setEnabled(true);

				jlblLoan.setVisible(true);
				jlblBalance.setEnabled(true);
				jlblWithdrawal.setEnabled(true);
				jlblDeposit.setEnabled(true);
				}
				else if(pin2 == 2345) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);

					jlblLoan.setEnabled(true);
					jlblBalance.setEnabled(true);
					jlblWithdrawal.setEnabled(true);
					jlblDeposit.setEnabled(true);
				}
				else if(pin3 == 3456) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);

					jlblLoan.setEnabled(true);
					jlblBalance.setEnabled(true);
					jlblWithdrawal.setEnabled(true);
					jlblDeposit.setEnabled(true);
				}
				else if(pin4 == 4567) {
					jbtnBalance.setEnabled(true);
					jbtnLoan.setEnabled(true);
					jbtnWithdrawal.setEnabled(true);
					jbtnDeposit.setEnabled(true);

					jlblLoan.setEnabled(true);
					jlblBalance.setEnabled(true);
					jlblWithdrawal.setEnabled(true);
					jlblDeposit.setEnabled(true);
				}
				else {
					jlblDisplay.setText("Invalid Pin");
					jbtnBalance.setEnabled(false);
					jbtnLoan.setEnabled(false);
					jbtnWithdrawal.setEnabled(false);
					jbtnDeposit.setEnabled(false);

				}
				
			}
		});
		jbtnEnter.setBackground(new Color(0, 255, 0));
		jbtnEnter.setForeground(new Color(0, 0, 0));
		jbtnEnter.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtnEnter.setBounds(332, 180, 94, 53);
		panel_3.add(jbtnEnter);
		
		JButton btnNewButton_4_8 = new JButton("");
		btnNewButton_4_8.setBackground(new Color(255, 255, 255));
		btnNewButton_4_8.setBounds(20, 254, 94, 53);
		panel_3.add(btnNewButton_4_8);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = jlblDisplay.getText()+"0";
				jlblDisplay.setText(Enternumber);
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtn0.setBounds(124, 254, 94, 53);
		panel_3.add(jbtn0);
		
		JButton btnNewButton_4_10 = new JButton("");
		btnNewButton_4_10.setBackground(new Color(255, 255, 255));
		btnNewButton_4_10.setBounds(228, 254, 94, 53);
		panel_3.add(btnNewButton_4_10);
		
		JButton btnNewButton_4_11 = new JButton("");
		btnNewButton_4_11.setBackground(new Color(255, 255, 255));
		btnNewButton_4_11.setBounds(332, 254, 94, 53);
		panel_3.add(btnNewButton_4_11);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(483, 89, 865, 479);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Interest Rate");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(57, 34, 137, 45);
		panel_4.add(lblNewLabel_4);
		
		jtxtEnter = new JTextField();
		jtxtEnter.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtEnter.setBounds(204, 36, 125, 45);
		panel_4.add(jtxtEnter);
		jtxtEnter.setColumns(10);
		
		JLabel lblNewLabel_4_1 = new JLabel("Number of Years");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(57, 105, 137, 45);
		panel_4.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Amount of loan ");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_2.setBounds(57, 180, 137, 45);
		panel_4.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Monthly Payment");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_3.setBounds(57, 252, 137, 45);
		panel_4.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Total Payment");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4_4.setBounds(57, 332, 137, 45);
		panel_4.add(lblNewLabel_4_4);
		
		jtxtnumberofyears = new JTextField();
		jtxtnumberofyears.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtnumberofyears.setColumns(10);
		jtxtnumberofyears.setBounds(204, 107, 125, 45);
		panel_4.add(jtxtnumberofyears);
		
		jtxtEnteloanamount = new JTextField();
		jtxtEnteloanamount.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtEnteloanamount.setColumns(10);
		jtxtEnteloanamount.setBounds(204, 182, 125, 45);
		panel_4.add(jtxtEnteloanamount);
		
		jlblmonthlyPayment = new JTextField();
		jlblmonthlyPayment.setHorizontalAlignment(SwingConstants.CENTER);
		jlblmonthlyPayment.setColumns(10);
		jlblmonthlyPayment.setBounds(204, 254, 125, 45);
		panel_4.add(jlblmonthlyPayment);
		
		jlbltotalPayment = new JTextField();
		jlbltotalPayment.setHorizontalAlignment(SwingConstants.CENTER);
		jlbltotalPayment.setColumns(10);
		jlbltotalPayment.setBounds(204, 334, 125, 45);
		panel_4.add(jlbltotalPayment);
		
		JButton btnLoan = new JButton("Loan");
		btnLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double annualInterestRate = Double.parseDouble(jtxtEnter.getText());
				double monthlyInterestRate = annualInterestRate/1200;
				int numberOfYears = Integer.parseInt(jtxtnumberofyears.getText());
				double loanAmount = Double.parseDouble(jtxtEnteloanamount.getText());
				//--------------------------------------------------------------------
				double monthlyPayment = loanAmount * monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
				String imonthlyPayment;
				imonthlyPayment=Double.toString(monthlyPayment);
				imonthlyPayment=String.format("₹%.2f",monthlyPayment);
				jlblmonthlyPayment.setText(imonthlyPayment);
				//--------------------------------------------------------------------
				double totalPayment = monthlyPayment * numberOfYears * 12;
				String itotalPayment;
				itotalPayment=String.format("₹%.2f",totalPayment);
				jlbltotalPayment.setText(itotalPayment);
				
			}
		});
		btnLoan.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLoan.setBounds(57, 399, 148, 53);
		panel_4.add(btnLoan);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String annualInterestrate=String.format(jtxtEnter.getText());
				String numberOfyears=String.format(jtxtnumberofyears.getText());
				String loanAmount=String.format(jtxtEnteloanamount.getText());
				
				String monthlyPayment=String.format(jlblmonthlyPayment.getText());
				String totalPayment=String.format(jlbltotalPayment.getText());
				//====================================================================
				int refs=1325+(int)(Math.random()*4238);
				
				//====================================================================
				Calendar timer =Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat tDate=new SimpleDateFormat("dd-mmm-yyyy");
				tDate.format(timer.getTime());
				
				//====================================================================
				jtxtReceipt.setText("\tLoan Management Systems\n"+
						"Reference:\t\t\t" + refs+
						"\n==============================================\t" +
						"\nInterest rate:\t\t\t " + annualInterestrate +
						"\nRepayment years:\t\t " + numberOfyears +
						"\nAmount of Loan:\t\t\t "+ "₹"+ loanAmount +
						"\nMonthly payment:\t\t "+monthlyPayment+
						"\nTotal payment:\t\t\t "+totalPayment+
						
						"\n==============================================\t"+
						"\nDate: "+tDate.format(timer.getTime())+
						"\t\tTime:"+ tTime.format(timer.getTime())+
						"\n\n\t\tThank you\n");
				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReceipt.setBounds(253, 399, 148, 53);
		panel_4.add(btnReceipt);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtEnter.setText(null);
				jtxtnumberofyears.setText(null);
				jtxtEnteloanamount.setText(null);
				jlblmonthlyPayment.setText(null);
				jlbltotalPayment.setText(null);
				jtxtReceipt.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(461, 399, 148, 53);
		panel_4.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit",
				"ATM Systems",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
				{System.exit(0);}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(660, 399, 148, 53);
		panel_4.add(btnExit);
		
		jtxtReceipt = new JTextField();
		jtxtReceipt.setBounds(361, 34, 447, 343);
		panel_4.add(jtxtReceipt);
		jtxtReceipt.setColumns(10);
	}
}
