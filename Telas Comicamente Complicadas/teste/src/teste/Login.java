package teste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nomeText;
	public String nome;
	public String senha;
	private JPasswordField senhaText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	
	public Login() {
		setTitle("Usuario");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeLabel = new JLabel("Nome Usuario");
		nomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomeLabel.setBounds(59, 11, 171, 36);
		contentPane.add(nomeLabel);
		
		JLabel senhaLabel = new JLabel("Senha");
		senhaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		senhaLabel.setBounds(59, 105, 171, 36);
		contentPane.add(senhaLabel);
		
		nomeText = new JTextField();
		nomeText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomeText.setBounds(59, 58, 171, 36);
		contentPane.add(nomeText);
		nomeText.setColumns(10);
		
		senhaText = new JPasswordField();
		senhaText.setFont(new Font("Tahoma", Font.PLAIN, 15));
		senhaText.setEchoChar('*');
		senhaText.setBounds(59, 152, 171, 36);
		contentPane.add(senhaText);
		
		JButton botaoLogin = new JButton("Login");
		botaoLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String nomeDigitado = nomeText.getText();
		        String senhaDigitada = new String(senhaText.getPassword());

		        if (nomeDigitado.isEmpty() || senhaDigitada.isEmpty()) {
		            String message = String.format("Senha ou login não preenchido(s)");
		            JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
		        } else if (nomeDigitado.equals(nome) && senhaDigitada.equals(senha)) {
		            Select select = new Select();
		            String message = String.format("Login bem sucedido");
		            dispose();
		            JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
		            select.setVisible(true);
		        } else {
		            String message = String.format("Senha ou login incorretos");
		            JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		botaoLogin.setBounds(10, 264, 124, 36);
		contentPane.add(botaoLogin);
		
		JButton botaoCadastro = new JButton("Cadastro");
		botaoCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String nomeDigitado = nomeText.getText();
		        String senhaDigitada = new String(senhaText.getPassword());

		        if (nomeDigitado.isEmpty() || senhaDigitada.isEmpty()) {
		            String message = String.format("Senha ou login não preenchido(s)");
		            JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            nome = nomeDigitado;
		            senha = senhaDigitada;
		            System.out.println(nome);
		            System.out.println(senha);
		            String message = String.format("Cadastro bem sucedido");
		            JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
		        }
		    }
		});
		botaoCadastro.setBounds(151, 264, 124, 36);
		contentPane.add(botaoCadastro);
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menu = new Menu();
				menu.setVisible(true);
				dispose();
			}
		});
		voltarButton.setBounds(98, 328, 89, 23);
		contentPane.add(voltarButton);
	}
}
