package UebAnnotationen;

public class TestUsage {
	@Test(expected=MyException.class)
	public void testeIrgendwas() {
		System.out.println("testeIrgendwas");
		throw new MyException();
	}
	
	@Test
	public void testeIrgendwas2() {
		System.out.println("testeIrgendwas2");
	}
	
	@Test(expected = NullPointerException.class)
	public void testeIrgendwas3() {
		System.out.println("testeIrgendwas3");
		throw new IllegalArgumentException();
	}
	
	public void testIrgendwas4() {
		System.out.println("testIrgendwas4");
	}

}
