package ie.atu.hotel;

public class PaymentCard {
  private long number;
  private Date expiryDate;
  private int securityCode;

  public PaymentCard(long number, Date expiryDate, int securityCode) {
    this.number = number;
    this.expiryDate = expiryDate;
    this.securityCode = securityCode;
  }

  public String toString() {
    return "Card: " + this.number;
  }

  public boolean equals(PaymentCard other) {
    return other.getNumber() == this.number &&
      other.getExpiryDate().equals(this.expiryDate) &&
      other.getSecurityCode() == this.securityCode;
  }

  public long getNumber() {
    return this.number;
  }

  public Date getExpiryDate() {
    return this.expiryDate;
  }

  public int getSecurityCode() {
    return this.securityCode;
  }

}
