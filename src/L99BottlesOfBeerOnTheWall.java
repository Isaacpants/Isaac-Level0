
public class L99BottlesOfBeerOnTheWall {
	public static void main(String[] args) {

		// print out 99 bottles of beer on the wall and so on down to 1 bottle of beer
		// on the wall
		for (int i = 99; i > 0; i--) {

			System.out.println(
					i + " bottles of beer on the wall " + i + " bottles of beer, take one down pass it around");
		}
	}
}