
public class Chapter07 {
	public static void main(String[] args) {
		int dist = 12;
		if (dist <= 5) {
			System.out.println("とても近いです");
		} else if (dist <= 10) {
			System.out.println("近いです");
		} else if (dist <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
	}
}
