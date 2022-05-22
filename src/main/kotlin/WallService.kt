object WallService {
    private var posts = emptyArray<Post>()
    private var postId = 1
    private var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        val postAdd = post.copy(id = post.id)
        posts += postAdd
        postId++
        return posts.last()
    }

    fun update(postUpdate: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (postUpdate.id == post.id) {
                posts[index] = postUpdate.copy(
                    ownerId = posts[index].ownerId,
                    date = posts[index].date
                )
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment) {
        for (post in posts) {
            if (post.id == comment.postId) {
                comments += comment
            }
        }
    }
}
