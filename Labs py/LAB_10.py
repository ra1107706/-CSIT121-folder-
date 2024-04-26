class The_Pet:
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    Name = ""
    Pet_Type = ""
    Pet_Age = " "

##################################################################
    # class instantiation automatically invokes __init__()
    def __init__\
                    (self):
        self.Name \
            = ''
        self.Pet_Type \
            = ''
        self.Pet_Age \
            = ''
##################################################################
    # get_name method to return name
    def Needs_Proper_Name\
                    (self):
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        return \
            self.Name
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    # set_name method to set the name
    def placement_of_Name\
                    (self,Name):
        self.\
            Name = Name
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    # get_animalType to  return the animal type
    def The_Pet_Type\
                    (self):
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        return \
            self.Pet_Type
#################################################################@@@@@@
    # set_animalType to  set the animal type
    def pet_species (self,Pet_Type):
        self.Pet_Type = \
            Pet_Type
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    # get_age method to  return age
    def required_age(self):
        return \
            self.Pet_Age
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    # set_age method to set the age
    def age_settings(self,Pet_Age):
        self.Pet_Age = \
            Pet_Age
##################################################################@@@@@

# Creating the default Pet object
First_01 = \
    The_Pet()
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
user = input\
    ("Now please enter the name of your pet: ")
First_01.placement_of_Name\
    (user)
##################################################################
Pet_Type = input \
    ("Next please enter pet type: ")
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
First_01.pet_species\
    (Pet_Type)
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
Pet_Age= input \
    ("Lastly please input the age of your pet: ")
##################################################################
First_01.age_settings\
    (Pet_Age)
#@#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
print \
    ("The pet name is : " , First_01.Needs_Proper_Name(), "    The Animal type is an: ", First_01.The_Pet_Type(), "    And final the pet age is:  ", First_01.required_age())