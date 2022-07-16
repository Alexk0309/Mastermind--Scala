package ch.makery.mastermind.view

import ch.makery.mastermind.MainApp
import ch.makery.mastermind.model.{Peg, Row}
import scalafxml.core.macros.sfxml
import scalafx.Includes._
import scalafx.event.ActionEvent
import scalafx.scene.control.Alert.AlertType
import scala.util.{Failure, Success}
import scalafx.scene.shape.{Rectangle, Circle}
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.media.{Media, MediaPlayer}
import scalafx.scene.layout.AnchorPane
import scalafx.scene.control.{Button}
import scalafx.scene.paint.Color
import scala.util.Random


@sfxml
class gameController(
    peg1: Circle,
    peg2: Circle,
    peg3: Circle,
    peg4: Circle,
    peg5: Circle,
    peg6: Circle,
    peg7: Circle,
    peg8: Circle,
    peg9: Circle,
    peg10: Circle,
    peg11: Circle,
    peg12: Circle,
    peg13: Circle,
    peg14: Circle,
    peg15: Circle,
    peg16: Circle,
    peg17: Circle,
    peg18: Circle,
    peg19: Circle,
    peg20: Circle,
    peg21: Circle,
    peg22: Circle,
    peg23: Circle,
    peg24: Circle,
    peg25: Circle,
    peg26: Circle,
    peg27: Circle,
    peg28: Circle,
    peg29: Circle,
    peg30: Circle,
    peg31: Circle,
    peg32: Circle,
    peg33: Circle,
    peg34: Circle,
    peg35: Circle,
    peg36: Circle,
    peg37: Circle,
    peg38: Circle,
    peg39: Circle,
    peg40: Circle,
    pegans1: Circle,
    pegans2: Circle,
    pegans3: Circle,
    pegans4: Circle,
    c11: Circle,
    c12: Circle,
    c13: Circle, 
    c14: Circle,
    c21: Circle,
    c22: Circle,
    c23: Circle, 
    c24: Circle,
    c31: Circle,
    c32: Circle,
    c33: Circle, 
    c34: Circle,
    c41: Circle,
    c42: Circle,
    c43: Circle, 
    c44: Circle,
    c51: Circle,
    c52: Circle,
    c53: Circle, 
    c54: Circle,
    c61: Circle,
    c62: Circle,
    c63: Circle, 
    c64: Circle,
    c71: Circle,
    c72: Circle,
    c73: Circle, 
    c74: Circle,
    c81: Circle,
    c82: Circle,
    c83: Circle, 
    c84: Circle,
    c91: Circle,
    c92: Circle,
    c93: Circle, 
    c94: Circle,
    c101: Circle,
    c102: Circle,
    c103: Circle, 
    c104: Circle,
    redButton: Button,
    blueButton: Button,
    greenButton: Button,
    yellowButton: Button,
    orangeButton: Button,
    purpleButton: Button,
    clearButton: Button,
    checkButton: Button
) {


    // Peg instances 
    var pegA1 = new Peg(pegans1)
    var pegA2 = new Peg(pegans2)
    var pegA3 = new Peg(pegans3)
    var pegA4 = new Peg(pegans4)
    var pegO1 = new Peg(peg1)
    var pegO2 = new Peg(peg2)
    var pegO3 = new Peg(peg3)
    var pegO4 = new Peg(peg4)
    var pegO5 = new Peg(peg5)
    var pegO6 = new Peg(peg6)
    var pegO7 = new Peg(peg7)
    var pegO8 = new Peg(peg8)
    var pegO9 = new Peg(peg9)
    var pegO10 = new Peg(peg10)
    var pegO11 = new Peg(peg11)
    var pegO12 = new Peg(peg12)
    var pegO13 = new Peg(peg13)
    var pegO14 = new Peg(peg14)
    var pegO15 = new Peg(peg15)
    var pegO16 = new Peg(peg16)
    var pegO17 = new Peg(peg17)
    var pegO18 = new Peg(peg18)
    var pegO19 = new Peg(peg19)
    var pegO20 = new Peg(peg20)
    var pegO21 = new Peg(peg21)
    var pegO22 = new Peg(peg22)
    var pegO23 = new Peg(peg23)
    var pegO24 = new Peg(peg24)
    var pegO25 = new Peg(peg25)
    var pegO26 = new Peg(peg26)
    var pegO27 = new Peg(peg27)
    var pegO28 = new Peg(peg28)
    var pegO29 = new Peg(peg29)
    var pegO30 = new Peg(peg30)
    var pegO31 = new Peg(peg31)
    var pegO32 = new Peg(peg32)
    var pegO33 = new Peg(peg33)
    var pegO34 = new Peg(peg34)
    var pegO35 = new Peg(peg35)
    var pegO36 = new Peg(peg36)
    var pegO37 = new Peg(peg37)
    var pegO38 = new Peg(peg38)
    var pegO39 = new Peg(peg39)
    var pegO40 = new Peg(peg40)

    // Pegs to check the row 
    var cO11 = new Peg(c11)
    var cO12 = new Peg(c12)
    var cO13 = new Peg(c13)
    var cO14 = new Peg(c14)
    var cO21 = new Peg(c21)
    var cO22 = new Peg(c22)
    var cO23 = new Peg(c23)
    var cO24 = new Peg(c24)
    var cO31 = new Peg(c31)
    var cO32 = new Peg(c32)
    var cO33 = new Peg(c33)
    var cO34 = new Peg(c34)
    var cO41 = new Peg(c41)
    var cO42 = new Peg(c42)
    var cO43 = new Peg(c43)
    var cO44 = new Peg(c44)
    var cO51 = new Peg(c51)
    var cO52 = new Peg(c52)
    var cO53 = new Peg(c53)
    var cO54 = new Peg(c54)
    var cO61 = new Peg(c61)
    var cO62 = new Peg(c62)
    var cO63 = new Peg(c63)
    var cO64 = new Peg(c64)
    var cO71 = new Peg(c71)
    var cO72 = new Peg(c72)
    var cO73 = new Peg(c73)
    var cO74 = new Peg(c74)
    var cO81 = new Peg(c81)
    var cO82 = new Peg(c82)
    var cO83 = new Peg(c83)
    var cO84 = new Peg(c84)
    var cO91 = new Peg(c91)
    var cO92 = new Peg(c92)
    var cO93 = new Peg(c93)
    var cO94 = new Peg(c94)
    var cO101 = new Peg(c101)
    var cO102 = new Peg(c102)
    var cO103 = new Peg(c103)
    var cO104 = new Peg(c104)
    
    

    // Row instances
    var rowAns = new Row(pegA1, pegA2, pegA3, pegA4)
    var row1 = new Row(pegO1, pegO2, pegO3, pegO4)
    var row2 = new Row(pegO5, pegO6, pegO7, pegO8) 
    var row3 = new Row(pegO9, pegO10, pegO11, pegO12)
    var row4 = new Row(pegO13, pegO14, pegO15, pegO16)
    var row5 = new Row(pegO17, pegO18, pegO19, pegO20)
    var row6 = new Row(pegO21, pegO22, pegO23, pegO24)
    var row7 = new Row(pegO25, pegO26, pegO27, pegO28)
    var row8 = new Row(pegO29, pegO30, pegO31, pegO32)
    var row9 = new Row(pegO33, pegO34, pegO35, pegO36)
    var row10 = new Row(pegO37, pegO38, pegO39, pegO40)
    
    
    // Pegs use to check row 
    var checkPegs1 = new Row(cO11, cO12, cO13, cO14)
    var checkPegs2 = new Row(cO21, cO22, cO23, cO24)
    var checkPegs3 = new Row(cO31, cO32, cO33, cO34)
    var checkPegs4 = new Row(cO41, cO42, cO43, cO44)
    var checkPegs5 = new Row(cO51, cO52, cO53, cO54)
    var checkPegs6 = new Row(cO61, cO62, cO63, cO64)
    var checkPegs7 = new Row(cO71, cO72, cO73, cO74)
    var checkPegs8 = new Row(cO81, cO82, cO83, cO84)
    var checkPegs9 = new Row(cO91, cO92, cO93, cO94)
    var checkPegs10 = new Row(cO101, cO102, cO103, cO104)

    def randomColor(): String = {
        var colors = List("Red", "Blue", "Green", "Yellow")
        var selectedColor = colors(scala.util.Random.nextInt(colors.length))
        return selectedColor
    }

    def colorObject(colorStr: String): Color = {
        if (colorStr == "Red") {
            return scalafx.scene.paint.Color.Red
        }
        else if (colorStr == "Blue") {
            return scalafx.scene.paint.Color.Blue
        }
        else if (colorStr == "Green") {
            return scalafx.scene.paint.Color.Green
        }
        else if (colorStr == "Yellow") {
            return scalafx.scene.paint.Color.Yellow
        }
        else if (colorStr == "Orange") {
            return scalafx.scene.paint.Color.Orange
        }
        else if (colorStr == "Purple") {
            return scalafx.scene.paint.Color.Purple
        }
        return scalafx.scene.paint.Color.White
    }
    

    pegA1.setColor(randomColor())
    pegA2.setColor(randomColor())
    pegA3.setColor(randomColor())
    pegA4.setColor(randomColor())

    var ans = List(pegA1.getColor(), pegA2.getColor(), pegA3.getColor(), pegA4.getColor())
    var colorAns = List(colorObject(pegA1.getColor()), colorObject(pegA2.getColor()), colorObject(pegA3.getColor()), colorObject(pegA4.getColor()))
    var rowList = List(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10)

    var rowCounter = 0
    var currentRow = rowList(rowCounter)
    var pegCounter = 0
    var currentPeg = currentRow.getPeg(pegCounter)
    var checkPegsList = List(checkPegs1,checkPegs2,checkPegs3,checkPegs4,checkPegs5,checkPegs6,checkPegs7,checkPegs8,checkPegs9,checkPegs10)
    var currentCheckPeg = checkPegsList(rowCounter)


    def goMenu(action: ActionEvent): Unit = {
        MainApp.showMainMenu()
    }

    def quitGame(action: ActionEvent): Unit = {
        System.exit(0)
    }
    
    def rowFull(): Boolean = {
        if (pegCounter == 4) {
            redButton.setVisible(false)
            blueButton.setVisible(false)
            greenButton.setVisible(false)
            yellowButton.setVisible(false)
            orangeButton.setVisible(false)
            purpleButton.setVisible(false)
            return true
        }
        return false
    }

    def clear(action: ActionEvent): Unit = {
        pegCounter = 0
        currentPeg = currentRow.getPeg(pegCounter)
        for (x <- 0 to 3) {
            currentRow.getPeg(x).setColor("White")
        }
        checkButton.setVisible(false)
        redButton.setVisible(true)
        blueButton.setVisible(true)
        greenButton.setVisible(true)
        yellowButton.setVisible(true)
        orangeButton.setVisible(true)
        purpleButton.setVisible(true)
    }

    def nextRound(): Unit = {
        if (rowCounter == 9) {
            MainApp.showLose(colorAns)
        }
        else {
            checkButton.setVisible(false)
            rowCounter += 1
            currentRow = rowList(rowCounter)
            pegCounter = 0
            currentPeg = currentRow.getPeg(pegCounter)
            currentCheckPeg = checkPegsList(rowCounter)
            redButton.setVisible(true)
            blueButton.setVisible(true)
            greenButton.setVisible(true)
            yellowButton.setVisible(true)
            orangeButton.setVisible(true)
            purpleButton.setVisible(true)
        }  
    }

    def check(action: ActionEvent): Unit = {
        var inputList = currentRow.getPegList()
        var counter = 0
        var skip = 0
        var win = 0
        // Check black first 
        for (x <- 0 to 3) {
            if (inputList(x).getColor() == ans(x)) {
                currentCheckPeg.getPeg(counter).setColor("Black")
                counter += 1
                win += 1
            }
        }
        // Then white 
        for (y <- 0 to 3) {
            if (inputList(y).getColor() == ans(y)) {
                skip += 1
            }
            else if (ans.contains(inputList(y).getColor())) {
                currentCheckPeg.getPeg(counter).setColor("White")
                counter += 1
            }
        }

        if (win == 4) {
            MainApp.showWin(colorAns)
        }
        nextRound()        
    }


    checkButton.setVisible(false)

    redButton.onAction = (e: ActionEvent) => {
        currentPeg.setColor("Red")
        pegCounter += 1 
        if (rowFull()) {
            checkButton.setVisible(true)
        }
        else {
            currentPeg = currentRow.getPeg(pegCounter)
        } 
        
   }
    
    blueButton.onAction = (e: ActionEvent) => {
        currentPeg.setColor("Blue")
        pegCounter += 1 
        if (rowFull()) {
            checkButton.setVisible(true)
        }
        else {
            currentPeg = currentRow.getPeg(pegCounter)
        } 
   }

    greenButton.onAction = (e: ActionEvent) => {
        currentPeg.setColor("Green")
        pegCounter += 1 
        if (rowFull()) {
            checkButton.setVisible(true)
        }
        else {
            currentPeg = currentRow.getPeg(pegCounter)
        } 
   }

    yellowButton.onAction = (e: ActionEvent) => {
        currentPeg.setColor("Yellow")
        pegCounter += 1 
        if (rowFull()) {
            checkButton.setVisible(true)
        }
        else {
            currentPeg = currentRow.getPeg(pegCounter)
        } 
   }

    orangeButton.onAction = (e: ActionEvent) => {
        currentPeg.setColor("Orange")
        pegCounter += 1 
        if (rowFull()) {
            checkButton.setVisible(true)
        }
        else {
            currentPeg = currentRow.getPeg(pegCounter)
        } 
   }
    
    purpleButton.onAction = (e: ActionEvent) => {
        currentPeg.setColor("Purple")
        pegCounter += 1 
        if (rowFull()) {
            checkButton.setVisible(true)
        }
        else {
            currentPeg = currentRow.getPeg(pegCounter)
        } 
   }

   


}