
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

		String signal = "blue";
		switch (signal) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄色信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
