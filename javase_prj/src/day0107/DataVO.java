package day0107;

public class DataVO {
	
	private String name;
	private int java;
	private int oracle;
	private int jsp;
	private int total;
	private double avg;
	
	public DataVO(String name, int java, int oracle, int jsp, int total, double avg) {
		super();
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.jsp = jsp;
		this.total = total;
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getOracle() {
		return oracle;
	}
	public void setOracle(int oracle) {
		this.oracle = oracle;
	}
	public int getJsp() {
		return jsp;
	}
	public void setJsp(int jsp) {
		this.jsp = jsp;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
