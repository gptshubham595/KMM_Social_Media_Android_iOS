package com.example.kmmsocial.android.common.component

import androidx.annotation.StringRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import com.example.kmmsocial.android.R
import com.example.kmmsocial.android.common.theming.Gray
import com.example.kmmsocial.android.common.theming.SocialAppTheme

@Composable
fun CustomTextView(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    keyBoardType: KeyboardType = KeyboardType.Text,
    isPasswordTextField: Boolean = false,
    isSingleLine: Boolean = false,
    @StringRes hint: Int //R.string.hint
) {
    val backgroundColor = if (isSystemInDarkTheme()) {
        MaterialTheme.colorScheme.surface
    } else Gray

    var isPasswordVisible by remember {
        mutableStateOf(false)
    }

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        textStyle = MaterialTheme.typography.bodyMedium,
        placeholder = {
            Text(
                text = stringResource(id = hint),
                style = MaterialTheme.typography.bodyMedium,
            )
        },
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyBoardType),
        singleLine = isSingleLine,
        colors = TextFieldDefaults.colors(
            //setting the text field background when it is focused
            focusedContainerColor = backgroundColor,

            //setting the text field background when it is unfocused or initial state
            unfocusedContainerColor = backgroundColor,

            //setting the text field background when it is disabled
            disabledContainerColor = backgroundColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
        ),
        trailingIcon = if (isPasswordTextField) {
            {
                PasswordEyeIcon(isPasswordVisible) {
                    isPasswordVisible = !isPasswordVisible
                }
            }
        } else null,
        visualTransformation = if (isPasswordTextField && !isPasswordVisible) {
            PasswordVisualTransformation()
        } else VisualTransformation.None,
        shape = MaterialTheme.shapes.medium
    )
}

@Composable
fun PasswordEyeIcon(
    isPasswordVisible: Boolean,
    onPasswordVisibilityToggle: () -> Unit
) {
    val image = if (isPasswordVisible)
        painterResource(id = R.drawable.show_eye_icon_filled)
    else
        painterResource(id = R.drawable.hide_eye_icon_filled)

    IconButton(onClick = onPasswordVisibilityToggle) {
        Icon(
            painter = image,
            contentDescription = null,
        )
    }
}

@Composable
@Preview
fun CustomTextFieldPreview() {
    SocialAppTheme {
        CustomTextView(
            value = "",
            onValueChange = {},
            hint = androidx.compose.ui.R.string.default_error_message
        )
    }
}