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
class howToPlayController(
   private val background: ImageView
) {
    
    background.image = new Image ("file:resources/images/homeBG.jpeg")

    def goBack(action: ActionEvent): Unit = {
        MainApp.showMainMenu()
    }
    
}