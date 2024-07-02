package com.example.kmmsocial.android.presentation.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kmmsocial.android.R
import com.example.kmmsocial.android.common.theming.ButtonHeight
import com.example.kmmsocial.android.common.theming.ExtraLargeSpacing
import com.example.kmmsocial.android.common.theming.LargeSpacing
import com.example.kmmsocial.android.common.theming.MediumSpacing
import com.example.kmmsocial.android.common.component.CustomTextView
import com.example.kmmsocial.android.core.domain.auth.models.DataChange
import com.example.kmmsocial.android.core.domain.auth.models.LoginDateChange
import com.example.kmmsocial.android.core.domain.auth.models.LoginUiState

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        uiState = LoginUiState(
            email = "",
            password = "123456",
        ),
        onDataChange = {}
    )
}

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    uiState: LoginUiState,
    onDataChange: (LoginDateChange) -> Unit,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                color =
                if (isSystemInDarkTheme())
                    MaterialTheme.colorScheme.background
                else
                    MaterialTheme.colorScheme.surface
            )
            .padding(
                top = ExtraLargeSpacing + LargeSpacing,
                start = LargeSpacing + MediumSpacing,
                end = LargeSpacing + MediumSpacing,
                bottom = LargeSpacing
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(LargeSpacing)
    ) {
        CustomTextView(
            value = uiState.email,
            onValueChange = {
                onDataChange(
                    LoginDateChange(
                        changeParam = DataChange.EMAIL,
                        value = it
                    )
                )
            },
            hint = R.string.email_hint,
            keyBoardType = KeyboardType.Email
        )
        CustomTextView(
            value = uiState.password,
            onValueChange = {
                onDataChange(
                    LoginDateChange(
                        changeParam = DataChange.PASSWORD,
                        value = it
                    )
                )
            },
            hint = R.string.password_hint,
            isPasswordTextField = true,
            keyBoardType = KeyboardType.Password
        )
        Button(
            onClick = { /*TODO*/ },
            modifier = modifier
                .fillMaxWidth()
                .height(ButtonHeight),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 0.dp,
            ),
            shape = MaterialTheme.shapes.medium,
        ) {
            Text(
                text = stringResource(id = R.string.login_button_label),
            )
        }

    }
}
