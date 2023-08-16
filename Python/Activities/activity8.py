# get a user defined list of numbers and check if the first element and the last element is the same

# get a list of numbers from the user
mylist = []
num = int(input('How many numbers do you want to enter in your list: '))

# add the user entries into the list
for n in range(num):
    numbers = int(input('Enter number '))
    mylist.append(numbers)

# Get first element in list
firstElement = mylist[0]
# Get last element in list
lastElement = mylist[-1]

# Check if first and last element are equal
if firstElement == lastElement:
    print(True)
else:
    print(False)