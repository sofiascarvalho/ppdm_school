package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var nameState= remember {
        mutableStateOf("")
    }

    var isErrorState= remember {
        mutableStateOf("")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .padding(all = 2.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.logo_lion_school
                    ),
                    contentDescription = stringResource(
                        R.string.logo
                    ),
                    modifier = Modifier
                        .padding(top = 55.dp)
                        .align(Alignment.CenterVertically)
                        .size(190.dp)
                )
                Text(
                    text = stringResource(
                        R.string.app_name
                    ),
                    fontSize = 50.sp,
                    color = Color(0xff3347B0),
                    fontWeight = FontWeight.Bold,
                    lineHeight = 40.sp,
                    modifier = Modifier.padding(top = 35.dp)
                )
            }
            Text(
                text = stringResource(
                    R.string.favorite_course
                ),
                fontSize = 22.sp,
                color = Color(0xff3347B0),
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 100.dp)
            )
            Box(
                modifier = Modifier
                    .padding(top = 10.dp)
                    .height(5.dp)
                    .width(55.dp)
                    .clip(RoundedCornerShape(size = 16.dp))
                    .background(Color(0xffFFC23D))
            )
            Text(
                text = stringResource(
                    R.string.vocational_school
                ),
                fontSize = 15.sp,
                color = Color(0xff9E9FA4),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 60.dp)
            )
            Button(
                onClick = {},
                shape = RoundedCornerShape(12.dp),
                border = BorderStroke(2.dp, color = Color(0xff3347B0)),
                colors = ButtonDefaults.buttonColors(
                    Color(0xffFFC23D)
                ),
                modifier = Modifier.padding(top = 190.dp).width(300.dp)
            ) {
                Text(
                    text = stringResource(
                        R.string.get_started
                    ),
                    color = Color(0xff3347B0)
                )
            }
            Row(
                modifier = Modifier
                    .padding(top = 90.dp)
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.youtube
                    ),
                    contentDescription = stringResource(
                        R.string.youtube
                    ),
                    modifier = Modifier
                        .padding(end = 25.dp)
                        .size(40.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.twitter
                    ),
                    contentDescription = stringResource(
                        R.string.twitter
                    ),
                    modifier = Modifier
                        .padding(end = 25.dp)
                        .size(40.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.instagram
                    ),
                    contentDescription = stringResource(
                        R.string.instagram
                    ),
                    modifier = Modifier
                        .padding(end = 25.dp)
                        .size(40.dp)
                )
                Image(
                    painter = painterResource(
                        R.drawable.facebook
                    ),
                    contentDescription = stringResource(
                        R.string.facebook
                    ),
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    HomeScreen()
}