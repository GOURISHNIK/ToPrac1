package ppack;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class test2 {
	//9:37pm
	@Test
	public String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		System.out.println(currentDate);
		return currentDate;
	}

}
