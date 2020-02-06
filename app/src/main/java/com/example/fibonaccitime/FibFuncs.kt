package com.example.fibonaccitime

val FIB_SEQUENCE: IntArray = intArrayOf(1,1,2,3,5,8,13,21,34)

fun fibonacciConvert(input:Int):IntArray
{
    var output = input
    var timeDisplay:IntArray = intArrayOf(0,0,0,0,0,0,0,0,0)
    var i:Int = FIB_SEQUENCE.size-1
    while(i >= 0) {
        if(output == 1) {
            timeDisplay[0] = 1
            break;
        }

        if (output >= FIB_SEQUENCE[i]) {
            timeDisplay[i] = 1
            output -= FIB_SEQUENCE[i]
            if (output==0) break
        }

        i--;
    }
    return timeDisplay
}

fun fibonacciString(input:IntArray):String {
    var temp = input
    var output = "["
    var i = 0
    while (i < temp.size) {
        output += temp[i].toString()
        i++
        if (i != temp.size) output+= ","
    }
    output += "]"
    return output
}