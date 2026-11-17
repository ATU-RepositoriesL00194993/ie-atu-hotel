package ie.atu.hotel;

public class Employee extends Person implements Payable{
  private static int nextID = 1000;

  private Date dateOfBirth;
  private Date startDate;
  private double salary;
  private int ID;

  // Empty constructor
  public Employee() {
    super();
    this.dateOfBirth = new Date();
    this.startDate = new Date();
    this.salary = 0.0;

    this.ID = this.nextID++;
  }

  // Constructor with arguments
  public Employee(Name name, String phoneNumber, Date dateOfBirth, Date startDate, double salary) {
    super(name, phoneNumber);
    this.dateOfBirth = dateOfBirth;
    this.startDate = startDate; 
    this.salary = salary;
    
    this.ID = this.nextID++;
  }
  
  // Interface methods
  @Override
  public double calculatePay(double taxPercentage) {
	  double pay = this.salary/12;
	  return pay - (pay * (taxPercentage/100));
  }
  
  @Override
  public double incrementSalary(double incrementAmount) {
	  // Calculate new salary
	  double incremented = this.salary + incrementAmount;
	  // Check condition (new salary can not be greater then 150 000)
	  if (incremented<= 150000) { 
		  this.salary = incremented;
	  }
	  return this.salary;
  }
  
  // 
  public String toString() {
    return "employee id: " + this.ID + " " + super.toString() + " salary:" + this.salary + " DOB:" + dateOfBirth + " startDate:" + this.startDate;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Employee)) return false;

    Employee employee = (Employee) obj;

    return super.equals(employee) &&
      employee.getID() == this.ID &&
      employee.getDOB().equals(this.dateOfBirth) &&
      employee.getStartDate().equals(this.startDate) &&
      employee.getSalary() == this.salary;
  }

  // Getters and Setters
  public Date getDOB() {
    return this.dateOfBirth;
  }

  public void setDOB(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Date getStartDate() {
    return this.startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }
  
  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
  
  public int getID() {
	  return this.ID;
  }
}

