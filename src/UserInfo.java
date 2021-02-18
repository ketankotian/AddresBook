
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

		System.out.println(firstName + " \t  " + lastName + " \t  " + address + " \t  " + state + " \t   " + phoneNumber
				+ " \t " + zip + "\t" + email);
	}

}
