package com.aby.kotlinoop

class User : People
{
    // Property: Objects of this class can have these properties
    var name: String? = null
    var age: Int? = null

    // Constructor: The first function called when an object is created from this class
    constructor(nameInput: String, ageInput: Int)
    {
        this.name = nameInput
        this.age = ageInput
        println("User created")
    }

    // Initializer
    init
    {
        println("Initializer")
    }
}