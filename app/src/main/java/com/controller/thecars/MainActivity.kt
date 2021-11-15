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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.controller.thecars.ui.theme.GlassWhite
import com.controller.thecars.ui.theme.TheCarsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TheCarsTheme {
                // A surface container using the 'background' color from the theme
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.bg_gtr),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 250.dp),
                        contentScale = ContentScale.Crop
                    )
                    Surface(color = Color.Transparent,modifier = Modifier.fillMaxSize()) {
                        BaseLayout()
                    }
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
            .width(170.dp)
            .padding(horizontal = 30.dp, vertical = 20.dp)
            .background(Color.Transparent)
    ) {

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(110.dp, 60.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(15.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.up_arrow),
                contentDescription = "$btnName window up button",
                modifier = Modifier.size(30.dp)
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
                .size(110.dp, 60.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(15.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.down_arrow),
                contentDescription = "$btnName window down button",
                modifier = Modifier.size(30.dp)
            )
        }

        Spacer(
            modifier = Modifier
                .height(4.dp)
                .fillMaxWidth()
        )

        Text(
            text = btnName,
            color = Color.Black,
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
                .background(GlassWhite),
            horizontalArrangement = Arrangement.Center
        ) {
            UpDownBtns(btnName = "Front Left")
            UpDownBtns(btnName = "Front Right")
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(GlassWhite),
            horizontalArrangement = Arrangement.Center
        ) {
            UpDownBtns(btnName = "Rear Left")
            UpDownBtns(btnName = "Rear Right")
        }
    }
}


@Composable
fun HeaderImage() {

    Card(
        shape = RoundedCornerShape(0.dp, 0.dp, 20.dp, 20.dp)
    ) {
        Column {
            Spacer(modifier = Modifier.height(20.dp))
            Image(
                painter = painterResource(R.drawable.gtr),
                contentDescription = "Image of a Nissan GTR"
            )
        }
        Text(
            text = "Nissan GTR",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(15.dp)
        )
    }
}


@Composable
fun BaseLayout() {

    Column(
        modifier = Modifier
            .background(Color.Transparent)
    ) {
        HeaderImage()

        Column {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 20.dp, 20.dp, 0.dp),
                backgroundColor = GlassWhite
            ) {
                Text(
                    text = "Window Controls",
                    color = Color.Black,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .background(GlassWhite)
                        .padding(15.dp)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                backgroundColor = GlassWhite
            ) {
                WindowBtns()
            }
        }
        
    }
}
