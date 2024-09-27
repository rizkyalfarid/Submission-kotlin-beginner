package com.dicoding.exam.optionalexam1

// TODO
fun sumOfBigThree(vararg numbers: Int): Int {
    if (numbers.size < 3) return numbers.sum()
    return numbers.sortedDescending().take(3).sum()
}
