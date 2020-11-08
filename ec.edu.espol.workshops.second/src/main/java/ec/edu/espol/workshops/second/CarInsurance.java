package ec.edu.espol.workshops.second;

public class CarInsurance {
	protected int age;
	protected String sex;
	protected Boolean marital_status;
	protected Boolean license;
	static final int basePremium = 500;
	
	public Boolean getLicense(){ return license; }

	public void setLicense(Boolean license){ this.license = license; }

	public CarInsurance(){}
	
	public int getAge(){ return age; }

	public void setAge(int age){ this.age = age; }

	public String getSex(){ return sex; }

	public void setSex(String sex){ this.sex = sex; }

	public Boolean getMarital_status(){ return marital_status; }
	public void setMarital_status(Boolean marital_status){ this.marital_status = marital_status; }
	public int getbasePremium(){ return basePremium; }	
}	
