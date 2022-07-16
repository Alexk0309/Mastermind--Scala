package ch.makery.mastermind.model 

import ch.makery.mastermind.model.Peg

class Row(peg1: Peg, peg2: Peg, peg3: Peg, peg4: Peg){

    var rowList = List(peg1, peg2, peg3, peg4)

    def getPeg(index: Int): Peg = {
        return rowList(index)
    }

    def getPegList(): List[Peg] = {
        return rowList
    }

}