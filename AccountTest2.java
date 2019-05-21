package Section1;
import static org.junit.Assert.*;

import org.junit.Test;
public class AccountTest2 {
	@Test public void instantiate() {
		Account a=new Account("Minato",300000);
		assertEquals("Minato",a.getOwner());
		assertEquals(300000,a.getBalance());
	}
}
