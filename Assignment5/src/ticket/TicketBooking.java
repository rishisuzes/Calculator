package ticket;

class TicketBooking {
	private String stageEvent;
	private String customer;
	private Integer noofseats;
	
	TicketBooking(String stageEvent , String customer, Integer noofseats){
		this.stageEvent = stageEvent;
		this.customer = customer;
		this.noofseats = noofseats;
	}
	
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public Integer getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(Integer noofseats) {
		this.noofseats = noofseats;
	}
	
	public void makepayment(double amount) {
		System.out.printf("Amount %.1f paid in cash%n", amount);
	}
	
	public void makepayment(String walletNumber , double walletamount) {
		System.out.printf("Amount %.1f paid using wallet number %s%n", walletamount, walletNumber);
		
	}
	
	public void makepayment(String creditcard , String ccv, String  holdername, double cardamount) {
		 System.out.println("Holder name:" + holdername);
	        System.out.printf("Amount %.1f paid using %s card%n", cardamount);
	        System.out.println("CCV:" + ccv);
	        System.out.println("Amount in credit card"+ creditcard);
	}
	
	public void display() {
		System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noofseats);
	}
	
}
