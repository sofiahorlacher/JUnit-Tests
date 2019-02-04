import javax.swing.JOptionPane;

public class Berechnen {

	public Double kreisberechnen() {
		double radius = 5;
		String einheit = "cm";
		double umfang = 2.0 * Math.PI * radius;
		double flaeche = Math.PI * (radius * radius);
		JOptionPane.showMessageDialog(null, "Umfang: " + umfang + " " + einheit + "\nFläche: " + flaeche + " " + einheit + '\u00b2');
		return umfang; 
	}
}
