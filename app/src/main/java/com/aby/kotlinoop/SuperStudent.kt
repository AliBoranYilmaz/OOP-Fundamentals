package com.aby.kotlinoop

class SuperStudent(name: String?, number: Int?, age: Int?) : Student(name, number, age) // Inheritance
{
    fun study()
    {
        println("I'm studying engineering..")
    }
}