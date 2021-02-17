import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Contact {

	static ArrayList<AddressBook> info = new ArrayList<AddressBook>();
	AddressBook a = new AddressBook();
	Scanner sc = new Scanner(System.in);

	public static ArrayList<AddressBook> getList() {
		return info;

	}

	public static void setList(ArrayList<AddressBook> info) {
		Contact.info = info;
	}

	public void addContact() {

		System.out.println("Enter Your First Name : ");
		a.setFirstName(sc.next());
		System.out.println("Enter Your Last Name : ");
		a.setLastName(sc.next());
		System.out.println("Enter Your Address : ");
		a.setAddress(sc.next());
		System.out.println("Enter Your City Name : ");
		a.setCity((sc.next()));
		System.out.println("Enter Your State Name : ");
		a.setState(sc.next());
		System.out.println("Enter Your Zip Code : ");
		a.setZip(sc.next());
		System.out.println("Enter Your Phone Number : ");
		a.setPhoneNumber(sc.next());
		System.out.println("Enter Your Email Id : ");
		a.setEmail(sc.next());
		info.add(a);
	}

	public void editContact() {
		System.out.println("Enter name you want to edit");
		
		String name = sc.next();

		for (int i = 0; i < info.size(); i++) {
			if (info.get(i).getFirstName().equals(name)) {
				System.out.println("Enter Your First Name : ");
				a.setFirstName(sc.next());
				System.out.println("Enter Your Last Name : ");
				a.setLastName(sc.next());
				System.out.println("Enter Your Address : ");
				a.setAddress(sc.next());
				System.out.println("Enter Your City Name : ");
				a.setCity((sc.next()));
				System.out.println("Enter Your State Name : ");
				a.setState(sc.next());
				System.out.println("Enter Your Zip Code : ");
				a.setZip(sc.next());
				System.out.println("Enter Your Phone Number : ");
				a.setPhoneNumber(sc.next());
				System.out.println("Enter Your Email Id : ");
				a.setEmail(sc.next());
				info.add(i, a);
				break;
			} else {
				System.out.println("No Record found");
			}
		}

	}

	public void deleteContact() {
		int j = 0, index = info.size() + 1;
		System.out.println("Enter name you want to delete");
		String name = sc.next();
		for (int i = 0; i < info.size(); i++) {
			if (info.get(i).getFirstName().endsWith(name)) {
				index = j;
			}
			j++;
			if (index < info.size())
				info.remove(index);
			else
				System.out.println("no record found");

		}

	}

	public void display() {
		for (AddressBook addr : info) {
			System.out.println(addr.toString());
		}
	}

}

public class AddressBook {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

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

	public AddressBook() {
	}

	public String setFirstName(String firstName) {
		return this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String setLastName(String lastName) {
		return this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public String setAddress(String address) {
		return this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public String setCity(String city) {
		return this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String setState(String state) {
		return this.state = state;
	}

	public String getState() {
		return state;
	}

	public String setZip(String zip) {
		return this.zip = zip;
	}

	public String getZip() {
		return zip;
	}

	public String setPhoneNumber(String phoneNumber) {
		return this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String setEmail(String email) {
		return this.email = email;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return ("First Name : " + this.getFirstName() + "  Last Name : " + this.getLastName() + "\nAddress : "
				+ this.getAddress() + "  State : " + this.getState() + "  City : " + this.getCity() + "  ZIP : "
				+ this.getZip() + "\nPhone Number : " + this.getPhoneNumber() + "  Email Id : " + this.getEmail()
				+ "\n");

	}

	public static void main(String[] args) {

		System.out.println("Welcome to Address Book ! ");

		AddressBook k = new AddressBook("Ketan", "K", "Andh", "Mum", "MH", "68", "9833268736", "k@k.com");
		System.out.println(k.toString());

		Contact c = new Contact();
		c.addContact();
		c.addContact();
		c.editContact();
		c.deleteContact();
		c.display();

	}

}
