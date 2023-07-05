package com.example.composecourse

interface Paginator<Key, Item> {
    suspend fun loadNextItems()
    fun reset()
}