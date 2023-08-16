# parametrization

import pytest

# Define a fixture for the wallet amount
@pytest.fixture
def wallet_amount():
    amount = 0
    return amount

# Set up the paremeterized test method
@pytest.mark.parametrize("earned, spent, expected", [ (40, 10, 30), (30, 5, 25), ])
def test_transactions(wallet_amount, earned, spent, expected):

    # Add money to your wallet
    wallet_amount += earned

    # Subtract amount from wallet
    wallet_amount -= spent

    # Assertion
    assert wallet_amount == expected
    print(expected)