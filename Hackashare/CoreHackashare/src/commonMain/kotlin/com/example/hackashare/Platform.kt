package com.example.hackashare

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform