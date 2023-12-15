package util;

public class MyUtil {

	//편 - 안
	public static int getRandomInt(int start, int end) {
		if(start > end) {
			System.err.println("잘못된 범위입니다");
			return -1;
		}
		int range = end - start +1;
		return (int) (Math.random()*range + start);
	}
}
