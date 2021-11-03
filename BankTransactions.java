public class BankTransactions implements Comparable<BankTransactions> {
    @Override
	public int compareTo(BankTransactions bt)
	{
		return this.getAmt().compareTo(bt.getAmt());
	}
	String cn;
	String td;
	Integer amt;
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	public String getTd() {
		return td;
	}
	public void setTd(String td) {
		this.td = td;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}
	public BankTransactions(String cn, String td, Integer amt) {

		this.cn = cn;
		this.td = td;
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "bankTransactions [cn=" + cn + ", td=" + td + ", amt=" + amt + "]";
	}

}
