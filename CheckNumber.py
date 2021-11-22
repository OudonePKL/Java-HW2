# Print a nuber as input and if the number is negative, write a minus on the second line

# @author: Oudone PKL


# Create a function
def showData(num):
    result = ""
    if num < 0:
       result = "Minus"

    elif num > 0:
        result = "Plus"
    else:
        result = "Zero"

    print("Result: ", num)
    print(result)
        

num = int(input("Enter numbers: "))

# call function
showData(num)