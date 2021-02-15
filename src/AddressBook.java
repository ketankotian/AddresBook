
public class AddressBook {

	private final String firstName;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final String zip;
	private final String phoneNumber;
	private final String email;

	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book ! ");

		AddressBook k = new AddressBook("Ketan", "K", "Andh", "Mum", "MH", "68", "9833268736", "k@k.com");

		System.out.println("First Name : " + k.firstName + "  Last Name : " + k.lastName + "\nAddress : " + k.address
				+ "  State : " + k.state + "  City : " + k.city + "  ZIP : " + k.zip + "\nPhone Number : "
				+ k.phoneNumber + "  Email Id : " + k.email);
	}

}
