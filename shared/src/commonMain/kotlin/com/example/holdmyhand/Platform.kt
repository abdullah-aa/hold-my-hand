package com.example.holdmyhand

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform