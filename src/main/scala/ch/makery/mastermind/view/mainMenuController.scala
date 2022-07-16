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
class mainMenuController(
    menuBG: ImageView
) {
    
    menuBG.image = new Image ("file:resources/images/homeBG.jpeg")

    def quitGame(action: ActionEvent): Unit = {
        System.exit(0)
    }

    def howToPlay(action: ActionEvent): Unit = {
        MainApp.showHowToPlay()
    }

    def playGame(action: ActionEvent): Unit = {
        MainApp.startGame()
    }
    
}