########################################
def Grade\
(Result):
    if Result\
            >=90:                #First, I am declaring a definative function, and within the parenthesis, I am making an argument named "Results."
                                  #Secondly, I am declaring an if and return statement while initializing my argument variable.
        return \
            "A"
##################
    if Result \
            >=80:
        return \
            "B"
##################
    if Result\
            >=70:
        return \
            "C"
##################
    if Result \
            >=60:
        return \
            "D"
##################
    else:
        return "F"

#############################################
def Caculation\
(Results):                                       #I am now declaring another definable function and using my first variable argument, while creating a new variable, that equals an interger value.
    amount =\
0
###############################################
    for x in range\
                (len(Results)):                      #I am now calling a for loop and using an operator,
                                                    #Then I am calling a range function and len while inserting my argued variable.
###############################################
        Grand_Total = amount + Results[x]           #I created a prime variable to hold both my sub variables, and within that variable is an "index bracket."
                                                    #Then I am calling a return function, and within that function is my prime variable along with a float and len function, which will return back my object's properties and my argued variable.

    return Grand_Total/\
           float\
               (len(Results))

###############################################
Results = []                                          #I am now calling my results variable along with an index bracket, then I am calling an "for" loop and using an operator, and finally, I am calling a range function, and within that function, I set a specific number for how many times I want it to loop.
for x in range\
((5)):
###############################################
                                                      #I am now calling my result variable, then initializing a float and an input function that leads to prompting the user.
    Result = float\
        (input("Please enter a score: "))
###############################################
                                                      #I am now using a method called "append," which would add to my existing list.
    Results.append\
        (Result)
###############################################
The_Score = Caculation(Results)                            #I am now creating a new variable that will hold both my calculation and results variables.
for x in range\
(len(Results)):
###############################################
    print("The Score is: ", Results[x], "And the grade is ", Grade(Results[x]))           #Lasly, I am calling an print statement while calling my variables, prompting the user with the results.
print("Average Score: ", The_Score)
###############################################


