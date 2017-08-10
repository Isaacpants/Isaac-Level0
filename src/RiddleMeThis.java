import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("What gets wetter and wetter the more it dries?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals("A Towel")){
JOptionPane.showMessageDialog(null, "Correct");	
score++;
}else{
	JOptionPane.showMessageDialog(null, "Wrong A Towel ");

}


		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String question = JOptionPane.showInputDialog("What can travel around the world while staying in a corner? ");
if(question.equals("A Stamp")){
JOptionPane.showMessageDialog(null, "Correct");	
score++;
}else{
	JOptionPane.showMessageDialog(null, "Wrong A Stamp ");

}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}




