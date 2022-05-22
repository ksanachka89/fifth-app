interface Attachment {
    val type: String
}

data class VideoAttachment(override val type: String = "video", val video: Video) : Attachment
data class AudioAttachment(override val type: String = "audio", val audio: Audio) : Attachment
data class PhotoAttachment(override val type: String = "photo", val photo: Photo) : Attachment
data class FileAttachment(override val type: String = "file", val file: File) : Attachment
data class StickerAttachment(override val type: String = "sticker", val sticker: Sticker) : Attachment


data class Video(
    val id: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val height: Int,
    val url: String,
    val width: Int,
    val withPadding: Boolean,
    val date: Int,
    val adding_date: Int,
)

data class Audio(
    val id: Int,
    val owner_id: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val lyricsId: Int,
    val albumId: Int,
    val genreId: Int,
    val date: Int,
    val noSearch: Boolean,
    val is_hq: Boolean
)

data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val width: Int,
    val height: Int
)

data class File(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val type: String,
    val url: String,
    val width: Int,
    val height: Int
)

data class Sticker(
    val product_id: Int,
    val sticker_id: Int,
    val url: String,
    val width: Int,
    val height: Int,
    val animation_url: String,
    val isAllowed: Boolean
)