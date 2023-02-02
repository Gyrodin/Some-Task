package com.gyrodin.android.a4dlviewer

class Storage(val url: String) {
    private var history = arrayListOf<PostGif>()
    private var currentIndex: Int = 0

    fun getCategory(): String = url

    fun add(gifPost: PostGif) = history.add(gifPost)

    fun current(): PostGif = history[currentIndex]

    fun next(): PostGif {
        currentIndex = Math.min(lastIndex(), currentIndex + 1)
        return history[currentIndex]
    }

    fun prev(): PostGif {
        currentIndex = Math.max(0, currentIndex - 1)
        return history[currentIndex]
    }

    fun size(): Int = history.size

    fun empty(): Boolean {
        return history.size == 0
    }

    fun isAtStart(): Boolean {
        return currentIndex == 0
    }

    fun isAtEnd(): Boolean {
        return currentIndex == lastIndex()
    }

    private fun lastIndex(): Int = history.size - 1
}