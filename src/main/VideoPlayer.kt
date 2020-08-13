import kotlinx.css.*
import react.*
import react.dom.*
import styled.*
import kotlin.html.js.onClickFunction

external interface VideoPlayerProps: RProps {
    var video: Video
}

class VideoPlayer : RComponent<VideoPlayerProps,RState>(){
    override fun RBuilder.render(){
       styledDiv {
           css {
                position = Position.absolute
                color  = gray
                top = 10.px
               left = 2.px
            }
           h3 {
               +"${props.video.speaker}:${props.video.title}"
           }
           img {
               attrs {
                   src = "${props.video.videoUrl}"
               }
           }
        }
    }
}