package interaction;

// 상호작용: 객체 간의 관계를 표현
// ex)사람 <-> 자동차: 사람이 자동차에 탑승해서 운전

class Unit {
	String job;
	int hp, atk;
	
	Unit(String job, int hp, int atk) {
		this.job = job;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showInfo() {
		String result = "%s (hp %d, atk %d)\n";
		System.out.printf(result, job, hp, atk);
	}
	
	void attack(Unit tar) { // void attack(Unt this, Unit tar)
							//즉, this=war, tar=wiz
		
		tar.hp -= atk;		//tar.hp -= this.atk;
		
		System.out.printf("\n%s(이)가 %s(을)를 공격!\n", job, tar.job);
		
		showInfo();
		tar.showInfo();
	}
}
public class Ex01 {
	public static void main(String[] args) {
		
		Unit war = new Unit("천사", 100, 10);
		Unit wiz = new Unit("마법사", 70, 15);
		
		war.showInfo();
		wiz.showInfo();
	}
}
