package capgassignment;
import java.math.BigInteger;
import java.util.Scanner;
public class Person {
	static String firstName;
	static String lastName;
	public enum Gender{
		F,M;
	}
	static Gender gender;
	public Gender gender(){
		try {
			char gender1 = sc.next().charAt(0);
			String gender2 = String.valueOf(gender1);
			gender = Gender.valueOf(gender2);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return gender;
	}
	Scanner sc = new Scanner(System.in);
	public String firstName(){
		firstName = sc.next();
		return firstName;
		
	}
	public String lastName(){
		lastName = sc.next();
		return lastName;
		
	}
	static BigInteger number;
	public BigInteger acceptNumber() {
	
		try {
			number = sc.nextBigInteger();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return number;
		}
	public Person(String firstName, String lastName, Gender gender, BigInteger number){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.number = number;
	}
	
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		Person.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		Person.lastName = lastName;
	}
	public static Gender getGender() {
		return gender;
	}
	public static void setGender(Gender gender) {
		Person.gender = gender;
	}
	public void displayDetails(Person p){
		firstName();
		lastName();
		gender();
		acceptNumber();
		System.out.println("first name:"+p.firstName);
		System.out.println("last name:"+p.lastName);
		System.out.println("gender:"+p.gender);
		System.out.println("phone number:"+p.number);
	}
	public static void main(String[] args) {
		char g;
		Person p = new Person(firstName, lastName, gender, number);
		p.displayDetails(p);

	}
}
