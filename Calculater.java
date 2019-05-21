package Section1;

public class Calculater {

	public static void main(String[] args) {
		System.out.println("アサーションにわざと失敗");
		assert 1==0;
		System.out.println("正常終了");
	}
}
