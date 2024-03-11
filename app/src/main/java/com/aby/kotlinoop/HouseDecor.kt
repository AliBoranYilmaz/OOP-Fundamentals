package com.aby.kotlinoop

interface HouseDecor
{
    // 100% Abstract
    // Kotlin -> You CANNOT initialize properties of interfaces
    // Java -> You HAVE TO initialize properties of interfaces

    var roomName: String
}