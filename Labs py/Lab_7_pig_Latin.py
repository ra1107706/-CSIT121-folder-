def The_main():


 # taking user input and interpreting it
    The_Result = \
        input(" english: ");
#######################################################################################################
    # a phrase that is written in Pig Latin
    The_Latin = "";
#######################################################################################################
    # repetition of each phrase
    for j in \
            The_Result.split(" "):
#######################################################################################################
        # becoming a pig Roman syntax and new grammar and syntax
        The_Latin = The_Latin + \
                    (j[1:] + j[0] + " ").upper() +" ";
#######################################################################################################
    # Phrase printed in Pig Latin
#######################################################################################################
    print\
        (" Pig latin: " + The_Latin + " ");



The_main();