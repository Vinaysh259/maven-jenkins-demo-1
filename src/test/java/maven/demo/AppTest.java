package maven.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		App app = new App();
		String message = app.Sample();
//		String str1 = "Success";
		assertEquals("sample",message);
	}

}
