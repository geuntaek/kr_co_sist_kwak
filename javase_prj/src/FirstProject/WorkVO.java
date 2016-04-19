package FirstProject;
/**
 * VO(Value Object) : 값을 저장하고 반환할 목적으로 만드는 객체.
 * 규칙 : 변수의 접근지정자는 private(default)로 한다!!!!!!
 * 		값을 설정하는 목적의 method인 setter(public void set변수명(매개변수)),
 * 		설정된 값을 반환하는 목적의 method인 getter(public 반환형 get변수명())
 * 
 * list의 인덱스 하나하나에 넣기위해서
 * @author user
 */
public class WorkVO {
	private String response;
	private String requestURL;
	private String requestBrowser;
	private String time;
	
	
	
	public WorkVO(String response, String requestURL, String requestBrowser, String time) {
		this.response = response;
		this.requestURL = requestURL;
		this.requestBrowser = requestBrowser;
		this.time = time;
	}//WorkVO
	
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
	public String getRequestBrowser() {
		return requestBrowser;
	}
	public void setRequestBrowser(String requestBrowser) {
		this.requestBrowser = requestBrowser;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "WorkVO [response=" + response + ", requestURL=" + requestURL + ", requestBrowser=" + requestBrowser
				+ ", time=" + time + "]";
	}

}//class
