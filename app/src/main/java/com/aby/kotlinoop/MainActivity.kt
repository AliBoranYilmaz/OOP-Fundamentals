package com.aby.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aby.kotlinoop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root // val = constant variable
        setContentView(view)

        var myUser = User("Boran", 20)
        println(myUser.age)
        println(myUser.name)
        println(myUser.information())

        var ali = Student("Ali", 21290295, 20)
        // ali.name = "Ahmet"
        // Cannot assign to 'name': the setter is private in 'Student' (encapsulation)

        // Inheritance: A mechanism that allows a class to inherit properties and behaviors from another class
        var ayse = SuperStudent("Ayse", 21240333, 19)
        println(ayse.name)
        ayse.study()

        // Static Polymorphism: It is achieved by creating multiple methods with the same name in the SAME CLASS
        // but with each one having different numbers of parameters or parameters of different data types
        var maths = Mathematics()
        maths.sum()
        maths.sum(1,3)
        maths.sum(2,5,8)

        // Dynamic Polymorphism: A process in which a function call to the overridden method is resolved at run time
        var animal = Animal()
        animal.sing()

        var dog = Dog()
        dog.test()
        dog.sing()

        // Abstract & Interface
        // var myPerson = People() - Cannot create an instance of an abstract class
        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName) // from HouseDecor interface
        myPiano.info() // from Instrument interface

        // Lambda Expressions
        val testString = {myString: String -> println(myString)}
        testString("Lambda Function is working..")

        val multiplyLambda = {a: Int, b: Int -> println(a*b)}
        multiplyLambda(4,56)

        val multiplyLambda2: (Int, Int) -> Unit = {a,b -> println(a*b)}
        multiplyLambda2(4,56)
        // multiplyLambda and multiplyLambda2 are exactly same
    }
}