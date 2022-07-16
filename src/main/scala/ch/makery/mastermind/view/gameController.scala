package ch.makery.mastermind.view

import ch.makery.mastermind.MainApp
import scalafxml.core.macros.sfxml
import scalafx.Includes._
import scalafx.event.ActionEvent
import scalafx.scene.control.Alert.AlertType
import scala.util.{Failure, Success}
import scalafx.scene.shape.{Rectangle, Circle}
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.media.{Media, MediaPlayer}
import scalafx.scene.layout.AnchorPane


@sfxml
class gameController() {

    

    def goMenu(action: ActionEvent): Unit = {
        MainApp.showMainMenu()
    }

    def quitGame(action: ActionEvent): Unit = {
        System.exit(0)
    }
}