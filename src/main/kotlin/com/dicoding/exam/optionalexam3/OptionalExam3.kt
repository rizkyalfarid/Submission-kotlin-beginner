package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    val matchResult = Regex("\\d+").find(str)
    return matchResult?.let {
        str.replace(it.value, (it.value.toInt() * int).toString())
    } ?: "$str$int"
}


