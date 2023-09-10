package com.example.labwork1

object Logic {

    fun action(str: String): String {
        val result = str.split(" ")
        return result.zip(result.indices)
            .filter { it.first == "0" }
            .unzip()
            .second.joinToString { it.toString() }
    }

}