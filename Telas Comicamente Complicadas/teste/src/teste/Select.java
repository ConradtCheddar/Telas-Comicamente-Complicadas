package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Select extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Select frame = new Select();
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
	public Select() {
		setTitle("Selecionador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton birthButton = new JButton("Data de nascimento");
		birthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Birth birth = new Birth();
				birth.setVisible(true);
				dispose();
			}
		});
		birthButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		birthButton.setBounds(37, 11, 321, 90);
		contentPane.add(birthButton);
		
		JButton volumeButton = new JButton("Volume");
		volumeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Volume volume = new Volume();
				volume.setVisible(true);
				dispose();
			}
		});
		volumeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		volumeButton.setBounds(37, 112, 321, 90);
		contentPane.add(volumeButton);
		
		JButton phoneButton = new JButton("Telefone");
		phoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Telefone telefone = new Telefone();
				telefone.setVisible(true);
				dispose();
			}
		});
		phoneButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phoneButton.setBounds(37, 213, 321, 90);
		contentPane.add(phoneButton);
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		voltarButton.setBounds(153, 327, 89, 23);
		contentPane.add(voltarButton);
	}

}
