//Nguyen Viet Thang - 20215245
package OtherProjects.Lab01;
import java.util.Scanner;

public class DisplayDay{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the month(Note that:'1', 'January', 'Jan', 'Jan.' are all acceptable):");
		String month = input.next();

		System.out.print("Enter the year as integer: ");
		int year = input.nextInt();

        while (year < 0){
            System.out.println("Please enter the year again (note that: year is a positive integer).");
            year = input.nextInt();
        }

		int days = 0;
		boolean flag = false;
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		if (month.equals("1") || month.equals("January")|| month.equals("Jan")||month.equals("Jan.")){
			days = 31;
			flag = true;
		}
		if (month.equals("2") || month.equals("February")|| month.equals("Feb")||month.equals("Feb..")){
			if (leapYear) {
                days = 29;
               	flag = true;
            } else{
                days = 28;
                flag = true;
            }
		}
		if (month.equals("3") || month.equals("March")|| month.equals("Mar")||month.equals("Mar.")){
			days = 31;
			flag = true;
		}
		if (month.equals("4") || month.equals("April")|| month.equals("Apr")||month.equals("Apr.")){
			days = 30;
			flag = true;
		}
		if (month.equals("5") || month.equals("May")|| month.equals("May.")){
			days = 31;
			flag = true;
		}
		if (month.equals("6") || month.equals("June")|| month.equals("Jun")||month.equals("Jun.")){
			days = 30;
			flag = true;
		}
		if (month.equals("7") || month.equals("July")|| month.equals("Jul")||month.equals("Jul.")){
			days = 31;
			flag = true;
		}
		if (month.equals("8") || month.equals("August")|| month.equals("Aug")||month.equals("Aug.")){
			days = 31;
			flag = true;
		}
		if (month.equals("9") || month.equals("September")|| month.equals("Sep")||month.equals("Sep.")){
			days = 30;
			flag = true;
		}
		if (month.equals("10") || month.equals("October")|| month.equals("Oct")||month.equals("Oct.")){
			days = 31;
			flag = true;
		}
		if (month.equals("11") || month.equals("November")|| month.equals("Nov")||month.equals("Nov.")){
			days = 30;
			flag = true;
		}
		if (month.equals("12") || month.equals("December")|| month.equals("Dec")||month.equals("Dec.")){
			days = 31;
			flag = true;
		}
		if (flag){
			System.out.println("The number of days in " + month + " of " + year + " is " + days + ".");
		}
		else{
			System.out.println("Please enter again the month!");
		}
	}
}