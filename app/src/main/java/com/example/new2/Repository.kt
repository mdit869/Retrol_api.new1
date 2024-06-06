package com.example.new2

data class Repository(
    val id: Long,
    val name: String,
    val description: String?,
    val owner: Owner
)
