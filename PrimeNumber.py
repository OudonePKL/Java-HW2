# Prime number program
# @author: Oudone PKL

# Function for check prime number
def checkPrimeNumber(num):
    i = 2
    m = 0
    flag = 0
    
    m = num / 2
    if(num == 0 or num == 1):
        print(num, " is not prime number")
    else:
        while i <= m:
            if(num % 2 == 0):
                print(num, " is not prime number")
                flag = 1
                break
            if(flag == 0): 
                print(num, " is prime number")
                break
    
# input value from user
num = int(input("Enter the numbers: "))

# call the function
checkPrimeNumber(num)