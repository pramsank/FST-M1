# WRITE INTO EXCEL FILE

# Import pandas
import pandas
from pandas import ExcelWriter
from openpyxl.workbook import Workbook

# Create a dictionary that will be used to create the DataFrame
data = {
    'FirstName':["Chindu", "Kiki", "Boban"],
    'LastName':["Doggie", "Kitty", "Kitty"],
    'Email':["chindu@example.com", "kiki.kittyK@example.com", "boban.kitty@example.com"],
    'PhoneNumber':["2345678922", "2345678933", "2345678944"]
}
# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)
# Print the dataframe
print(dataframe)
# Create an ExcelWriter object
writer = ExcelWriter("my_file.xlsx")

# Write the DataFrame to the Excel file
dataframe.to_excel(writer, "Sheet1", index=False)
# Save the file
writer._save()

