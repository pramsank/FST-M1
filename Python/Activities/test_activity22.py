# same exercise as activity 21 but use marker activity to test last 2 test methods

import pytest

# Additon test
def test_addition():

    # Initialize two numbers
    num1 = 40
    num2 = 20

    # Add them
    sum = num1 + num2

    # Assertion
    assert sum == 60

# Subtraction test
def test_subtraction():

    # Initialize two numbers
    num1 = 250
    num2 = 35

    # Subtract them
    diff = num1 - num2

    # Assertion
    assert diff == 215

# Multiplication test
@pytest.mark.activity
def test_multiplication():

    # Initialize two numbers
    num1 = 10
    num2 = 20

    # Multiply them
    prod = num1 * num2

    # Assertion
    assert prod == 200

# Division test
@pytest.mark.activity
def test_division():

    # Initialize two numbers
    num1 = 50
    num2 = 5

    # Divide them
    quot = num1 / num2

    # Assertion
    assert quot == 10