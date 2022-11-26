package com.keyflare.exchange.designSystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.keyflare.exchange.designSystem.common.CustomTheme
import com.keyflare.exchange.designSystem.theme.ExchangeTheme

@Composable
fun DsTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "",
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(12.dp),
    contentAlpha: Float = 1f,
) {
    val colors = TextFieldDefaults.textFieldColors(
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent,
        textColor = CustomTheme.colors.textPrimaryVariant.copy(alpha = contentAlpha),
        cursorColor = CustomTheme.colors.textAction.copy(alpha = contentAlpha),
        backgroundColor = CustomTheme.colors.surfaceSecondary,
    )

    val visualTransformation = VisualTransformation.None
    val singleLine = true
    val readOnly = false
    val isError = false
    val textStyle = CustomTheme.type.body1

    val mergedTextStyle = textStyle.merge(
        TextStyle(color = colors.textColor(enabled).value)
    )

    val customTextSelectionColors = TextSelectionColors(
        handleColor = CustomTheme.colors.textAction,
        backgroundColor = CustomTheme.colors.textAction.copy(alpha = 0.4f),
    )

    CompositionLocalProvider(
        LocalTextSelectionColors provides customTextSelectionColors
    ) {
        @OptIn(ExperimentalMaterialApi::class)
        BasicTextField(
            value = value,
            modifier = modifier
                .background(colors.backgroundColor(enabled).value, shape)
                .defaultMinSize(
                    minWidth = TextFieldDefaults.MinWidth,
                    minHeight = TextFieldDefaults.MinHeight
                ),
            onValueChange = onValueChange,
            enabled = enabled,
            readOnly = readOnly,
            textStyle = mergedTextStyle,
            cursorBrush = SolidColor(colors.cursorColor(isError).value),
            visualTransformation = visualTransformation,
            singleLine = singleLine,
            decorationBox = @Composable { innerTextField ->
                TextFieldDefaults.TextFieldDecorationBox(
                    value = value,
                    visualTransformation = visualTransformation,
                    innerTextField = innerTextField,
                    placeholder = {
                        Text(
                            text = placeholder,
                            style = CustomTheme.type.body1,
                            color = CustomTheme.colors.textAdditional.copy(alpha = contentAlpha),
                        )
                    },
                    singleLine = singleLine,
                    enabled = enabled,
                    interactionSource = remember { MutableInteractionSource() },
                    colors = colors,
                    contentPadding = PaddingValues(horizontal = 12.dp)
                )
            }
        )
    }
}

@Preview
@Composable
private fun DsTextFieldPreview() {
    var value by remember { mutableStateOf("") }

    ExchangeTheme {
        DsTextField(
            value = value,
            placeholder = "Note...",
            onValueChange = { value = it },
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
        )
    }
}
