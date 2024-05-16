package com.boostmytool;
import java.util.Random;
import java.util.Scanner;

class Theinvoice

{

    //instance variables of items class
    double thetotal;
    double levy;
    double finaltotal;
    int theid;
    String thedate;
    Myitems newitems[] = new Myitems [10];
    int extent;
    //method to check whether it is valid day
    public boolean theDay(int period)
    {
        if(period >= 1 && period <= 31)
        {
            return true;
        }
        return false;
    }

    public boolean theEra(int era)
    {
        if(era >= 1 && era <= 12)
        {
            return true;
        }
        return false;
    }

    public boolean theYear(int year)
    {
        if(year < 100)
        {
            return true;
        }
        return false;
    }

    public String formDate(int Theday, int themonth, int Theyear)
    {
        if(themonth == 1)
            return "Jan-" + Theday + "-" + Theyear;
        else if(themonth == 2)
            return "Feb-" + Theday + "-" + Theyear;
        else if(themonth == 3)
            return "Mar-" + Theday + "-" + Theyear;
        else if(themonth == 4)
            return "Apr-" + Theday + "-" + Theyear;
        else if(themonth == 5)
            return "May-" + Theday + "-" + Theyear;
        else if(themonth == 6)
            return "Jun-" + Theday + "-" + Theyear;
        else if(themonth == 7)
            return "Jul-" + Theday + "-" + Theyear;
        else if(themonth == 8)
            return "Aug-" + Theday + "-" + Theyear;
        else if(themonth == 9)
            return "Sep-" + Theday + "-" + Theyear;
        else if(themonth == 10)
            return "Oct-" + Theday + "-" + Theyear;
        else if(themonth == 11)
            return "Nov-" + Theday + "-" + Theyear;
        else if(themonth == 12)
            return "Dec-" + Theday + "-" + Theyear;
        return "";

    }
    Theinvoice()
    {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int period, era, year;

        System.out.println("Date of purchase: (Month Day Year)");
        era = sc.nextInt();
        year = sc.nextInt();
        period = sc.nextInt();
//validate the date
        while(!(theDay(period) && theEra(era) && theYear(year)))
        {
            System.out.println("Date of purchase: (Month Day Year)");
            era = sc.nextInt();
            year = sc.nextInt();
            period = sc.nextInt();
        }
        char xx;
        do{
//form the date
            this.thedate = formDate(period, era, year);
            String Thename;
            double cost;
            int amount;
//prompt the user to enter the item details
            System.out.println("Please put item name:\t");
            sc.nextLine();
            Thename = sc.nextLine();
            System.out.println("Please put item price:\t");
            cost = sc.nextDouble();
            System.out.println("Please put item amount:\t");
            amount = sc.nextInt();
//create item object and store it in item array
            newitems[i] = new Myitems(Thename, cost, amount);
            i++;

            System.out.println("Would you like to continue(y/n):\t");
            xx = sc.next().charAt(0);
        }while(xx == 'y');
        int n = i;
        this.extent = n;
        Random rand = new Random();
        int min = 10000, max = 100000;
//createrandom number for invoice id
        this.theid = rand.nextInt((max - min) + 1) + min;
        this.finaltotal = 0;
        for(i = 0;i < n;i++)
        {
//calculate subtotal
            this.finaltotal += (newitems[i].cost * newitems[i].amount);
        }
        this.levy = (this.finaltotal * 6)/100;
        this.thetotal = this.finaltotal + this.levy;

    }
    public void PrintData() {
//
        System.out.println("================================================================");
        System.out.println("\tinvoice #\t\t\tTheinvoice Date");
        System.out.println("\t" + this.theid + "\t\t\t\t" + this.thedate);
        System.out.println("================================================================");
        System.out.println("\t\t\\\\\\\\Data////");
        System.out.println("================================================================");
        System.out.println("Products\t\tComponent Price\tAmount\tCost");
        for (int x = 0; x < this.extent; x++)
        {
            System.out.println(this.newitems[x].Thename + "\t\t" + this.newitems[x].cost + "\t\t" + this.newitems[x].amount + "\t\t" + (this.newitems[x].cost * this.newitems[x].amount));
        }
        System.out.println("================================================================");
        System.out.println("***Have a good day***\t\tFinal total\t\t $" + this.finaltotal);
        System.out.println("\t\t\t\t Tax \t\t\t$" + (Math.round(this.levy * 100)/100));
        System.out.println("\t\t\t\t Total\t\t\t$" + (Math.round(this.thetotal * 100)/100));
    }
}