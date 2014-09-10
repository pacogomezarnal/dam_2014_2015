import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Eventos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eventos frame = new Eventos();
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
	public Eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Boton");		
		// registra los manejadores de eventos
		ManejadorEventosBoton manejador = new ManejadorEventosBoton();
		
		btnNewButton.setBounds(21, 24, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener( manejador );
		

	}
	
	// clase interna para manejar eventos de botón
	private class ManejadorEventosBoton implements ActionListener
	{
	// maneja evento de botón
		public void actionPerformed( ActionEvent evento )
		{
			JOptionPane.showMessageDialog( Eventos.this, String.format("Usted oprimio: %s", evento.getActionCommand() ) );
		}
	}
}
