package day_2.com.atm;
/*
 * Desp: deposit() is implemented here
 */

public abstract class BankImp1 implements IBank {

	@Override
	public void deposit() {

		System.out.println("Deposit success..");

	}

	public abstract void withdraw();

}
