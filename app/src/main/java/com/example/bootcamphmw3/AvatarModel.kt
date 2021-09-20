package com.example.bootcamphmw3

import java.io.Serializable

data class AvatarModel(
    val viewType: Int,
    val string: String?,
    val avatarId: Int?
) : Serializable
