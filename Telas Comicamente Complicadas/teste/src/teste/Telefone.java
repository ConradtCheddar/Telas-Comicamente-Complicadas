package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.PrintStream;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Telefone extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telefone frame = new Telefone();
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
	public Telefone() {
		setTitle("Phone selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox postalBox = new JComboBox();
		postalBox.setBounds(56, 84, 71, 22);
		contentPane.add(postalBox);
		for (int i = 0 ; i <= 999 ; i++) {
			if (i <10) {
				String C = ("+00"+i);
				postalBox.addItem(C);
			}else if (i < 100 && i>=10) {
				String C = ("+0"+i);
				postalBox.addItem(C);
			}else {
				String C = ("+"+i);
				postalBox.addItem(C);
			}
		}
		
		JComboBox DDDbox = new JComboBox();
		DDDbox.setBounds(137, 84, 61, 22);
		contentPane.add(DDDbox);
		for (int i = 0 ; i <= 99 ; i++) {
			if (i <10) {
				String C = ("(0"+i+")");
				DDDbox.addItem(C);
			}else {
				String C = ("("+i+")");
				DDDbox.addItem(C);
			}
		}
		
		JComboBox firstNumBox = new JComboBox();
		firstNumBox.setBounds(203, 84, 83, 22);
		contentPane.add(firstNumBox);
		for (int i = 0 ; i <= 9999 ; i++) {
			if (i <10) {
				String C = ("000"+i);
				firstNumBox.addItem(C);
			}else if (i<100 && i>=10){
				String C = ("00"+i);
				firstNumBox.addItem(C);
			}else if (i<1000 && i>=100){
				String C = ("0"+i);
				firstNumBox.addItem(C);
			}else {
				String C = (""+i);
				firstNumBox.addItem(C);
			}
		}
		
		
		JComboBox secondNumBox = new JComboBox();
		secondNumBox.setBounds(306, 84, 83, 22);
		contentPane.add(secondNumBox);
		for (int i = 0 ; i <= 9999 ; i++) {
			if (i <10) {
				String C = ("000"+i);
				secondNumBox.addItem(C);
			}else if (i<100 && i>=10){
				String C = ("00"+i);
				secondNumBox.addItem(C);
			}else if (i<1000 && i>=100){
				String C = ("0"+i);
				secondNumBox.addItem(C);
			}else {
				String C = (""+i);
				secondNumBox.addItem(C);
			}
		}
		
		JButton Confirmar = new JButton("Confirmar");
		Confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String postal = (String) postalBox.getSelectedItem();
				String DDD = (String) DDDbox.getSelectedItem();
				String firstNum = (String) firstNumBox.getSelectedItem();
				String secondNum = (String) secondNumBox.getSelectedItem();
				String message = ("seu numero de telefone, "+postal+" "+DDD+" "+firstNum+"-"+secondNum+", foi cadastrado");
		        JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		Confirmar.setBounds(25, 197, 165, 53);
		contentPane.add(Confirmar);
		
		
		
		JLabel postalText = new JLabel("+00");
		postalText.setHorizontalAlignment(SwingConstants.CENTER);
		postalText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		postalText.setBounds(56, 11, 71, 56);
		contentPane.add(postalText);
		
		JLabel DDDtext = new JLabel("(00)");
		DDDtext.setHorizontalAlignment(SwingConstants.CENTER);
		DDDtext.setFont(new Font("Tahoma", Font.PLAIN, 30));
		DDDtext.setBounds(137, 11, 61, 56);
		contentPane.add(DDDtext);
		
		JLabel firstNumText = new JLabel("0000");
		firstNumText.setHorizontalAlignment(SwingConstants.CENTER);
		firstNumText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		firstNumText.setBounds(208, 11, 78, 56);
		contentPane.add(firstNumText);
		
		JLabel secondNumText = new JLabel("0000");
		secondNumText.setHorizontalAlignment(SwingConstants.CENTER);
		secondNumText.setFont(new Font("Tahoma", Font.PLAIN, 30));
		secondNumText.setBounds(306, 11, 83, 56);
		contentPane.add(secondNumText);
		
		JLabel Traco = new JLabel("-");
		Traco.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Traco.setHorizontalAlignment(SwingConstants.CENTER);
		Traco.setBounds(289, 22, 23, 34);
		contentPane.add(Traco);
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select select = new Select();
				select.setVisible(true);
				dispose();
			}
		});
		voltarButton.setBounds(289, 212, 89, 23);
		contentPane.add(voltarButton);
	}
}
