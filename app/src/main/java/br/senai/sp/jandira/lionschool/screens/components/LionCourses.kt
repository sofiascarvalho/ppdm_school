package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun LionCourses(
    acronym: String,
    course: String,
    description: String,
    week: String,
    image:Painter
) {
    Card(
        modifier = Modifier
            .size(300.dp, 180.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.horizontalGradient(
                        listOf(Color(0xff3347B0), Color(0xffCFD4EA))
                    )
                )
        ){
            Box(
                modifier = Modifier
                    .height(75.dp)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(Color(0xff3347B0), Color(0xffCFD4EA))
                        )
                    )
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.Top
                ) {
                    Image(
                        image,
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .size(100.dp)
                    )
                    Text(
                        text = acronym,
                        textAlign = TextAlign.Center,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xffFFC23D),
                        modifier = Modifier.padding(top = 4.dp)
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = course,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = description,
                    fontSize = 12.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(24.dp)
                        .padding(6.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "",
                        tint = Color(0xffFFC23D),
                        modifier = Modifier.size(14.dp)
                    )
                    Text(
                        text = week,
                        fontSize = 6.sp,
                        color = Color.White,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }
            }
        }
    }

    Spacer(modifier = Modifier.height(16.dp))
}

/*@Preview
@Composable
private fun LionCoursesPreview() {
    LionCourses()
}*/
