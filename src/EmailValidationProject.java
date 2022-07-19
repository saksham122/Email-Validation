package EmailValidationProject;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidationProject{
	
	public String emailID;
	public String match;
	public int check = 0;
	public boolean value;
	public Pattern PT;
	public Matcher MT;
	
	public void verificationID(String emp[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the Email id: ");
		emailID = input.next();
		PT = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
		MT = PT.matcher(emailID);
		value = MT.matches();
		
		if(value!=true) {
			System.out.println("Please Enter a valid Email-ID");
		}
		
		for(int i=0;i<emp.length;i++) {
			match=emp[i];
			if(match.equals(emailID)) {
				check++;
			}
			
		}
		if(check>0) {
			System.out.println("Email-ID found in the data base");
		}
		else {
			System.out.println("Email-ID can't be found in the Employee data base");
		}
				
	}

	public static void main(String[] args) {
		String emp[] = {"saksham@yahoo.in","sakshamtiwari@gmail.com","qwerty@reddifmail.com",
				"desktop@zxy.com","qwerty@ez.com","kriti@discord.gg"};
		EmailValidationProject EVP = new EmailValidationProject();
		EVP.verificationID(emp);
	}
}