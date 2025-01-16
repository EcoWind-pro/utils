package ecowind.ru.utils

object ActionUtils {
    fun generateUri(scheme: String, host: String, port: Number? = null, url: String? = null): String =
        url?.let { port?.let { "$scheme://$host:$port/$url" } ?: "$scheme://$host/$url" }
            ?: port?.let { "$scheme://$host:$port" } ?: "$scheme://$host"
}