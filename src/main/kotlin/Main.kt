import react.dom.*
import kotlin.browser.document
import kotlinx.css.*


val unwatchedVideo = listOf(
        Video(1,"Building and breaking things", "John Doe", "http://youtu.be/PsaFVr8t4E"),
        Video(2, "The development process", "Jane Smith", "https://youtu.be/PsaFVLr8t4E"),
        Video(3, "The Web 7.0", "Matt Miller", "https://youtu.be/PsaFVLr8t4E")
)

val watchedVideo = listOf(
        Video(4, "Mouseless development", "Tom Jerry", "https://youtu.be/PsaFVLr8t4E")
)

fun main() {
    render(document.getElementById("root")){
        child(App::class){}
    }
}

