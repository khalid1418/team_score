package com.example.team_score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {

    private var _score = 0

    val score:Int get() = _score
    init {
        Log.d("GameFragment","GameViewModel created")


    }

    override fun onCleared() {
        super.onCleared()
        Log.d("GameFragment", "GameviewModel destroyed")
    }



     fun Plus(){
       var score1= _score ++
    }
     fun plus2(){
        _score +=4
    }
     fun subtract(){
        if (_score==0){
            _score = 0
        }else if (_score  == 1){
            _score = 0

        }else _score -=2
    }








}