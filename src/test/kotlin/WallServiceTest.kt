import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun should_add() {
        val service = WallService

        val result = service.add(
            Post(
                1, 1, 1, 1, 2004,
                "Hello", 1, 1, false,
                Comments(1, true, true, true, true),
                Copyright(1, "", "name", "type"),
                Likes(1, true, true, true),
                Reposts(1, true), View(1), "post", 1,
                PostSource("", "", "", ""),
                Geo(
                    "", "", Place(
                        1, "", 12, 17,
                        1, "", 1, 2, 8, 5, 1, ""
                    )
                ), copyHistory = null,
                Donut(
                    true, 480, 4,
                    false, ""
                ),
                true, true, true, false,
                true, false, 1
            )
        )

        assertNotEquals(0, result.id)
    }

    @Test
    fun update_existing_true() {
        val service = WallService
        service.add(
            Post(
                1, 1, 1, 1, 2004,
                "Hello", 1, 1, false,
                Comments(1, true, true, true, true),
                Copyright(1, "", "name", "type"),
                Likes(1, true, true, true),
                Reposts(1, true), View(1), "post", 1,
                PostSource("", "", "", ""),
                Geo(
                    "", "", Place(
                        1, "", 12, 17,
                        1, "", 1, 2, 8, 5, 1, ""
                    )
                ), copyHistory = null,
                Donut(
                    true, 480, 4,
                    false, ""
                ),
                true, true, true, false,
                true, false, 1
            )
        )
        service.add(
            Post(
                1, 1, 1, 1, 2004,
                "Hello", 1, 1, false,
                Comments(1, true, true, true, true),
                Copyright(1, "", "name", "type"),
                Likes(1, true, true, true),
                Reposts(1, true), View(1), "post", 1,
                PostSource("", "", "", ""),
                Geo(
                    "", "", Place(
                        1, "", 12, 17,
                        1, "", 1, 2, 8, 5, 1, ""
                    )
                ), copyHistory = null,
                Donut(
                    true, 480, 4,
                    false, ""
                ),
                true, true, true, false,
                true, false, 1
            )
        )

        val update = Post(
            1, 1, 1, 1, 2104,
            "Hello", 1, 1, false,
            Comments(1, true, true, true, true),
            Copyright(1, "", "name", "type"),
            Likes(1, true, true, true),
            Reposts(1, true), View(1), "post", 1,
            PostSource("", "", "", ""),
            Geo(
                "", "", Place(
                    1, "", 12, 17,
                    1, "", 1, 2, 8, 5, 1, ""
                )
            ), copyHistory = null,
            Donut(
                true, 480, 4,
                false, ""
            ),
            true, true, true, false,
            true, false, 1
        )

        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun update_existing_false() {
        val service = WallService
        service.add(
            Post(
                1, 1, 1, 1, 2004,
                "Hello", 1, 1, false,
                Comments(1, true, true, true, true),
                Copyright(1, "", "name", "type"),
                Likes(1, true, true, true),
                Reposts(1, true), View(1), "post", 1,
                PostSource("", "", "", ""),
                Geo(
                    "", "", Place(
                        1, "", 12, 17,
                        1, "", 1, 2, 8, 5, 1, ""
                    )
                ), copyHistory = null,
                Donut(
                    true, 480, 4,
                    false, ""
                ),
                true, true, true, false,
                true, false, 1
            )
        )
        service.add(
            Post(
                1, 1, 1, 1, 2004,
                "Hello", 1, 1, false,
                Comments(1, true, true, true, true),
                Copyright(1, "", "name", "type"),
                Likes(1, true, true, true),
                Reposts(1, true), View(1), "post", 1,
                PostSource("", "", "", ""),
                Geo(
                    "", "", Place(
                        1, "", 12, 17,
                        1, "", 1, 2, 8, 5, 1, ""
                    )
                ), copyHistory = null,
                Donut(
                    true, 480, 4,
                    false, ""
                ),
                true, true, true, false,
                true, false, 1
            )
        )

        val update = Post(
            2, 1, 1, 1, 2104,
            "Hello", 1, 1, false,
            Comments(1, true, true, true, true),
            Copyright(1, "", "name", "type"),
            Likes(1, true, true, true),
            Reposts(1, true), View(1), "post", 1,
            PostSource("", "", "", ""),
            Geo(
                "", "", Place(
                    1, "", 12, 17,
                    1, "", 1, 2, 8, 5, 1, ""
                )
            ), copyHistory = null,
            Donut(
                true, 480, 4,
                false, ""
            ),
            true, true, true, false,
            true, false, 1
        )

        val result = service.update(update)
        assertFalse(result)
    }
}