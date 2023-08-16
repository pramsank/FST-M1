# accept name and age and print it out

# accepts name
name = input("What is your name: ")
print(name)
# accepts age
age = int(input("How old are you: "))
print(age)
# calculates when the person will be 100 yrs
year = str((2020 - age) + 100)
print(name + " will be 100 years old in the year " + year)