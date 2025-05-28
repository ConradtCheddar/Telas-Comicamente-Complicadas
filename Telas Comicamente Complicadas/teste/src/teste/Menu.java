package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Telas Comicamente Complicadas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel text1 = new JLabel("Telas Comicamente");
		text1.setHorizontalAlignment(SwingConstants.CENTER);
		text1.setToolTipText("");
		text1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text1.setBounds(10, 11, 414, 55);
		contentPane.add(text1);
		
		JLabel text2 = new JLabel(" Complicadas");
		text2.setToolTipText("");
		text2.setHorizontalAlignment(SwingConstants.CENTER);
		text2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		text2.setBounds(10, 64, 414, 55);
		contentPane.add(text2);
		
		JButton entrarButton = new JButton("Entrar");
		entrarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.setVisible(true);
				dispose();
			}
		});
		entrarButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		entrarButton.setBounds(160, 181, 121, 49);
		contentPane.add(entrarButton);
		
		JButton sairButton = new JButton("Sair");
		sairButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		sairButton.setBounds(10, 227, 89, 23);
		contentPane.add(sairButton);
	}
}
