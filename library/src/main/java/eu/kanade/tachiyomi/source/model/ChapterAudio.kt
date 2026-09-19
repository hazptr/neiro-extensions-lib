package eu.kanade.tachiyomi.source.model

@Suppress("unused")
data class ChapterAudio(
    val tracks: List<AudioTrack> = emptyList(),
    val cues: List<AudioCue> = emptyList(),
)

@Suppress("unused")
data class AudioTrack(val id: String, val url: String)

@Suppress("unused")
data class AudioCue(
    val trackId: String,
    val fromPageIndex: Int,
    val toPageIndex: Int,
    val priority: Int = 0,
)
