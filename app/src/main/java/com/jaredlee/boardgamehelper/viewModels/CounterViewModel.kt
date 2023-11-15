package com.jaredlee.boardgamehelper.viewModels

import android.widget.TextView
import androidx.lifecycle.ViewModel

class CounterViewModel(): ViewModel() {
    fun add1(currNum: Int): Int{
        return currNum+1;
    }
    fun add5(currNum: Int): Int{
        return currNum+5;
    }
    fun add10(currNum: Int): Int{
        return currNum+10;
    }
    fun sub1(currNum: Int): Int{
        return currNum-1;
    }
    fun sub5(currNum: Int): Int{
        return currNum-5;
    }
    fun sub10(currNum: Int): Int{
        return currNum-10;
    }
}