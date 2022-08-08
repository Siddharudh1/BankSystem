class CustomerAccount implements Account{
	private static Double balance=0.0;
	private static String pin;
	private static String username;
	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		if(username.equals(null) || username.trim().equals(""))
			throw new IllegalArgumentException("Name should not be null or empty");
		CustomerAccount.username = username;
	}

	public static Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		if(balance<0)
			throw new IllegalArgumentException("Balance Cannot be less than 0");
		else
			this.balance = balance;
	}
	
	public CustomerAccount(String pin)  {
		super();
		
		if(pin.trim().equals(" ") || pin.equals(null) )
			throw new IllegalArgumentException("INVALID PIN");
		this.pin = pin;
	}

	public void setPin(String pin) throws IllegalArgumentException {
		if(pin.equals(null)|| pin.trim().equals(""))
			throw new IllegalArgumentException("Invalid Pin");
		else
			this.pin = pin;
	}
	public static String getPin() {
		return pin;
	}
	
	
	
	
	@Override
	public void addMoney(Double amount)  {
		if(amount<=0) {
			throw new IllegalArgumentException("amount should be greater than zero");
		}
		else {
			balance = balance + amount ;
			System.out.println("Amount Credited =  "+balance);	
		}
		
	}

	@Override
	public void withdrawMoney(Double amount)  {
		if(amount <0 || amount>balance) {
			throw new IllegalArgumentException("balance should not be less than or equal to zero");
		}
		else {
			balance = balance-amount;
			System.out.println("Amount "+amount+" withdraw successfully");
		}
		
	}
	@Override
	public void closeAccount() {
		this.balance=null;
		System.out.println("Account closed");
		System.out.println("**********EXIT************");
		System.exit(0);
	
		}
	}
	

