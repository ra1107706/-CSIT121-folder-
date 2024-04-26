# description of the "counted vowels"
def number_of_vowels(string) :
 #######################################################################################################
    The_Vowels = 0
 #######################################################################################################
    #iterating through the string by each alphabet
    for j in string:

        if\
                (j== "a" or j=="e" or j=="i" or j=="o" or j=="u" or j=="A" or j=="E" or j== "I" or j=="O" or j=="U"):
#######################################################################################################
            The_Vowels =\
                The_Vowels\
                + 1
 #######################################################################################################
# Return the total amount of vowels following traversing over the entire phrase.

    return The_Vowels

 # definition of the consonants-counting function
def The_con\
                (string):
    conn \
        =0
# going back over the string one alphabet at a time
    for j in string:
#If a vowel appears for either small- or capital-case, we should ignore it and end the loop.

#######################################################################################################
        if \
                (j == "a" or j == "e" or j == "i" or j == "o" or j == "u" or j == "A" or j == "E" or j == "I" or j == "O" or j == "U"):
            continue
#######################################################################################################
#Otherwise, the alphabet would only have consonants.
#In that scenario, the number of consonants would be increased.
    else:
         conn = \
             conn + \
                1
         return conn

string_2 = input("Please enter your string")
#######################################################################################################
print("The result that was entered wash", number_of_vowels(string_2), "vowels and" , The_con(string_2),"consonants")