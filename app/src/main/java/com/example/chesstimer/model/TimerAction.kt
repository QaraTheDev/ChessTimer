package com.example.chesstimer.model

sealed class TimerAction {
    object Reset: TimerAction()
    object Pause: TimerAction()
    object TimeSet: TimerAction()
}
