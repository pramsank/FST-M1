# get a list of numbers from user and the numbers to tuple
# iterate through tuple and print only those numbers which are divisible by 5

# define an empty tuple
newtuple = ()

# convert the tuple to list

templist = list(newtuple)


# find out how many numbers are to be entered into the list
items = int(input('How many numbers do you want to enter in your list: '))
print("number of elements in your tuple are: ", items)

# add the user entries into the list
for n in range(items):
    numbers = int(input('Enter number '))
    templist.append(numbers)

# convert list back to tuple
tuple2 = tuple(templist)
print("your tuple contains: ")
print(tuple2)

# Print elements that are divisible by 5
for num in tuple2:
    if num % 5 == 0:
        print(num)

