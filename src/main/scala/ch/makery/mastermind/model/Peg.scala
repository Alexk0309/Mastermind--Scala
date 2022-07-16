package ch.makery.mastermind.model 

import scala.util.Random
import scalafx.scene.shape.{Rectangle, Circle}
import scalafx.scene.paint.Color

class Peg(peg: Circle){

    var colorString: String = "White" 

    def setColor(color: String): Unit = {
        if (color == "Red") {
            colorString = "Red"
            peg.fill = scalafx.scene.paint.Color.Red
        }
        else if (color == "Blue") {
            colorString = "Blue"
            peg.fill = scalafx.scene.paint.Color.Blue
        }
        else if (color == "Green") {
            colorString = "Green"
            peg.fill = scalafx.scene.paint.Color.Green
        }
        else if (color == "Yellow") {
            colorString = "Yellow"
            peg.fill = scalafx.scene.paint.Color.Yellow
        }
        else if (color == "Orange") {
            colorString = "Orange"
            peg.fill = scalafx.scene.paint.Color.Orange
        }
        else if (color == "Purple") {
            colorString = "Purple"
            peg.fill = scalafx.scene.paint.Color.Purple
        }
        else if (color == "Black") {
            colorString = "Black"
            peg.fill = scalafx.scene.paint.Color.Black
        }
        else if (color == "White") {
            colorString = "White"
            peg.fill = scalafx.scene.paint.Color.White
        }
    }

    def getColor(): String = {
        return colorString
    }

}