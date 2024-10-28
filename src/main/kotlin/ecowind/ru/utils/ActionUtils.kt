package ecowind.ru.utils

object ActionUtils {
    /**
     *
     *
     * @param scheme
     * @param host
     * @param port
     * @param url
     */
    fun generateUri(scheme: String, host: String, port: Number? = null, url: String? = null): String =
        url?.let { port?.let { "$scheme://$host:$port/$url" } ?: "$scheme://$host/$url" }
            ?: port?.let { "$scheme://$host:$port" } ?: "$scheme://$host"
}