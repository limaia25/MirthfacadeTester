package sender;

import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

public class SenderTest {

	@Test
	public void testPatient() throws ClientProtocolException, IOException {
		Sender s = new Sender();
		String mensageReceived = s.getMensageHttp("localhost:234");
		String mensageToHave = "nome";
		
		
	}

}
