# writing to csv file

# import pandas
import pandas

# Structure our data as a dictionary
data = {
    "UserNames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# print the dataframe

print(dataframe)

# Write the data to a csv file
dataframe.to_csv("samplefile.csv", index=False)