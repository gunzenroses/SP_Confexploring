import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import kotlin.browser.window


external interface VideoListProps: RProps {
    var videos: List<Video>
    var selectedVideo: Video?
    var onSelectVideo: (Video)->Unit
}



class VideoList: RComponent<VideoListProps, RState>(){
    override fun RBuilder.render(){
        for (video in props.videos){
            p{
                this.key=video.id.toString()
                this.attrs {
                    onClickFunction = {
                        props.onSelectVideo(video)
                    }
                }
                if (video==props.selectedVideo){
                    +"▶"
                }
                +"${video.speaker}: ${video.title}"
            }
        }
    }
}

fun RBuilder.videoList(handler: VideoListProps.() -> Unit): ReactElement {
    return child(VideoList::class) {
        this.attrs(handler)
    }
}