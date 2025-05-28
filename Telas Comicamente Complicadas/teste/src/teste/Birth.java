package teste;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.event.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Birth extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Birth frame = new Birth();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Birth() {
		setResizable(false);
		setTitle("Birthday selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		LocalDate startDate = LocalDate.of(0, 1, 1);
		LocalDate endDate = LocalDate.of(10000, 12, 31);
		long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JSlider slider = new JSlider(0, (int) daysBetween);
		slider.setMinorTickSpacing(1);
		slider.setBounds(10, 87, 414, 50);
		contentPane.add(slider);

		JLabel dateLabel = new JLabel();
		dateLabel.setBounds(10, 150, 414, 30);
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(dateLabel);
		slider.setValue(0);
		dateLabel.setText("Data selecionada: " + startDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int value = slider.getValue();
				LocalDate selectedDate = startDate.plusDays(value);
				dateLabel.setText("Data selecionada: " + selectedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			}
		});

		JLabel lblNewLabel = new JLabel("Selecione sua data de nascimento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 414, 51);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = slider.getValue();
		        LocalDate selectedDate = startDate.plusDays(value);
		        LocalDate today = LocalDate.now();
		        Period period = Period.between(selectedDate, today);
		        String message = String.format("Sua Idade, %d anos, %d meses e %d dias, foi cadastrado",(period.getYears()), Math.abs(period.getMonths()), Math.abs(period.getDays()));
		        JOptionPane.showMessageDialog(null, message, null, JOptionPane.INFORMATION_MESSAGE);
			}
		});

		btnNewButton.setBounds(32, 212, 144, 38);
		contentPane.add(btnNewButton);
		
		JButton voltarButton = new JButton("Voltar");
		voltarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Select select = new Select();
				select.setVisible(true);
				dispose();
			}
		});
		voltarButton.setBounds(299, 224, 89, 23);
		contentPane.add(voltarButton);
	}
}