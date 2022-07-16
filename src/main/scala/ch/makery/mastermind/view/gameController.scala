package ch.makery.mastermind.view

import ch.makery.mastermind.MainApp
import scalafxml.core.macros.sfxml
import scalafx.Includes._
import scalafx.event.ActionEvent
import scalafx.scene.control.Alert.AlertType
import scala.util.{Failure, Success}
import scalafx.scene.image.{Image, ImageView}
import scalafx.scene.media.{Media, MediaPlayer}

@sfxml
class gameController(
    gameBackground: ImageView
) {

    gameBackground.image = new Image("file:resources/images/asset.png")

    def goMenu(action: ActionEvent): Unit = {
        MainApp.showMainMenu()
    }

    def quitGame(action: ActionEvent): Unit = {
        System.exit(0)
    }
}