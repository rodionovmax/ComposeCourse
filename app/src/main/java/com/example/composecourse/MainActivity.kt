package com.example.composecourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecourse.ui.theme.ComposeCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth(0.5f)
//                    .requiredWidth(400.dp)
//                    .padding(top = 50.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
                    .padding(5.dp)
                    .border(10.dp, Color.Red)
                    .padding(10.dp)
            ) {
                Text(text = "Hello", modifier = Modifier
                    .offset(0.dp, 20.dp))
                Text(text = "Hello", modifier = Modifier
                    .border(5.dp, Color.Yellow)
                    .padding(5.dp)
                    .offset(20.dp, 20.dp)
                    .border(10.dp, Color.Black)
                    .padding(10.dp))
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Hello", modifier = Modifier.clickable {

                })
                Spacer(modifier = Modifier.height(50.dp))
                Text(text = "World")
            }
        }
    }
}
