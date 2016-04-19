package kr.co.sist.project1;

/**
 * VO(Value Object) : ���� �����ϰ� ��ȯ�� �������� ����� ��ü.
 * ��Ģ : ������ ���������ڴ� private(default)�� �Ѵ�!!!!!!
 * 		���� �����ϴ� ������ method�� setter(public void set������(�Ű�����)),
 * 		������ ���� ��ȯ�ϴ� ������ method�� getter(public ��ȯ�� get������())
 * @author user
 */
public class WorkVO {
	private String response; // ������
	private String requestURL; // ��û url
	private String requestBrowser; // ��û ������
	private String time; // �ð�
	
	
	
	public WorkVO(String response, String requestURL, String requestBrowser, String time) {
		this.response = response;
		this.requestURL = requestURL;
		this.requestBrowser = requestBrowser;
		this.time = time;
	}
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
	
}
