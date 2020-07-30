package datadriven;

import java.io.IOException;

import org.testng.annotations.Test;

public class inheritedclass extends reusablecode{
	@Test
	public void userid() throws IOException {
		System.out.println("Displaying before executing url");
		Login();
		System.out.println("Displaying after executing url");
	}

}
