# Mastermind--Scala
PRG1204 Object Oriented programming Final Assignment II 

Mastermind
Game

Function:
- check for correctPegs, correctPlacement (Black peg)
- check for correctPegs, wrongPlacement (White peg)
- generate random colour combination
- check for wrong input (leave the peg empty)

Process:
1. Start the game through 'Play' button
2. Random colour combination will be generated and stored
3. Players start guessing by drag & drop provided colours from the side (red, blue, green, yellow, white, cyan)
4. Players insert 4 colour inputs and press the 'Check' button
5. The colour input will be checked and compared with the correct answer.
6. If not all pegs are correct or some pegs are correct or some correct some wrong or some correct some misplaced, 
	the result of the colour input will be shown through the Black pegs and white pegs and no pegs. Continue.
7. If all pegs are correct, call the winner through dialog. If not, continue.
8. Players get 10 attempts to guess the answer.
9. If after 10 attempts players still cannot guess the answer, call for game over through dialog and display Correct answer.
10. Prompt player to play again or quit.
