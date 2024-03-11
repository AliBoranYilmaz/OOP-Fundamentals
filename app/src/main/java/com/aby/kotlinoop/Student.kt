package com.aby.kotlinoop

open class Student(name: String?, number: Int?, age: Int?) // Primary constructor
{
    // Encapsulation: A concept that protects any object's methods, data, and variables from misuse
    // by hiding them from other objects and limiting access to them.
    var name: String? = null
        private set
        get
    // Name property is public, it can be accessed from other classes
    // But its value can not be set because the setter visibility is private (encapsulation method)
    // Note: Getter visibility must be the same as property visibility

    var number: Int? = null
        private set
        get

    private var age: Int? = null // Making the property private is also an encapsulation method
}