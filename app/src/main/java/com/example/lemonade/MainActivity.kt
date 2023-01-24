package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {

            }
        }
    }
}
@Preview
@Composable
fun LemonadeApp(){
    LemonadeWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
}

@Composable
fun LemonadeWithButtonAndImage(modifier: Modifier = Modifier){
    var result = 1

    val imageResource = when(result){
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        else -> R.drawable.lemon_restart
    }

    Column(modifier = modifier, 
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(imageResource), contentDescription = "test")
        Spacer(modifier = Modifier.height(16.dp))

    }

}
