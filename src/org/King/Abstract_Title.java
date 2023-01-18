package org.King;

public class Abstract_Title implements Abstract_Bank {

	@Override
	public void pLoan () {
		System.out.println("Persoan Loan is 12%");
	}

	@Override
	public void hLoan() {
		System.out.println("Home Loan is 7%");
	}

	@Override
	public void eLoan() {
		System.out.println("Education Loan is 10%");
	}

	public static void main(String[] args) {
		Abstract_Title f = new Abstract_Title ();
		f.pLoan();
		f.hLoan();
		f.eLoan();
	}
}
