package ecowind.ru.utils.messages.auth

enum class TokenMessages(val message: String) {
    INVALID_TOKEN_TYPE_TO_REFRESH("Invalid token type to refresh"),
    INVALID_TOKEN_TYPE("Invalid token type"),

    ACCESS_TOKEN_NOT_EXPIRED("Access token is not yet expired"),
    ACCESS_TOKEN_IS_EXPIRED("Access token is already expired"),
    ACCESS_TOKEN_NOT_VALID("Access token is not valid"),

    REFRESH_TOKEN_IS_EXPIRED("Refresh token is already expired"),
    REFRESH_TOKEN_NOT_VALID("Refresh token is not valid")
}