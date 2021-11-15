package com.controller.thecars

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.controller.thecars.ui.theme.GlassBlack
import com.controller.thecars.ui.theme.Shapes
import com.controller.thecars.ui.theme.TheCarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheCarsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    BaseLayout()
                }
            }
        }
    }
}




@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TheCarsTheme {
        //Greeting("Android")
        WindowBtns()
    }
}


@Composable
fun UpDownBtns(btnName: String) {
    Column(
        modifier = Modifier
            .width(150.dp)
            .padding(30.dp)
            .background(Color.Transparent)
    ) {

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(90.dp, 100.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(15.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.up_arrow),
                contentDescription = "$btnName window up button",
                modifier = Modifier.size(50.dp)
            )
        }

        Spacer(
            modifier = Modifier
                .height(2.dp)
                .fillMaxWidth()
        )

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(90.dp, 100.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(15.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.down_arrow),
                contentDescription = "$btnName window down button",
                modifier = Modifier.size(50.dp)
            )
        }

        Spacer(
            modifier = Modifier
                .height(4.dp)
                .fillMaxWidth()
        )

        Text(
            text = btnName,
            color = Color.White,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}


@Composable
fun WindowBtns() {
    Column(
        modifier = Modifier
            .wrapContentSize()
            .fillMaxWidth(),

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(GlassBlack),
            horizontalArrangement = Arrangement.Center
        ) {
            UpDownBtns(btnName = "Front Left")
            UpDownBtns(btnName = "Front Right")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(GlassBlack),
            horizontalArrangement = Arrangement.Center
        ) {
            UpDownBtns(btnName = "Rear Left")
            UpDownBtns(btnName = "Rear Right")
        }
    }
}


@Composable
fun BaseLayout() {
    Column {
        Text(
            text = "Controls",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp,bottom = 15.dp),
            color = Color.Black,
            fontSize = 60.sp
        )

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            WindowBtns()
        }
        
    }
}
