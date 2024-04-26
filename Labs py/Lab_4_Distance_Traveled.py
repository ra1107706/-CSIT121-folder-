#-----------------------------------------------------------------------------
while True:
 The_Speed = int\
     (input
      ("Please enter the speed of the automobile in Mpg?: ")
    )
 if The_Speed >=0:                                       #First section of code
     break
     print \
         (
             ("This is not acceptable, Negative values are invalid")
           )
#-----------------------------------------------------------------------------

                          #Brief Explaination

#First, we are initiating a while loop that is true while initializing variables that contain both- Data and input functions.
#Next, we are calling the "if" and break functions.


#-----------------------------------------------------------------------------
while True:
 The_Hours = int\
     (input
           ("Please enter the amount of hours droved?:")
      )
 if The_Hours >=0:                                        #Second section of code
     break
     print \
         (
             ("This is not acceptable, Negative values are invalid")
          )
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^



#Lastly, we are calling for print statements, along with for loops, and a range.


#-----------------------------------------------------------------------------
print ("The Hour and Total Distance is:")
                                                #third and fourth section of code
print("--------------------------------")
#^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^



for j in range \
(1, int(The_Hours)+1):
#-----------------------------
 The_Distance =\
The_Speed * j
#-----------------------------
 print\
(j,"\t",The_Distance)
