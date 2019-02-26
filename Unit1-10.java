
/**
Name: Tochi Iroakazi
Class: ICS4U
Definition: Prints out the names of planets in enum.
 */

public class planetenum {
	public static void main(String[] args) {
		for (Planets d: Planets.values() ) {
			System.out.println(d);
		}
	}
}
enum Planets{
	Mercury,
	Venus,
	Earth,
	Mars,
	Jupiter,
	Saturn,
	Uranus,
	Neptune
	
}
