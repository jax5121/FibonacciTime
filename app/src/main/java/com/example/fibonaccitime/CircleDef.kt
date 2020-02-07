package com.example.fibonaccitime

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint

class CircleDef {
    var x: Float
    var y: Float
    var radius: Float
    var fill: Paint
    var stroke: Paint
    val strokeWidth: Float = 2f

    constructor(x:Float, y:Float, radius:Float) {
        this.x = x
        this.y = y
        this.radius = radius - this.strokeWidth
        this.fill = Paint().apply {
            color = Color.DKGRAY
            style = Paint.Style.FILL
        }
        this.stroke = Paint().apply {
            color = Color.GRAY
            style = Paint.Style.STROKE
            strokeWidth = this.strokeWidth
            strokeCap = Paint.Cap.ROUND
        }
    }

    fun setColour(h:Int, m:Int) {
        if (h == 1 && m == 1){
            //set paint to blue
            this.fill.color = Color.BLUE
            return
        }

        if (h == 1){
            //set paint to red
            this.fill.color = Color.RED
            return
        } else {
            this.fill.color = Color.DKGRAY
        }

        if (m == 1) {
            //set paint to green
            this.fill.color = Color.GREEN
            return
        } else {
            this.fill.color = Color.DKGRAY
        }
    }

    fun drawCircle(canvas: Canvas) {
        canvas.drawCircle(this.x, this.y, this.radius, this.fill)
        canvas.drawCircle(this.x, this.y, this.radius, this.stroke)
    }
}