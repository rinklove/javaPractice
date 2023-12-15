package practice;

/**
 * 배열
 * 변수타입[] 변수명 = new 변수타입[크기];
 */
public class ArrayTest {

	/*
	 * 타입이 같은 변수 여러개를 한번에 만들어줌
	 * 주의사항: 
	 * 배열의 길이는 가변적이지 않음.
	 * (배열의 크기를 지정하면 바꿀 수 없음)
	 *  사용 전에 크기 할당
	 *  인덱스는 0부터
	 *  
	 *  다차원 배열
	 *  int[][] arr = new int[3][3];
	 */
	
	public void test() {
		
		//배열 생성 후 각 인덱스에 할당
		int[] x = new int[3];
		//0번 인덱스에 값할당
		x[0]= 10;
		System.out.println(x[0]);
	}
}
