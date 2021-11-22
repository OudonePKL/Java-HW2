# Greatest common fector program
# @author: Oudone PKL


# function for checck greatest common fector.
def checkGCF(num1, num2):
    while num1 != num2:
        if num1 > num2:
            num1 -= num2
        else:
            num2 -= num1
    
    print("GCF: ", num2)

# variable
num1 = 12
num2 = 18

# call the function
checkGCF(num1, num2)