package com.example.chesstimer

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.chesstimer.theme.ChessTimerTheme
import com.example.chesstimer.theme.GrayLight
import com.example.chesstimer.theme.Orange
import com.example.chesstimer.theme.Typography

@Composable
fun TimerView(
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 5.dp
) {
    Box(modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(GrayLight)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(315.dp)
                        .align(CenterVertically)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Orange)
                ) {
                    Text(
                        text = "1:00",
                        color = Color.White,
                        style = Typography.h2,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.rotate(180f)
                    )
                }
            }

//--------------------------------------------------------------------------------

            Row(
                modifier = Modifier.padding(5.dp, 30.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Button(
                    modifier = Modifier
                        .padding(15.dp, 0.dp)
                        .size(100.dp, 50.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(GrayLight)
                ) {
                    Icon(
                        Icons.Default.Refresh,
                        contentDescription = "Pause",
                        modifier = Modifier.size(ButtonDefaults.IconSize),
                        tint = Color.White
                    )
                }

                Button(
                    modifier = Modifier
                        .padding(15.dp, 0.dp)
                        .size(100.dp, 50.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(GrayLight)
                ) {
                    Icon(
                        Icons.Default.PlayArrow,
                        contentDescription = "Pause",
                        modifier = Modifier.size(ButtonDefaults.IconSize),
                        tint = Color.White
                    )
                }

                Button(
                    modifier = Modifier
                        .padding(15.dp, 0.dp)
                        .size(100.dp, 50.dp),
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(GrayLight)
                ) {
                    Icon(
                        Icons.Default.Edit,
                        contentDescription = "Pause",
                        modifier = Modifier.size(ButtonDefaults.IconSize),
                        tint = Color.White
                    )
                }
            }


//--------------------------------------------------------------------------------

            Row(
                modifier = Modifier.fillMaxWidth().wrapContentHeight(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Bottom) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(315.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.DarkGray)
                ) {
                    Text(
                        text = "1:00",
                        color = Color.White,
                        style = Typography.h2,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ChessTimerTheme {
        TimerView()
    }
}