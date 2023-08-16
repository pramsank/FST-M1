# lists

# declare a new list
newlist = []

# get the list of numbers from user
num = int(input('How many numbers do you want to enter in your list: '))

# add the user entries into the list
for n in range(num):
    numbers = int(input('Enter number '))
    newlist.append(numbers)

# print out the list
print("Sum of elements in given list is :", sum(newlist))
