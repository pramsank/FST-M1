# reading csv files

# Import pandas
import pandas as pd

# Read the CSV file and store it into a DataFrame
dataframe = pd.read_csv('../resources/samplefile.csv')
print(dataframe.keys())

# print values of UserNames colum
print("printing valus under UserNames column")
print(dataframe["UserNames"])

# print username and password of second row
print("display username and password of second row")
print("UserName: ", dataframe["UserNames"][1], ',', "Password: ", dataframe["Passwords"][1])

# print username column in ascending order sort
print("printing username column in ascending order")
print(dataframe.sort_values('UserNames'))

# print passwords column in descending order sort
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))
