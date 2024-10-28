package ecowind.ru.utils.messages.auth

enum class TraceMessages(val message: String) {
    TRACE_WITH_ID_ALREADY_AUTHORIZED_SF("Trace with id - %s is already authorized"),
    SUCCESSFULLY_AUTHORIZED_TRACE_WITH_ID_SF("Successfully authorized trace with id - %s"),
    INVALID_ACCESS("Invalid access token"),

    TOKEN_FOR_TRACE_WITH_ID_ALREADY_EXISTS_SF("Token for trace with id - %s already exists"),
    TRACE_WITH_ID_NOT_AUTHORIZED_SF("Trace with id - %s not authorized")
}