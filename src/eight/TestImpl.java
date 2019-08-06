package eight;

public class TestImpl implements DefaultTest {

	@Override
	public void check() {
		System.out.println("Checked");
		DefaultTest.super.show();
	}

	public static void main(String[] args) {
		TestImpl ti = new TestImpl();
		ti.show();
		
	}
}
