data class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Array<Attachment>? = emptyArray(),
    val thread: Any,
    val postId: Int
) {
    val parentsStack = emptyArray<Comment>()
}
