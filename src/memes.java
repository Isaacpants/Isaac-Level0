import javax.swing.JOptionPane;

public class memes {
public static void main(String[] args) {
	String p="";
	for (int i = 1; i < 18; i++) {
		JOptionPane.showMessageDialog(null, p);
		p=p+"|";
		System.out.println(i);
		if(i%6==0) {
			p=p+"\n";
					
				
			
		}
	}



}
}