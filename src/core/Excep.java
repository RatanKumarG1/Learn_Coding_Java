package core;

import java.io.File;
import java.io.IOException;

public class Excep {

	public void get() throws Exception{
		
	}
	
}

class Child extends Excep {
	public void get() throws IOException {
		File file = new File("");
	}
}
