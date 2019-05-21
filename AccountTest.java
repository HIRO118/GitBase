package Section1;

public class AccountTest {

	public static void main(String[] args) {
		testInstantiate() ;
	}
	
	private static void testInstantiate() {
		System.out.println("無事newできるかテスト");
		Account a=new Account("Mintato",30000);
		if(!"Minato".equals(a.getOwner())) {
			System.out.println("ownerが違う");
		}
		if(30000!=a.getBalance()) {
			System.out.println("balanceが違う");
		}
	}
}
