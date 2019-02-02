package dep.violation;

public class TaxCalculator {
	private LogType log;
	
	public TaxCalculator(LogType log) {
		this.log=log;
	}
	
	public void calculateTax(int amount,int rate) {
		try {
			rate=amount/rate;
			System.out.println(rate);
		}
		catch(Exception e){
			String ms=e.getMessage();
			if(this.log==LogType.DB) {
				new DbLogger().log("Please Login DB");
			}
			else {
				new XMLogger().log("Please add to XML");
			}
		}
	}

}
