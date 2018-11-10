package capg.ass1; 
import java.math.*;  
import java.math.BigInteger;
import java.util.Scanner;
class Person{
    
   static String firstName;
	    static String lastName;
	    char g;
	    
	    static BigInteger number;
	    public enum Gender{
	        M,F,m,f;
	    }
	    static Gender gender;
	    Scanner sc= new Scanner(System.in);
	    public BigInteger acceptNumber(){
	        number=sc.nextBigInteger();
	        return number;
	    }
	    
	    public String firstName(){
	        firstName = sc.next();
	        return firstName;
	    }
	    
	    public String lastName(){
	        lastName=sc.next();
	        return lastName;
	    }
	    
	    public Gender gender(){
	        g=sc.next().charAt(0);
	        String g1=String.valueOf(g);
	        gender=Gender.valueOf(g1);
	        return gender;
	    }
	    
	    public Person(String firstName,String lastName, Gender gender,BigInteger number)
	    {
	        this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.number = number;
	    }
	    
	    public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public BigInteger getNumber() {
			return number;
		}

		public void setNumber(BigInteger number) {
			this.number = number;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}


	    public void displayDetails(Person p){
	        firstName();
	        lastName();
	        gender();
	        acceptNumber();
	        System.out.println("FirstName:"+p.firstName);
	        System.out.println("LastName:"+p.lastName);
	        System.out.println("Gender:"+p.gender);
	        System.out.println("Number:"+p.number);
	    }
	public static void main(String[] args) {
		Person p = new Person(firstName, lastName, gender, number);
		p.displayDetails(p);


	}

}
