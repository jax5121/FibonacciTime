package com.example.fibonaccitime

//val FIB_SEQUENCE_old: IntArray = intArrayOf(1,1,2,3,5,8,13,21,34)
val FIB_SEQUENCE: IntArray = intArrayOf(34,21,13,8,5,3,2,1,1)

fun fibonacciConvert(input:Int):IntArray {
    var output = input
    var timeDisplay:IntArray = intArrayOf(0,0,0,0,0,0,0,0,0)
    var i = 0
    while(i < FIB_SEQUENCE.size) {
        if(output == 1) {
            timeDisplay[FIB_SEQUENCE.size-1] = 1
            break
        }

        if (output >= FIB_SEQUENCE[i]) {
            timeDisplay[i] = 1
            output -= FIB_SEQUENCE[i]
            if (output==0) break
        }

        i++;
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