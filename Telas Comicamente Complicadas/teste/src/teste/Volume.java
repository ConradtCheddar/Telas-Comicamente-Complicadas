package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Volume extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Xtext;
	int X;
	int Y;
	String Ynum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Volume frame = new Volume();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Volume() {
		
		setTitle("Volume Selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel funcaoLabel = new JLabel("V(x) = 90 - 3 * X");
		funcaoLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		funcaoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		funcaoLabel.setBounds(10, 35, 414, 77);
		contentPane.add(funcaoLabel);
		
		Xtext = new JTextField();
		Xtext.setBounds(323, 162, 40, 34);
		contentPane.add(Xtext);
		Xtext.setColumns(10);
		
		JLabel XLabel = new JLabel("X =");
		XLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		XLabel.setBounds(289, 162, 40, 30);
		contentPane.add(XLabel);
		
		
		JButton confirmaBotao = new JButton("Confirmar");
		confirmaBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Xtext.equals(null)) {
					Ynum = "Y";
				}else {
					String Xnum = Xtext.getText();
					X = Integer.parseInt(Xnum);
					Y = 90 - 3*X;
					System.out.println(X);
					System.out.println(Y);
					String message = ("seu volume, "+Y+", foi setado");
			        JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
					
				}
				
				
				
			}
		});
		confirmaBotao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		confirmaBotao.setBounds(46, 162, 118, 30);
		contentPane.add(confirmaBotao);
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select select = new Select();
				select.setVisible(true);
				dispose();
			}
		});
		voltarButton.setBounds(171, 227, 89, 23);
		contentPane.add(voltarButton);
		
		
	
			
		}
		
}

