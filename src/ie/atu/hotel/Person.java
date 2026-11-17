package ie.atu.hotel;

import ie.atu.hotel.Name;

public abstract class Person {
  protected Name name;
  protected String phoneNumber;

  public Person() {
    this.name = new Name();
    this.phoneNumber = "";
  }

  public Person(Name name, String phoneNumber) {
    this.name = name;
    this.phoneNumber = phoneNumber;
  }

  public String toString() {
    return this.name + " phone number: " + this.phoneNumber;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Person)) return false;

    Person person = (Person) obj;

    return person.getName().equals(this.name) &&
      person.getPhoneNumber().equals(this.phoneNumber);
  }

  public Name getName() {
    return this.name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}

