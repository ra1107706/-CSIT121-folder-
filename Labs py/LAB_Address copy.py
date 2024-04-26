from tkinter import *

def data_class():
    data_01.set\
        ("Mike johnson")
#&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
    data_02.set\
        ("363 Old Road")
#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
    data_03.set\
        ("Nextvile, AC 42392")

info = Tk()
###################################################
data_01\
    = StringVar()
###################################################
data_02\
    = StringVar()
###################################################
data_03\
    = StringVar()
####################################################

Label_intial =\
    Label (info,textvariable = data_01)
#$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
bill_01 =\
    Label (info,textvariable = data_02)
##&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
bill_02 =\
    Label (info,textvariable = data_03)
#################@@@@@@@@@@@@@@@@@@@@@@@@@@
Label_intial.\
    pack()
############@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
bill_01.\
    pack()
#################@@@@@@@@@@@@@@@@@@@@@@@@@@
bill_02.\
    pack()
#################@@@@@@@@@@@@@@@@@@@@@@@@@@

data_guide = Button \
    (info,text="Information",command=info)
#################@@@@@@@@@@@@@@@@@@@@@@@@@@
data_guide.pack\
    (side=LEFT,padx=5,pady=5)
#################@@@@@@@@@@@@@@@@@@@@@@@@@@
Ping = Button\
    (info,text="exit",command=exit)
#################@@@@@@@@@@@@@@@@@@@@@@@@@@
Ping.pack\
    (side=RIGHT,padx=5,pady=5)
#################@@@@@@@@@@@@@@@@@@@@@@@@@@

info.mainloop()

