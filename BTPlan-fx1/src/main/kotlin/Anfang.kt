import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import tornadofx.*

class Anfang : View("My View") {
    /*override val root = borderpane {

    }*/

    override val root: BorderPane by fxml("Anfang.fxml")
}
