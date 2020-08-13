import react.*
import react.dom.*
import styled.css
import styled.styledDiv
import kotlinx.css.*


external interface AppState: RState {
    var currentVideo: Video?
}

class App: RComponent<RProps, AppState>(){
    override fun RBuilder.render(){
        styledDiv {
            css {
                position = Position.relative
                top = 2.px
                left = 20.px
                color = Color.darkBlue
            }
            h1 { +"так важно вносить плюс" }
            h1{+"unwatched videos"}
            videoList {
                videos = unwatchedVideo
                selectedVideo = state.currentVideo
                onSelectVideo = { video ->
                    setState {
                        currentVideo = video
                    }
                }
            }

            h1{+"watched videos"}
            videoList {
                videos = watchedVideo
                selectedVideo = state.currentVideo
                onSelectVideo = {video ->
                    setState {
                        currentVideo = video
                    }
                }
            }

            div{
                h3{+"${unwatchedVideo[0].speaker}: ${unwatchedVideo[0].title}"}
                img {
                    attrs{
                        src="${unwatchedVideo[0].videoUrl}"
                    }
                }
            }
        }
    }
}