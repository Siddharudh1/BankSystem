class ATM {
	private String username ,pin;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void viewBalance(String username,String pin)  {
		if(username == null || username.trim().equals(" ") || pin.trim().equals(" ") || pin == null) {
			throw new IllegalArgumentException("usename should not bu null and empty and pin shouls not be null or empty");
		}
		
		else if(pin.equals(CustomerAccount.getPin()) && username.equals(CustomerAccount.getUsername())) {
				System.out.println("Balnace amount of Username : "+username+" and Pin : "+pin+" is Rs:"+CustomerAccount.getBalance());
		}
		else throw new IllegalArgumentException("PIN  Or USERNAME Mismatch");
	}
	
	public void withdrawMoney(String username,String pin,Double amount){
		if(username == null || username.trim().equals(" ") || pin.trim().equals(" ") || pin == null) {
			throw new IllegalArgumentException("username should not bu null and empty and pin shouls not be null or empty");
		}
		else {
			if(pin.equals(CustomerAccount.getPin()) && username.equals(CustomerAccount.getUsername())) 
				System.out.println("Money withdraw from Username :"+username+" and Pin :"+pin+" is "+amount);
			else throw new IllegalArgumentException("PIN  Or USERNAME Mismatch");
		}
	}
	
}

