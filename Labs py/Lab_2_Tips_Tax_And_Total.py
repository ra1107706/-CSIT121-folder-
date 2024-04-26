
#Fist we are intializing a variable and inputting float,input and user statment
Payment_Or_Cost\
                                   = \
                                 float\
                                    (
                                   input
                                     (
                             "Please enter the "
                            "total you are owed?"
                                    )
                                    )

#Calling two required variables for programs and that equals the first variable, while calculating it by the required number value percentage.
The_Tax\
                                     =\
                                     (
                                       Payment_Or_Cost
                                   *
                                  .07
                                    )
The_Tip\
                                    =\
                                                  (
                                    Payment_Or_Cost
                                   *
                                  .18
                                                  )


#Calling print function and telling the user  "the cost for food"/ Also calling or formatting an F-string to add decimal placement.
print\
     (
        "The Cost for the food: "
                   "%.2f "
                      %
                      (
                        Payment_Or_Cost
                      )
                                               )


#Calling print function and telling the user "the total amount of tax"
print\
    (
        "The total amount of tax: "
                   "%.2f "
                      %
                      (
                        The_Tax
                     )
                                               )

#Calling print function again and telling the user "the total amount of tip"
print\
    (
        "The total amount of tip:"
                 " %.2f "
                    %
                    (
                       The_Tip
                    )
                                                )
#Calling print function and telling "The final total of value"
print\
    (
        "The Final total of all value is:"
                       " %.2f "
                          %
                          (

                Payment_Or_Cost
                         +
                      The_Tip
                         +
                       The_Tax


                          )
                                                 )




