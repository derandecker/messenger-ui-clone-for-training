package com.derandecker.fbmessengeruiclone.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.derandecker.fbmessengeruiclone.R
import com.derandecker.fbmessengeruiclone.data.chatListItems
import com.derandecker.fbmessengeruiclone.utils.customTimeFormatter
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

val defaultTimeFormatter: DateTimeFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a")

@CombinedPreviews
@Composable
fun ChatScreenPreview() {
    ChatScreen(navController = rememberNavController())
}

@Composable
fun ChatScreen(navController: NavController) {
    /* TODO (last) */
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBox(
    modifier: Modifier = Modifier
) {
    /* TODO */
}

@Composable
fun ProfilePic(@DrawableRes profilePicture: Int) {
    /* TODO */
}

@Composable
fun RecentContactItem(@DrawableRes profilePicture: Int, name: String) {
    /* TODO */
}

@Composable
fun RecentContactsList(modifier: Modifier) {
    /* TODO */
}

@Composable
fun ChatItem(
    name: String,
    message: String,
    time: LocalDateTime,
    @DrawableRes profilePicture: Int
) {
    /* TODO */
}

@Composable
fun ChatList(modifier: Modifier) {
    /* TODO */
}
