package ec.edu.espol.workshops.second;

public class CarInsurance {
	
	protected int age;
	protected String sex;
	protected Boolean marital_status;
	
	final int BASE_PREMIUN = 500;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Boolean getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(Boolean marital_status) {
		this.marital_status = marital_status;
	}

	public int getBASE_PREMIUN() {
		return BASE_PREMIUN;
	}
	
	

}
