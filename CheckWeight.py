# Check your weight program

# @author: Oudone PKL


# create a function 
def checkWeight(weight, height):
    n = 100
    weight = weight + 100 - height
    print(weight)
    if weight > 0:
        print("You are obese.")
    else:
        print("You are not obese.")

# input value from the user
weight = int(input("Enter your weight: "))
height = int(input("Enter your height: "))

# call function
checkWeight(weight, height)