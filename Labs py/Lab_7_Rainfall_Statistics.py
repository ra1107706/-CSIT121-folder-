def show(sum,mean,The_LOW,The_HIGH):
    print("Sum of the Rainfall : {:.2f}".format(sum))
    print("The Mean of the Rainfall :  {:.2f}".format(mean))         #function takes the entire amount of rain. Average precipitation; minimum and maximum amounts * Displays the total amount of rainfall Raifall statistics: average, lowest, and highest
    print("The_LOW of the Rainfall :  {:.2f}".format(The_LOW))
    print("The_HIGH the Rainfall :  {:.2f}".format(The_HIGH))
####################################################################
def The_Main():
    The_Months = ["Jan","Feb","March","April","May","June",            #The_Months names to ask the user to enter the month's rainfall
                  "July","Aug","Sep","Oct","Nov","Dec",]

    The_List = []
#####################################################################
    for month in The_Months:
        The_Rainfall = float(input("Please enter the rainfall for the month {}:" .format(month)))    #Prompting user to enter rainfall for months
        The_List.append(The_Rainfall)
########################################################################################
        The_Total_Of_RainFall = 0
        Low_Indicator = 0                                                 #This contains the sum of rainfall
        High_Indicator = 0                                                 #This is the indicator for the lowest on the list
                                                                           ###This is the indicator for the highest on the list
#########################################################################################
    for i in range(12):
        The_Total_Of_RainFall += The_List[i]
        if The_List[Low_Indicator] > The_List[i]: Low_Indicator = i             ##All of the code caculates The prime variables and the high and low indicator
        if The_List[High_Indicator] < The_List[i]: High_Indicator = i
    mean = The_Total_Of_RainFall / 12
    show(The_Total_Of_RainFall, mean, The_List[Low_Indicator], The_List[High_Indicator])

The_Main()
#######or
