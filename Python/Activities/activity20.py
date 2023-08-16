# READ EXCEL FILE

# Import pandas
import pandas as pd

# Read data from Excel sheet
dataframe = pd.read_excel('my_file.xlsx')

# Print the dataframe
print(dataframe)

# Print the number of rows and columns
print("Number of rows and columns:", dataframe.shape)

# Print the data in the emails column only
print("Emails:")
print(dataframe['Email'])

# Sort data on FirstName - ASC order and print
print("Sorted data:")
print(dataframe.sort_values('FirstName'))
