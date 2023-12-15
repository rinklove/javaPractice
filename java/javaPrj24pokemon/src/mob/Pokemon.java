package mob;

import main.Main;

public class Pokemon {
	
	public String name;
	public int atk;
	public int def;
	public int hp;
	public int fullHp;
	public int exp=0; 	//경험치 변수 추가 
	public int level =1;
	public int targetExp = 50*level;
	
	public Pokemon() {}
	
	public Pokemon(Pokemon p) {
		this.name =p.name;
		this.atk = p.atk;
		this.def = p.def;
		this.hp = p.hp;
		this.fullHp = p.fullHp;
	}
	
	public Pokemon bodyAttack(Pokemon defender) {
		System.out.println("-------------------------------------");
		System.out.println(name + "의 몸통박치기~~~!");
		int damage = (int) (Math.random()* (this.atk*0.4) + (this.atk*0.7)) - defender.def;	//데미지 계산 -> 데미지 일정 범위 내에서 랜덤 발생으로  변경
		System.out.println(this.name+"의 데미지 : " + damage);
		defender.hp -= damage;	//데미지 적용
		System.out.println(defender.name +" 의 남은 체력 : " + defender.hp);
		System.out.println(this.name +" 의 남은 체력 : " + this.hp);
		
		//죽었는지 판단. 죽었으면 승자 리턴.
		if(defender.hp <= 0) {
			this.getExp(30);
			defender.getExp(20);
			return this;
		} else {
			return null;
		}
	}
	
	
	public void showStatus() {
		System.out.println(this.name+"의 레벨: " + this.level);
		System.out.println(this.name+"의 공격력: " + this.atk);
		System.out.println(this.name+"의 방어력: " + this.def);
		System.out.println(this.name+"의 최대 체력: " + this.fullHp);
	}
	
	public void getExp(int exp) {
		this.exp +=exp;

		if(this.exp > this.targetExp) {
			this.exp -= targetExp;
			level++;
			this.targetExp += 20*level;
			getStats();
		}
		System.out.println(this.name + "의 경험치: " + this.exp +" / " + this.targetExp);
	}
	public void getStats() {
		System.out.println("스탯포인트 1 얻으셨습니다");
		System.out.println("공격력, 체력, 방어력 중에 올릴 스탯을 선택해주세요");
		System.out.println("1, 공격력, 2, 방어력, 3 체력");
		if(this.equals(Main.enemyPokemon)) {
			increaseStats((int)(Math.random() * 3 +1));
		} else {
			int stats = Main.sc.nextInt();
			increaseStats(stats);			
		}
	}
	
	
	public void increaseStats(int num) {
		showStatus();
	
		switch(num) {
		case 1: this.atk += 5; break;
		case 2: this.def += 5; break;
		case 3: this.fullHp += 10; break;
		default: System.out.println("잘못입력하셨습니다."); break;
		}
		System.out.println("---------------------------------------");
		showStatus();
	}
}