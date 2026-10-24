package app.brittlabs.licenseui.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.brittlabs.licenseui.R
import app.brittlabs.licenseui.model.LicenseInfo


@Composable
fun LicenseItem(
    license: LicenseInfo,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clip(
                shape = RoundedCornerShape(16.dp)
            )
            .clickable(
                onClick = {
                    expanded = !expanded
                },
                indication = null,
                interactionSource = null
            ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        ListItem(
            modifier = Modifier.fillMaxWidth(),
            headlineContent = {
                Text(text = license.name)
            },
            supportingContent = {
                if (license.author != null) {
                    Text(text = license.author)
                }
            },
            trailingContent = {
                Icon(
                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp
                    else Icons.Default.KeyboardArrowDown,
                    contentDescription = null
                )
            }
        )
        if (expanded){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 8.dp,
                        bottom = 8.dp,
                        start = 16.dp,
                        end = 16.dp
                    )
                    .background(
                        color = Color.Black
                    )
                    .padding(all = 6.dp)
            ) {
                SelectionContainer() {
                    Text(
                        modifier = Modifier.fillMaxSize(),
                        text = license.licenseText,
                        textAlign = TextAlign.Start
                    )
                }
            }
        }
    }

}


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
private fun ListItemPreview() {
    LicenseItem(
        LicenseInfo(
            name = "Android",
            author = "The Android Open Source Project",
            licenseType = "Apache V2",
            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
        )
    )
}