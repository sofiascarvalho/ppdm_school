package br.senai.sp.jandira.lionschool.screens

import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun CourserScreen(modifier: Modifier = Modifier) {


    Box(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 20.dp, start = 20.dp, end = 240.dp),
            horizontalArrangement = Arrangement.SpaceAround,

        ) {
            Image(
                painter = painterResource(
                    R.drawable.logo_lion_school
                ),
                contentDescription = stringResource(
                    R.string.logo
                ),
                modifier = Modifier
                    .size(70.dp)
            )
            Text(
                text = stringResource(
                    R.string.app_name
                ),
                fontSize = 18.sp,
                color = Color(0xff3347B0),
                fontWeight = FontWeight.Bold,
                lineHeight = 18.sp,
                modifier = Modifier.padding(top = 10.dp)
            )
        }
            Divider(
                modifier = Modifier
                    .padding(top = 12.dp, bottom = 17.dp)
                    .height(1.dp)
                    .width(320.dp),
                color = Color(0xffFFC23D)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {},
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color(0xff9E9FA4)
                    )
                },
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.padding(all = 20.dp)
                    .height(36.dp).width(322.dp)
            )
            Row {
                Image(
                    painter = painterResource(
                        R.drawable.list_courses
                    ),
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                )
                Text(
                    text = stringResource(
                        R.string.courses
                    )
                )
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun CourseScreenPreview() {
    CourserScreen()
}