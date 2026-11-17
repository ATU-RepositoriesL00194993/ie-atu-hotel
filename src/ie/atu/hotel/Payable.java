package ie.atu.hotel;

public abstract interface Payable {
	double calculatePay(double taxPercentage);
	double incrementSalary(double incrementAmount);
}
