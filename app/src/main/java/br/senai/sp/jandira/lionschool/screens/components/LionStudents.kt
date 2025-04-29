package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
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
import java.time.Year

@Composable
fun LionStudents(
    name:String,
    registration:String,
    year: String,
    bulletcolor:Color,
    image:Painter
) {
    Card (
        shape = RoundedCornerShape(5.dp)
    ){
        Row (
            modifier = Modifier
                .size(350.dp, 70.dp).background(Color(0xff9FA9E1)),
            verticalAlignment = Alignment.CenterVertically
        ){
            Card (
                modifier = Modifier
                    .size(10.dp, 71.dp),
                shape = RectangleShape,
                colors = CardDefaults.cardColors(
                    containerColor = bulletcolor
                )
            ){  }
            Card (
                modifier = Modifier
                    .padding(start = 5.dp)
                    .size(26.dp),
                shape = CircleShape
            ){
                Image(
                    image,
                    contentDescription = "",
                    modifier = Modifier.size(26.dp)
                )
            }

            Card (
                modifier = Modifier
                    .height(45.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(30.dp),
                colors = CardDefaults
                    .cardColors(
                        containerColor = Color(0xff9FA9E1)
                    )
            ){
                Row (modifier = Modifier
                    .padding(8.dp)
                    .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End
                ){
                    Column (
                        modifier = Modifier
                            .fillMaxHeight()
                            .size(310.dp, 35.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(text = name)
                        Image(
                            painter = painterResource(
                                R.drawable.cartao
                            ),
                            contentDescription = ""
                        )
                        Text(text = registration)
                    }
                    Icon(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = "",
                        tint = Color(0xffffffff)
                    )
                    Text(text = year)
                }
            }
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
}

/*@Preview
@Composable
private fun LionCoursesPreview() {
    LionStudents()
}*/
