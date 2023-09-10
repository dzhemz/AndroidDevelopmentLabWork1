package com.example.labwork1

import android.annotation.SuppressLint
import android.view.View
import android.widget.EditText
import android.widget.TextView

object Logic {

    fun action(str: String): String {
        val result = str.split(" ")
        return result.zip(result.indices)
            .filter{ it.first == "0" }
            .unzip()
            .second
            .map { it.toString() }
            .joinToString()

    }

}