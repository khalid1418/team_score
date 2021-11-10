package com.example.team_score

import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {

    private var _score = 0

    val score:Int get() = _score

     fun Plus(){
        _score ++
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