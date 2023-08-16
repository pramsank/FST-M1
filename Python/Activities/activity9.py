"""create 2 list and pick odd elements from list1, even elements from list2
and add them to third list"""

# create the 2 lists
list1 = [10, 25, 30, 37, 11]
list2 = [11, 26, 31, 36, 14]

# Print the lists
print("First List ", list1)
print("Second List ", list2)

# Declare a third list that will contain the result
list3 = []

# Get odd elements from first list
for num in list1:
    if num % 2 != 0:
        list3.append(num)

# Get even elements from second list
for num in list2:
    if num % 2 == 0:
        list3.append(num)

# Print result
print("result List is:")
print(list3)