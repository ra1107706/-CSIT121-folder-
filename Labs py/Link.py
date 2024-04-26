The_File = open("number_list.txt", "w")
for numbers in range (1,100):
    The_File.write(str(numbers)+ "\n")
    The_File.close()