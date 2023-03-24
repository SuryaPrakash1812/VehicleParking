import java.util.ArrayList;

public class Cars {
	
	private String licNum;
	private String model;
	private String dname;
	private Object s;
	private String lics;
	public Cars(String licNum)
	{
		this.setLicNum(licNum);
		
		
	}

	public String getLicNum() {
		return licNum;
	}

	public void setLicNum(String licNum) {
		this.licNum = licNum;
	}

	public void display(ArrayList s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public void getDname()
	{
		this.dname=dname;
	}
	public String setDname(String dname)
	{
		return this.dname=dname;
	}
	

	public void delete(ArrayList s) 
	{
s.clear();
		
	}
	
	
}
	
	


