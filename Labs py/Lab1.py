class Pet:

    __name = ''
    __animal_type = ''
    __age = ''

    # class instantiation automatically invokes __init__()
    def __init__(self):
        self.__name = ''
        self.__animal_type = ''
        self.__age = ''

    # get_name method to return name
    def get_name(self):
        return self.__name

    # set_name method to set the name
    def set_name(self, name):
        self.__name = name

    # get_animalType to  return the animal type
    def get_animalType(self):
        return self.__animal_type

    # set_animalType to  set the animal type
    def set_animalType(self, animalType):
        self.__animal_type = animalType

    # get_age method to  return age
    def get_age(self):
        return self.__age

    # set_age method to set the age
    def set_age(self, age):
        self.__age = age


# Creating the default Pet object
obj1 = Pet()
# Taking input from user
name = input('Please enter the name : ')
obj1.set_name(name)
animalType = input('Please enter animal Type : ')
obj1.set_animalType(animalType)
age = input('Please enter the age of Pet : ')
obj1.set_age(age)
# Printing the result
print('Pet name : ', obj1.get_name(), '   animal Type :', obj1.get_animalType(), '   Pet age : ', obj1.get_age())