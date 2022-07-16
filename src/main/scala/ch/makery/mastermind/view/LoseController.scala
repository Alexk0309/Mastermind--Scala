package ch.makery.mastermind.view

// Import libraries 
import ch.makery.mastermind.MainApp
import scalafxml.core.macros.sfxml
import scalafx.Includes._
import scalafx.event.ActionEvent
import scalafx.scene.control.Alert.AlertType
import scala.util.{Failure, Success}
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.control.{Button}
import scalafx.scene.text.Text
import scalafx.stage.Stage
import scalafx.scene.shape.Circle
import scalafx.scene.paint.Color._

@sfxml
class LoseController(
    answerCircle1: Circle,
    answerCircle2: Circle,
    answerCircle3: Circle,
    answerCircle4: Circle
) {

    var answer1 = answerCircle1
    var answer2 = answerCircle2
    var answer3 = answerCircle3
    var answer4 = answerCircle4

    var dialogStage: Stage = null

    def goHome(action : ActionEvent): Unit = { 
        MainApp.showMainMenu()
        dialogStage.close()
    }

    def exitGame(action: ActionEvent): Unit = {
        System.exit(0)
    }
}