package com.dicoding.exam.exam2

// TODO 1
fun calculate(valueA: Int, valueB: Int, valueC: Int ?= 50) = valueA + (valueB - (valueC ?: 50))


// TODO 2
fun result(result: Int) = "Result is $result"
