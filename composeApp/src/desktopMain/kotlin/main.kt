import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import navigation.Navigation

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Navigation_Informations",
    ) {
        Navigation()
    }
}