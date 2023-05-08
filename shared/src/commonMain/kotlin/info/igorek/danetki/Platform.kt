package info.igorek.danetki

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform