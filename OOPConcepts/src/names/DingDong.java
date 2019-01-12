package names;

public class DingDong {

	public static void main(String[] args) {
	for (int i =0; i <=50; i++) {
		if(i%3 ==0 && i%5 ==0) {
			System.out.println("Dingdong " + i);
		}else if(i %3 ==0) {
			System.out.println("Ding "+ i);
		}else if(i%5 ==0) {
			System.out.println("Dong " + i);
		}else {
			System.out.println(i);
		}
	}

}
}
