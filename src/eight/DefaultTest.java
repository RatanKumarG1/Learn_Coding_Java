package eight;

public interface DefaultTest {

	void check();
	
	default void show() {
		System.out.println("Showed");
	}
}
