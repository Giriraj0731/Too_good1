package com.example.too_good

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.TopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.too_good.ui.theme.Purple1
import com.example.too_good.ui.theme.Too_goodTheme
import com.example.too_good.ui.theme.Yellow1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Too_goodTheme {
                Myscreen()
            }
        }
    }
}

@Composable
fun Myscreen(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(26.dp)
                .height(250.dp),
            backgroundColor = Yellow1,
            elevation = 10.dp,
            shape = RoundedCornerShape(30.dp)

        ){
            Column {
                Myrow1()
                Myrow2()
            }
        }
    }
}

@Composable
fun Myrow2(){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.Bottom


    ){
        Image(painter = painterResource(id = R.drawable.android_logo),
            contentDescription ="android logo" )

        Text(text = "Just go with the flow",
            fontSize = 20.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(17.dp))




    }
}



@Composable
fun Myrow1(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Hi \n Giriraj Baheti",
            fontSize = 25.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,


            )
        Spacer(modifier = Modifier.padding(16.dp))

        Image(painter = painterResource(id = R.drawable.gdsc_logo),
            contentDescription ="gdsc logo" )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Too_goodTheme {
        Myscreen()


    }
}