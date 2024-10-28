package ecowind.ru.utils.messages

enum class ActionMessages(val message: String) {
    ACTION_NOT_COMPLETED_SF("Action for request: %s %s was not completed: %s"),
    ACTION_COMPLETED_SF("Action for request: %s %s successfully completed")
}