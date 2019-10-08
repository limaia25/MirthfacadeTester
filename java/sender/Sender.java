package sender;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Sender {

	public String getMensageHttp(String url) throws ClientProtocolException, IOException {
		String mensage = null;
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);

		HttpResponse response = client.execute(request);
		String content = EntityUtils.toString(response.getEntity());

		return content;
	}

	public String searchMensageHttp(String url, String msgJson) throws ClientProtocolException, IOException {
		String mensage = null;
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		String json = msgJson;
		StringEntity entity = new StringEntity(json);
		httpPost.setEntity(entity);
		httpPost.setHeader("Accept", "application/json");
	    httpPost.setHeader("Content-type", "application/json");
	 
	    CloseableHttpResponse response = client.execute(httpPost);
		String content = EntityUtils.toString(response.getEntity());

		return content;
	}

}
