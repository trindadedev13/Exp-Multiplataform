package dev.trindadedev.exp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform