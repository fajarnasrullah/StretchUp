package com.fajarnasrullah.stretchup.presentation.home


import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fajarnasrullah.stretchup.R
import com.fajarnasrullah.stretchup.data.Exercise
import com.fajarnasrullah.stretchup.data.ExerciseUser
import com.fajarnasrullah.stretchup.data.User
import com.fajarnasrullah.stretchup.ui.theme.Background
import com.fajarnasrullah.stretchup.ui.theme.PrimaryDark
import com.fajarnasrullah.stretchup.ui.theme.TextPrimary

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    user: User,
    exerciseUser: ExerciseUser
) {

    val cardGradient = Brush.linearGradient(colors = listOf(
        Background,
        PrimaryDark,
        Background
    ))

    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { innerPading ->
        Column(

            verticalArrangement = Arrangement.spacedBy(15.dp),
            modifier = modifier
                .fillMaxSize()
                .padding(innerPading)
        ) {
           

            UserTopSection(user)

            TodayExercise(exerciseUser)
        }
    }

}

@Composable
fun TodayExercise(
    exerciseUser: ExerciseUser,
    modifier: Modifier = Modifier,
) {


    Card(

        shape = MaterialTheme.shapes.large,
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.1f)
        ),
        border = BorderStroke(width = 1.dp, color = Color.White),
        modifier = Modifier
            .fillMaxWidth(),

        ) {

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.Center as Alignment.Horizontal,
            modifier = Modifier.padding(15.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = "Your Exercise Today",
                    style = MaterialTheme.typography.bodyMedium,
                    color = TextPrimary
                )

                IconButton(
                    onClick = {

                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.MoreHoriz,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }

            HorizontalDivider(
                modifier = Modifier.fillMaxWidth(),
                thickness = 1.dp,
                color = Color.White
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        border = BorderStroke(
                            width = 0.dp,
                            color = Color.White
                        ), shape = MaterialTheme.shapes.large
                    )

            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier.padding(10.dp)
                ) {

                    Image(
                        painter = painterResource(R.drawable.preview),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .clip(shape = MaterialTheme.shapes.medium)
                    )

                    Column(
                        verticalArrangement = Arrangement.spacedBy(5.dp),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = exerciseUser.exercise.category,
                            style = MaterialTheme.typography.labelMedium,
                            color = PrimaryDark
                        )
                        Text(
                            text = exerciseUser.exercise.title,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.SemiBold,
                            color = TextPrimary
                        )
                        Text(
                            text = exerciseUser.exercise.author,
                            fontSize = 10.sp,
                            color = MaterialTheme.colorScheme.outline
                        )

                        LazyRow() {
                            items(count = exerciseUser.exercise.detail.size) { count ->

                                exerciseUser.exercise.detail[count].let { item ->
                                    Text(
                                        text = item,
                                        fontSize = 10.sp,
                                        color = TextPrimary
                                    )
                                }
                            }
                        }

                        LazyRow(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            items(count = exerciseUser.exercise.focus.size) { count ->

                                exerciseUser.exercise.focus[count].let { item ->

                                    Surface(
                                        modifier = Modifier
                                            .padding(5.dp)
                                            .height(35.dp),
                                        shape = MaterialTheme.shapes.extraSmall,
                                        color = Color.White.copy(alpha = 0.1f)
                                    ) {
                                        Text(
                                            text = item,
                                            fontSize = 10.sp,
                                            color = TextPrimary
                                        )
                                    }
                                }
                            }
                        }
                    }

                }

            }

        }
    }

}


@Composable
fun UserTopSection(
    user: User,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Card(
                modifier = Modifier
                    .size(35.dp),
                shape = CircleShape,
                border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.outline)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                )
            }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Good Morning",
                    style = MaterialTheme.typography.labelSmall,
                    color = TextPrimary
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = user.name,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
            }

        }

        Image(
            painter = painterResource(R.drawable.notif_icon),
            contentDescription = "",
            modifier = Modifier.size(25.dp)
        )
    }
}


@Composable
fun WeeklySection(
    modifier: Modifier = Modifier,
    exerciseUser: ExerciseUser
) {

    val progress by animateFloatAsState(
        targetValue = 0.22f,
        animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
    )

    Column(
        verticalArrangement = Arrangement.spacedBy(15.dp),
        horizontalAlignment = Alignment.Center as Alignment.Horizontal,
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Weekly Target",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.SemiBold
            )

            Surface(
                shape = MaterialTheme.shapes.small,
                color =  Color.White.copy(alpha = 0.2f),
                modifier = Modifier.padding(horizontal = 10.dp, vertical = 5.dp)
            ) {
                Text(
                    text = "21/04 - 27/04"
                )
            }

        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .height(55.dp)
                .clip(shape = MaterialTheme.shapes.large)
                .border(width = 1.dp, shape = MaterialTheme.shapes.large, color = MaterialTheme.colorScheme.outline)
        ) {


            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(progress)
                    .clip(RoundedCornerShape(50.dp))
                    .background(PrimaryDark)
            ) {
                Text(
                    text = ""
                )
            }

        }



    }

}

@Preview
@Composable
private fun CekHome() {
    _root_ide_package_.com.fajarnasrullah.stretchup.ui.theme.StretchUpTheme() {
        HomeScreen(
            user = User(
                "Fajar Nasrullah",
                imgUrl = "",
                location = ""
            ),
            exerciseUser = ExerciseUser(
                userId = "",
                exerciseId = "",
                exercise = Exercise(
                    "",
                    "Beginner Ballistic Stretching",
                    "Noah Sebastian",
                    "Routine",
                    listOf("5 min", "3 sets", "10 sec rest"),
                    listOf("Core", "Knee", "Shoulder", "Back")
                ),
                time = ""
            )
        )
    }

}