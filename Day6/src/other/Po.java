package other;

public class Po {
	private int x, y;
	
	public Po(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPo() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	public Po addPo(Po p) {
		int x = this.x + p.x;
		int y = this.y + p.y;
		
		Po tmp = new Po(x, y);
		
		return tmp;
	}
}
