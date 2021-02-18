
public class UserInfo {
	String firstName;
	String lastName;
	String address;
	String phoneNumber;
	String state;
	String zip;
	String email;

	UserInfo(String firstName, String lastName, String address, String phoneNumber, String state, String zip,
			String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.zip = zip;
		this.email = email;

	}

	public void print() {

		System.out.println("First Name : "+this.firstName + "   Last Name : " + this.lastName + "\nAddress :  " + this.address + "   State : " + this.state+"   Zip Code : "+this.zip + "\nPhone Number : "+  this.phoneNumber
				 + "   Email Id : " + email);
	}

}
