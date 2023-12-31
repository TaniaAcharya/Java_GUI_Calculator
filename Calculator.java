import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btnX;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, ২০));
		lblNewLabel.setBounds(91, 10, 335, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 50, 416, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("R");
		btnR.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				double a = Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
				}
				catch(ArithmeticException arg0) {
					textField.setText("Error");
					
				}
			}
		});
		btnR.setBounds(10, 142, 77, 49);
		frame.getContentPane().add(btnR);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =1/ (Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnx.setBounds(10, 245, 77, 49);
		frame.getContentPane().add(btnx);
		
		JButton btnXY = new JButton("x^y");
		btnXY.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnXY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="X^Y";
				
				
			}
		});
		btnXY.setBounds(10, 298, 77, 49);
		frame.getContentPane().add(btnXY);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				   a=a*a*a;
					textField.setText("");
					textField.setText(textField.getText()+a);

			}
		});
		btnX_1.setBounds(10, 357, 77, 49);
		frame.getContentPane().add(btnX_1);
		
		btnX = new JButton("x^2");
		btnX.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = (Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setBounds(10, 412, 77, 49);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double a =(Double.parseDouble(textField.getText()));
				   double f=1;
				    while(a!=0)
				    {
				     f=f*a;
				     a--;
				    }
					textField.setText("");
					textField.setText(textField.getText()+f);

			}
		});
		btnN.setBounds(10, 471, 77, 49);
		frame.getContentPane().add(btnN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setFont(new Font("Verdana", Font.PLAIN, 21));
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setBounds(91, 470, 77, 49);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnEX = new JButton("e^x");
		btnEX.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnEX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);

			}
		});
		btnEX.setBounds(91, 142, 77, 49);
		frame.getContentPane().add(btnEX);
		
		JButton btnL = new JButton("ln");
		btnL.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double a = Math.log(Double.parseDouble(textField.getText()));
				
				
				textField.setText("");
				textField.setText(textField.getText()+a);
				}
				catch(ArithmeticException arg0)
				{
					textField.setText("Error");
				}

			}
		});
		btnL.setBounds(91, 192, 77, 49);
		frame.getContentPane().add(btnL);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
          first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="%";
			}
		});
		btnPercent.setBounds(91, 245, 77, 49);
		frame.getContentPane().add(btnPercent);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(91, 298, 77, 49);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(91, 357, 77, 49);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(91, 412, 77, 49);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(178, 471, 77, 49);
		frame.getContentPane().add(btn0);
		
		JButton btnS = new JButton("Sin");
		btnS.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnS.setBounds(178, 142, 77, 49);
		frame.getContentPane().add(btnS);
		
		JButton btnSH = new JButton("Sinh");
		btnSH.setFont(new Font("Verdana", Font.BOLD, 15));
		btnSH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSH.setBounds(178, 192, 77, 49);
		frame.getContentPane().add(btnSH);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setBounds(178, 245, 77, 49);
		frame.getContentPane().add(btnClear);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(178, 298, 77, 49);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(178, 357, 77, 49);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(178, 412, 77, 49);
		frame.getContentPane().add(btn2);
		
		JButton BtnC = new JButton("Cos");
		BtnC.setFont(new Font("Verdana", Font.PLAIN, 20));
		BtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		BtnC.setBounds(265, 142, 77, 49);
		frame.getContentPane().add(BtnC);
		
		JButton btnCH = new JButton("Cosh");
		btnCH.setFont(new Font("Verdana", Font.BOLD, 15));
		btnCH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCH.setBounds(265, 192, 77, 49);
		frame.getContentPane().add(btnCH);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setBounds(265, 245, 77, 49);
		frame.getContentPane().add(btnBackspace);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(265, 298, 77, 49);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(265, 357, 77, 49);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Verdana", Font.PLAIN, 20));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(265, 412, 77, 49);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Verdana", Font.PLAIN, 25));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			
			}
		});
		btnDot.setBounds(265, 471, 77, 49);
		frame.getContentPane().add(btnDot);
		
		JButton btnT = new JButton("Tan");
		btnT.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnT.setBounds(349, 142, 77, 49);
		frame.getContentPane().add(btnT);
		
		JButton btnTH = new JButton("Tanh");
		btnTH.setFont(new Font("Verdana", Font.BOLD, 15));
		btnTH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTH.setBounds(349, 192, 77, 49);
		frame.getContentPane().add(btnTH);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="+";
			}
		});
		btnAdd.setBounds(349, 245, 77, 49);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="-";
			}
		});
		btnSub.setBounds(349, 298, 77, 49);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setFont(new Font("Verdana", Font.PLAIN, 21));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="*";
			}
		});
		btnMul.setBounds(349, 357, 77, 49);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
first=Double.parseDouble(textField.getText());
				
				textField.setText("");
				
				
				operation="/";
			}
		});
		btnDivide.setBounds(352, 412, 77, 49);
		frame.getContentPane().add(btnDivide);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Verdana", Font.PLAIN, 22));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				try{
					if(operation=="+")
				
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{  try {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				catch(ArithmeticException arg0){
					textField.setText("error");
					
				}
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
						resultt=first*resultt;
						answer=String.format("%.2f", resultt);
						textField.setText(answer);
					}
				}
			}
			catch(ArithmeticException arg0)
			{
				textField.setText("error");
			}
			}
		});
		btnEqual.setBounds(352, 471, 77, 49);
		frame.getContentPane().add(btnEqual);
		
		JButton btnLog = new JButton("Log\r\n");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double a=Math.log10(Double.parseDouble(textField.getText()));
					textField.setText("");
					textField.setText(textField.getText()+a);
					}
				catch(ArithmeticException arg0) 
					{
					textField.setText("Error");
					}

			}
		});
		btnLog.setFont(new Font("Verdana", Font.PLAIN, 20));
		btnLog.setBounds(10, 192, 77, 49);
		frame.getContentPane().add(btnLog);
	}
}
