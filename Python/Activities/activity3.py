# Rock, Paper, Scissor - Game

# get the players' name
user1 = input("what is player 1 name?")
user2 = input("what is player 2 name?")

# get the players' choices
user1_answer = input(user1 + "what do you choose, rock/paper/scissor?").lower()
user2_answer = input(user2 + "what do you choose, rock/paper/scissor?").lower()

# check who wins
if user1_answer == user2_answer:
    print("its a tie")
elif user1_answer == 'rock':
    if user2_answer == 'scissor':
        print("rock wins !")
    elif user2_answer == "paper":
        print("paper wins !")
elif user1_answer == 'paper':
    if user2_answer == 'scissor':
        print("scissor wins !")
    elif user2_answer == "rock":
        print("rock wins !")
elif user1_answer == 'scissor':
    if user2_answer == "paper":
        print("scissor wins !")
    elif user2_answer == "rock":
        print("rock wins !")
else:
    print("invalid response, pls try again")
