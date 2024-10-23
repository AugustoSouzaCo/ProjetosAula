
public class Incremento {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		if (++a > b++ || a-- > 0) {
			c++;
		} else 
			c--;
		System.out.println(a + " " + b + " " + c);
	}
}
