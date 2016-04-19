package HomeWork;

public class VO {
	private String response;
	private String key;
	private String browser;
	private String time;
	
	public VO() {
	}

	@Override
	public String toString() {
		return "VO [response=" + response + ", key=" + key + ", browser=" + browser + ", time=" + time + "]";
	}

	public VO(String response, String key, String browser, String time) {
		super();
		this.response = response;
		this.key = key;
		this.browser = browser;
		this.time = time;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
}
