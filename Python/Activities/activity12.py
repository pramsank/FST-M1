# recursive function - calculate sum of numbers from 0 to 10

def calculateSum(num):
    if num:
        # Recursive function call
        return num + calculateSum(num-1)
    else:
        return 0

# Call calculateSum() function
result = calculateSum(10)

# Print result
print(result)