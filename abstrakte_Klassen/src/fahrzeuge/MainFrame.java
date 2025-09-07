package fahrzeuge;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Locale;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class MainFrame extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//Instanziieren von Objekten für alle Unterklassen der abstrakten Klasse "Verkehrsmittel"
    Fahrrad fahrrad = new Fahrrad(15.0,1.00,2.0,1);
    Taxi taxi = new Taxi(17.96,20.00,3.0);
    CarSharing carSharing = new CarSharing(13.33,3.50,2.5);
    Bus bus = new Bus(29.94,2.55,1.0);
    
	private ArrayList<String> fahrzeuge;
	private ArrayList<Double> strecken;
	private ArrayList<Double> preise;
	private JLabel lblAnzFahrzeuge;
	private JTextField textFieldAnzFahrzeuge;
	private JLabel lblFz;
	private JLabel lblFz2;
	private JLabel lblFz3;
	private JLabel lblFz4;
	private JLabel lblStrecke;
	private JTextField tfStreckeFZ1;
	private JTextField tfStreckeFZ2;
	private JTextField tfStreckeFZ3;
	private JTextField tfStreckeFZ4;
	private JComboBox<String> coBoxFz1;
	private JComboBox<String> coBoxFz2;
	private JComboBox<String> coBoxFz3;
	private JComboBox<String> coBoxFz4;
	private JButton btnEingabe;
	private JTextArea textAreaAusgabe;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		//Punkt- statt Kommasetzung bei Fließkommazahlen (wie in der englischen Schreibweise)
        Locale.setDefault(Locale.ENGLISH);
        
        fahrzeuge = new ArrayList<>();
		fahrzeuge.add(fahrrad.getArt());
		fahrzeuge.add(taxi.getArt());
		fahrzeuge.add(carSharing.getArt());
		fahrzeuge.add(bus.getArt());
		
		strecken = new ArrayList<>();
		strecken.add(fahrrad.getStreckeInKm());
		strecken.add(taxi.getStreckeInKm());
		strecken.add(carSharing.getStreckeInKm());
		strecken.add(bus.getStreckeInKm());
		
		preise = new ArrayList<>();
		preise.add(fahrrad.getPreisProKm());
		preise.add(taxi.getPreisProKm());
		preise.add(carSharing.getPreisProKm());
		preise.add(bus.getPreisProKm());
		contentPane.setLayout(null);
		
		lblAnzFahrzeuge = new JLabel("Anzahl der Verkehrsmittel für die 7-Kilometer-lange Fahrt zum Hotel:");
		lblAnzFahrzeuge.setBounds(10, 11, 386, 25);
		lblAnzFahrzeuge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblAnzFahrzeuge);
		
		textFieldAnzFahrzeuge = new JTextField(String.valueOf(fahrzeuge.size()));
		textFieldAnzFahrzeuge.setBounds(388, 14, 47, 20);
		textFieldAnzFahrzeuge.setEditable(false);
		textFieldAnzFahrzeuge.setColumns(10);
		contentPane.add(textFieldAnzFahrzeuge);
		
		lblFz = new JLabel("Fahrzeug Nummer 1:");
		lblFz.setBounds(10, 47, 130, 14);
		lblFz.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblFz);
		
		lblFz2 = new JLabel("Fahrzeug Nummer 2:");
		lblFz2.setBounds(150, 47, 130, 14);
		lblFz2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblFz2);
		
		lblFz3 = new JLabel("Fahrzeug Nummer 3:");
		lblFz3.setBounds(290, 47, 130, 14);
		lblFz3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblFz3);
		
		lblFz4 = new JLabel("Fahrzeug Nummer 4:");
		lblFz4.setBounds(430, 47, 130, 14);
		lblFz4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblFz4);
		
		coBoxFz1 = new JComboBox<>();
		coBoxFz1.setBounds(10, 72, 130, 22);
		for(int i=0; i<fahrzeuge.size(); i++) {
			coBoxFz1.addItem(fahrzeuge.get(i));
		}
		coBoxFz1.setSelectedIndex(0);
		coBoxFz1.addActionListener(this);
		contentPane.add(coBoxFz1);
		
		coBoxFz2 = new JComboBox<>();
		coBoxFz2.setBounds(150, 72, 130, 22);
		for(int i=0; i<fahrzeuge.size(); i++) {
			coBoxFz2.addItem(fahrzeuge.get(i));
		}
		coBoxFz2.setSelectedIndex(1);
		coBoxFz2.addActionListener(this);
		contentPane.add(coBoxFz2);
		
		coBoxFz3 = new JComboBox<>();
		coBoxFz3.setBounds(290, 72, 130, 22);
		for(int i=0; i<fahrzeuge.size(); i++) {
			coBoxFz3.addItem(fahrzeuge.get(i));
		}
		coBoxFz3.setSelectedIndex(2);
		coBoxFz3.addActionListener(this);
		contentPane.add(coBoxFz3);
		
		coBoxFz4 = new JComboBox<>();
		coBoxFz4.setBounds(430, 72, 130, 22);
		for(int i=0; i<fahrzeuge.size(); i++) {
			coBoxFz4.addItem(fahrzeuge.get(i));
		}
		coBoxFz4.setSelectedIndex(3);
		coBoxFz4.addActionListener(this);
		contentPane.add(coBoxFz4);
		
		lblStrecke = new JLabel("Strecke in km:");
		lblStrecke.setBounds(250, 105, 96, 14);
		lblStrecke.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblStrecke);
		
		tfStreckeFZ1 = new JTextField(String.valueOf(strecken.getFirst()));
		tfStreckeFZ1.setBounds(10, 124, 130, 20);
		tfStreckeFZ1.setEditable(false);
		tfStreckeFZ1.setColumns(10);
		contentPane.add(tfStreckeFZ1);
		
		tfStreckeFZ2 = new JTextField(String.valueOf(strecken.get(1)));
		tfStreckeFZ2.setBounds(150, 124, 130, 20);
		tfStreckeFZ2.setEditable(false);
		tfStreckeFZ2.setColumns(10);
		contentPane.add(tfStreckeFZ2);
		
		tfStreckeFZ3 = new JTextField(String.valueOf(strecken.get(2)));
		tfStreckeFZ3.setBounds(290, 124, 130, 20);
		tfStreckeFZ3.setEditable(false);
		tfStreckeFZ3.setColumns(10);
		contentPane.add(tfStreckeFZ3);
		
		tfStreckeFZ4 = new JTextField(String.valueOf(strecken.getLast()));
		tfStreckeFZ4.setBounds(430, 124, 130, 20);
		tfStreckeFZ4.setEditable(false);
		tfStreckeFZ4.setColumns(10);
		contentPane.add(tfStreckeFZ4);
		
		btnEingabe = new JButton("Daten einfügen");
		btnEingabe.setBounds(10, 155, 130, 23);
		btnEingabe.addActionListener(this);
		contentPane.add(btnEingabe);
		
		textAreaAusgabe = new JTextArea();
		textAreaAusgabe.setBounds(10, 184, 667, 179);
		contentPane.add(textAreaAusgabe);
		
	}
	
	public void ausgabe() {
		 if((Double.parseDouble(tfStreckeFZ1.getText()) + Double.parseDouble(tfStreckeFZ2.getText())  + 
		            Double.parseDouble(tfStreckeFZ3.getText()) + Double.parseDouble(tfStreckeFZ4.getText()) == Verkehrsmittel.gesStrecke) &&
				 
		        	(coBoxFz1.getSelectedIndex() == 0 && coBoxFz2.getSelectedIndex() == 1 && coBoxFz3.getSelectedIndex() == 2 && 
		        	 coBoxFz4.getSelectedIndex() == 3)) {
			 
			 	ArrayList<String> data = new ArrayList<>();
				
				data.add("Hier ist Ihre Quittung\t\t\t\t"
		                +Verkehrsmittel.datum);
				data.add(String.format("%nDauer der heutigen Reise:\t\t\t\t%.0f Stunden%n",
						Verkehrsmittel.gesZeit));
				
				data.add("\t\t***Mallorcas ÖPNV***\n");
				data.add("Mittel\t\t\tGefahrene km\t\tPreis\n\n");
				

		        for(int i=0; i<fahrzeuge.size(); i++) {
		            String tabs1 = "\t\t\t";
		            String tabs2 = "\t\t ";

		            if(preise.get(i) >= 10.00) tabs2 = "\t\t";
		            else tabs2 = "\t\t ";
		            
		            data.add(String.format("%s%s%.1f km%s%.2f €%n", fahrzeuge.get(i), tabs1,
		                    strecken.get(i), tabs2, preise.get(i)));
		        }

		        data.add(String.format("Gesamt\t\t\t%.1f km\t\t%.2f €%n",
		                Verkehrsmittel.gesStrecke,
		                (fahrrad.preis+taxi.preis+carSharing.preis+bus.preis)));
		        
		        double wartezeit = Verkehrsmittel.gesZeit -
		                (fahrrad.getZeitInStunden()+taxi.getZeitInStunden()+
		                        carSharing.getZeitInStunden()+bus.getZeitInStunden());

		        data.add(String.format("Die Wartezeit lag bei %.3f Stunden.%n", wartezeit));
		        
		        for(String s: data) {
		        	textAreaAusgabe.setText(textAreaAusgabe.getText()+s);
		        }
		 }
		
        else JOptionPane.showMessageDialog(this, "Entweder stimmen nicht alle Fahrzeuge mit deren festgelegten Preisen überein oder\n"
        		+ "die Gesamtstrecke ist nicht genau 7 Kilometer lang!\n\nBitte füge alle Fahrzeuge sowie deren Streckenlängen richtig ein!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == coBoxFz1) {
			switch(coBoxFz1.getSelectedIndex()) {
				case 1:  tfStreckeFZ1.setText(String.valueOf(strecken.get(1))); break;
				case 2:  tfStreckeFZ1.setText(String.valueOf(strecken.get(2))); break;
				case 3:  tfStreckeFZ1.setText(String.valueOf(strecken.getLast())); break;
				default: tfStreckeFZ1.setText(String.valueOf(strecken.getFirst()));
			}
		}
		
		if(e.getSource() == coBoxFz2) {
			switch(coBoxFz2.getSelectedIndex()) {
				case 1:  tfStreckeFZ2.setText(String.valueOf(strecken.get(1))); break;
				case 2:  tfStreckeFZ2.setText(String.valueOf(strecken.get(2))); break;
				case 3:  tfStreckeFZ2.setText(String.valueOf(strecken.getLast())); break;
				default: tfStreckeFZ2.setText(String.valueOf(strecken.getFirst()));
			}
		}
		
		if(e.getSource() == coBoxFz3) {
			switch(coBoxFz3.getSelectedIndex()) {
				case 1:  tfStreckeFZ3.setText(String.valueOf(strecken.get(1))); break;
				case 2:  tfStreckeFZ3.setText(String.valueOf(strecken.get(2))); break;
				case 3:  tfStreckeFZ3.setText(String.valueOf(strecken.getLast())); break;
				default: tfStreckeFZ3.setText(String.valueOf(strecken.getFirst()));
			}
		}
		
		if(e.getSource() == coBoxFz4) {
			switch(coBoxFz4.getSelectedIndex()) {
				case 1:  tfStreckeFZ4.setText(String.valueOf(strecken.get(1))); break;
				case 2:  tfStreckeFZ4.setText(String.valueOf(strecken.get(2))); break;
				case 3:  tfStreckeFZ4.setText(String.valueOf(strecken.getLast())); break;
				default: tfStreckeFZ4.setText(String.valueOf(strecken.getFirst()));
			}
		}
		
		if(e.getSource() == btnEingabe) {  
            if(textAreaAusgabe.getText() != "") textAreaAusgabe.setText("");
            this.ausgabe();
		}
	}
	
}
