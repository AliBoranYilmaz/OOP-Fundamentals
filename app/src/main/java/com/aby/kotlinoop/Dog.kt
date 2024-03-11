package com.aby.kotlinoop

class Dog : Animal()
{
    fun test()
    {
        super.sing() // super keyword refers to Animal class here
    }

    override fun sing()
    {
        println("Dog class..")
    }
}