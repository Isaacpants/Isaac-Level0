import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are u");
		int  b =Integer.parseInt(age);		
		if (b>18) {
		JOptionPane.showInputDialog("Who do u thing is going to be next president");	
			
		}else {
			JOptionPane.showMessageDialog(null, "Not old enough");	
		}
	}
	
	
	
	
	
	
}