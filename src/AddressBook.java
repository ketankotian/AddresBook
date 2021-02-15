import java.util.Scanner;

public class AddressBook {

	private final String firstName;
	private final String lastName;
	private final String address;
	private final String city;
	private final String state;
	private final String zip;
	private final String phoneNumber;
	private final String email;

	public AddressBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name : ");
		this.firstName = sc.next();
		System.out.println("Enter last Name : ");
		this.lastName = sc.next();
		System.out.println("Enter Address : ");
		this.address = sc.next();
		System.out.println("Enter Your City Name : ");
		this.city = sc.next();
		System.out.println("Enter Your State : ");
		this.state = sc.next();
		System.out.println("Enter Zip : ");
		this.zip = sc.next();
		System.out.println("Enter Phone Number : ");
		this.phoneNumber = sc.next();
		System.out.println("Enter Email Id : ");
		this.email = sc.next();
	}

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

	@Override
	public String toString() {
		return ("First Name : " + this.firstName + "  Last Name : " + this.lastName + "\nAddress : " + this.address
				+ "  State : " + this.state + "  City : " + this.city + "  ZIP : " + this.zip + "\nPhone Number : "
				+ this.phoneNumber + "  Email Id : " + this.email);

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book ! ");

		AddressBook k = new AddressBook("Ketan", "K", "Andh", "Mum", "MH", "68", "9833268736", "k@k.com");
		System.out.println(k.toString());

		AddressBook jay = new AddressBook();
		System.out.println(jay.toString());
	}

}
