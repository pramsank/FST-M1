# create a dictionary of fruits and their availability

fruit_shop = {
    "apple": 10,
    "orange": 15,
    "banana": 8,
    "grapes": 20,
    "peaches": 15
}

fruitavailable = input("What are you looking for? ").lower()

if(fruitavailable in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")