package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun LionStudents(
    name:String="",
    registration:String=""
) {
    Card (
        shape = RoundedCornerShape(5.dp)
    ){
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Card (
                modifier = Modifier
                    .size(10.dp, 45.dp),
                shape = RectangleShape,
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xff3347B0)
                    )
            ){  }

            Card (
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth(),
                shape = RectangleShape,
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xff9FA9E1)
                    )
            ){
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Column (
                        modifier = Modifier
                            .padding(8.dp)
                            .size(200.dp, 35.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(text = "luana oliveira dias")
                        Text(text = "20151001018")
                    }
                    Text(text = "2022")
                }
            }
        }
    }
}

@Preview
@Composable
private fun LionCoursesPreview() {
    LionStudents()
}
