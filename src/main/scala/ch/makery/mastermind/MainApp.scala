package ch.makery.mastermind

// Import libraries 
import scalafx.Includes._
import ch.makery.mastermind.view.{WinController, LoseController}
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import javafx.{scene => jfxs}
import scalafxml.core.{NoDependencyResolver, FXMLView, FXMLLoader}
import scalafx.scene.Scene
import scalafx.stage.{ Stage, Modality, StageStyle }
import scalafx.scene.image._
import scalafx.scene.shape.Circle
import scalafx.scene.paint.Color

object MainApp extends JFXApp {
    
    val rootResource = getClass.getResource("view/RootLayout.fxml")
    val loader = new FXMLLoader(rootResource, NoDependencyResolver)
    loader.load()
    val roots = loader.getRoot[jfxs.layout.BorderPane]

    stage = new PrimaryStage {
        title = "Mastermind"
        icons += new Image("file:resources/images/mastermind.png")
        scene = new Scene {
            root = roots 
        }
    }

    MainApp.stage.setResizable(false)

    def showMainMenu(): Unit = {
        val resource = getClass.getResource("view/mainMenu.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val roots = loader.getRoot[jfxs.layout.AnchorPane]
        this.roots.setCenter(roots)
    }
    
    def showHowToPlay(): Unit = {
        val resource = getClass.getResource("view/howToPlay.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val roots = loader.getRoot[jfxs.layout.AnchorPane]
        this.roots.setCenter(roots)
    }

    def startGame(): Unit = {
        val resource = getClass.getResource("view/game.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val roots = loader.getRoot[jfxs.layout.AnchorPane]
        this.roots.setCenter(roots)
    }

    def showWin(answer: List[Color]): Unit = {
        val resource = getClass.getResource("view/Win.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val control = loader.getController[WinController#Controller]
        val roots2 = loader.getRoot[jfxs.layout.AnchorPane]
        var dialog = new Stage() {
            title = "Mastermind"
            icons += new Image("file:resources/images/mastermind.png")
            initModality(Modality.APPLICATION_MODAL)
            initOwner(stage)
            scene = new Scene {
                root = roots2
            }
        }
        control.answer1.fill = answer(0)
        control.answer2.fill = answer(1)
        control.answer3.fill = answer(2)
        control.answer4.fill = answer(3)
        control.dialogStage = dialog
        dialog.setResizable(false)
        dialog.initStyle(StageStyle.UNDECORATED)
        dialog.showAndWait()
    }

    def showLose(answer: List[Color]): Unit = {
        val resource = getClass.getResource("view/Lose.fxml")
        val loader = new FXMLLoader(resource, NoDependencyResolver)
        loader.load()
        val control = loader.getController[LoseController#Controller]
        val roots3 = loader.getRoot[jfxs.layout.AnchorPane]
        var dialog2 = new Stage() {
            title = "Mastermind"
            icons += new Image("file:resources/images/mastermind.png")
            initModality(Modality.APPLICATION_MODAL)
            initOwner(stage)
            scene = new Scene {
                root = roots3
            }
        }
        control.answer1.fill = answer(0)
        control.answer2.fill = answer(1)
        control.answer3.fill = answer(2)
        control.answer4.fill = answer(3)
        control.dialogStage = dialog2
        dialog2.setResizable(false)
        dialog2.initStyle(StageStyle.UNDECORATED)
        dialog2.showAndWait()
    }

    showMainMenu()
}