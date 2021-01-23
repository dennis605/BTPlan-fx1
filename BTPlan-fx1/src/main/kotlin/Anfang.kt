import javafx.fxml.FXML
import javafx.scene.control.Alert
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.VBox
import sun.plugin2.message.Message
import tornadofx.*

class Anfang : View("My View") {
    /*override val root = borderpane {

    }*/

    override val root: BorderPane by fxml("Anfang.fxml")
    val btn : Button by fxid()
    val num : Label by fxid()
    fun slide () {

                var temp = num.text
        var temp_int = temp.toInt()
        temp_int = temp_int +1
        var temp_string = temp_int.toString()
        num.text = temp_string

    }

}
