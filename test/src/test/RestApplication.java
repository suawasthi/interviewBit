package test;

import java.io.IOException;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestApplication {

	public static void main(String[] args) throws IOException {
		
		CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
		HttpGet get = new HttpGet("https://httpbin.org/get");
		CloseableHttpResponse closeableHttpResponse = closeableHttpClient.execute(get);
		
		
		
		
	}

}
