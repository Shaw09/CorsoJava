package it.corso.java.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import it.corso.java.Utils;

public class GetSitePage extends Thread {
	private String url;
	private String content;
	
	public GetSitePage(String url) {
		super();
		this.url = url;
	}
	
	@Override
	public void run() {
		try {
			@SuppressWarnings("deprecation")
			URL u = new URL(url);
			
			URLConnection con = u.openConnection();
			
			InputStream is = con.getInputStream();
				
			setContent(Utils.getString(is));
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

}
