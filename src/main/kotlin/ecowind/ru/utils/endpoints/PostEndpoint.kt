package ecowind.ru.utils.endpoints

import io.swagger.v3.oas.annotations.Operation
import org.springframework.core.annotation.AliasFor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.POST
import org.springframework.web.bind.annotation.RestController

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@RestController
@RequestMapping(method = [POST])
@Operation
annotation class PostEndpoint(
    @get:AliasFor(annotation = RequestMapping::class) val value: String,
    @get:AliasFor(annotation = Operation::class) val summary: String,
)