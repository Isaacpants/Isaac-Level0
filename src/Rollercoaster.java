import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are u");
	
	int  b =Integer.parseInt(height);
	
	if (b>48) {
	JOptionPane.showMessageDialog(null, "u may ride");	
		
	}else {
		JOptionPane.showMessageDialog(null, "Not tall enough");	
	}
}
	
	
		

}