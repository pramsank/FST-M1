# ask user for how many Fibonnaci numbers to generate and then generate them

# accept a value from the user
userNum = int(input("Enter a number: "))

# function to generate fibo series up to user defined number
def fibonacci(number):
    if number <= 1:
        return number
    else:
        return(fibonacci(number-1) + fibonacci(number-2))

# check if user entered positive value if yes, call the fibonacci function
if userNum <= 0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(userNum):
        print(fibonacci(i))



