
###########
import random
def\
        The_main():                    #First, I am initializing an import random from module and creating a definite variable, while creating another variable with an array.
    The_Nums = [0] * 7
###################################
    for The_Index in range(7):             #I created a for loop and range function and called an array and method "randint."
        The_Nums[The_Index] = \
            random.randint(0,9)
####################################################
        print("The lottery drawings are: ")            #Finally, I'm using print, for, end primeter, range method, and prompting the user for their results.
        for The_Index in range(7):
            print\
                (The_Nums[The_Index], end=',')
            print()
The_main()
