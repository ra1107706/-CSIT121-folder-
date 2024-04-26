import java.util.Scanner;

public class lab4 {

        static Scanner console = new Scanner(System.in);
    
        public static void main(String[] args) {
    
            {
                int number_month, year;
                int num_of_daysinamonth =0;
                java.lang.String month = "Does not Exist";
    
                System.out.println("What is the number of the month ?");
                number_month = console.nextInt();
    
                System.out.println("Now, you need to enter the year");
                year = console.nextInt();
    
                switch(number_month) {
                    
                    case 1:
                        month = "January";
                        num_of_daysinamonth = 31;
                        break;
    
    
                    case 2:
                        month = "February";
                        if (year%4 == 0) {
                            num_of_daysinamonth = 29;
                        } else {
                            num_of_daysinamonth = 28;
                        }
                        break;
                    case 3:
                        month = "March";
                        num_of_daysinamonth = 31;
                        break;
                    case 4:
                        month = "April";
                        num_of_daysinamonth = 30;
                        break;
                    case 5:
                        month = "May";
                        num_of_daysinamonth = 31;
                        break;
                    case 6:
                        month = "June";
                        num_of_daysinamonth = 30;
                        break;
                    case 7:
                        month = "July";
                        num_of_daysinamonth = 31;
                        break;
                    case 8:
                        month = "August";
                        num_of_daysinamonth = 31;
                        break;
                    case 9:
                        month = "September";
                        num_of_daysinamonth = 30;
                        break;
                    case 10:
                        month = "October";
                        num_of_daysinamonth = 31;
                        break;
                    case 11:
                        month = "November";
                        num_of_daysinamonth = 30;
                        break;
                    case 12:
                        month = "December";
                        num_of_daysinamonth = 31;
                        break;
    
                    default:
                        System.out.println(month);
    
                }
                System.out.println("The month of " + month + " " + year + "has"
                        + num_of_daysinamonth + " days");
    
            }
        }
    }