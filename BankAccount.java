public class BankAccount
{
	String name;
	Integer age;
	String gender;
	String bank;
	String cn;
	Integer cl;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public Integer getCl() {
		return cl;
	}
	public void setCl(Integer cl) {
		this.cl = cl;
	}
	public BankAccount(String name, Integer age, String gender, String bank, String cn, Integer cl) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.bank = bank;
		this.cn = cn;
		this.cl = cl;
	}

}
