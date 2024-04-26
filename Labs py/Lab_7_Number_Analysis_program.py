
########or
def \
        The_Main():
    The_Nums = \
        The_Values()        #I am intializing variables and calling my created function while storing "The_Nums" Variable
    Analysis\
        (The_Nums)
########################################

def \
        The_Values():
    print("Please enter a group of twenty number ")           #I am now propmting user and intialzing an array
    vals = []
####################################################################
    for i in range(20):               #Created an for loop, while propmting user,calling an append method and finally calling an return function

        val = (int(input("Please enter a number " + str(i+1) + ":")))
##################################################################
        vals.append(val)
########################################################################
    return vals

def Analysis(The_Nums):
    print("Lowest number is: "+ str(min(The_Nums)))        #I am now calling print function and within that print function i am propmting user while intializing
    print("Highest number is: " + str(max(The_Nums)))      # str,min,max,sum,len functions and lasly storing "the_nums" variable within them.
    print("The total number is: " + str(sum(The_Nums)))
    print(" The mean is: " + str(sum(The_Nums)/len(The_Nums)))

The_Main()