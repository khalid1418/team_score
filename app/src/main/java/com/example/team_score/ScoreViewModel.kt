package com.example.team_score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {

    private val _score = MutableLiveData(0)

    val score:LiveData<Int> get() = _score




     fun Plus(){
         _score.value = _score.value?.plus(1)
    }
     fun plus2(){
        _score.value = _score.value?.plus(4)
    }
     fun subtract(){
        if (_score.value!! <=0){
            _score.value = 0
        }else if (_score.value  == 1){
            _score .value= 0

        }else _score.value = _score.value?.minus(2)
    }








}