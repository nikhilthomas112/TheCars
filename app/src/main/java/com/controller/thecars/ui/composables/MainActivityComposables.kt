package com.controller.thecars.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.controller.thecars.R

class MainActivityComposables {

    @Composable
    @Preview
    fun UpDownBtns() {
        Column() {

            Button(
                onClick = { /*TODO*/ }
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "Window up button"
                )
            }

            Spacer(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth()
            )
        }
    }
}