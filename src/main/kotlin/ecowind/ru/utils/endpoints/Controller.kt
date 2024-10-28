package ecowind.ru.utils.endpoints

import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.core.annotation.AliasFor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@RestController
@RequestMapping
@Tag(name = "", description = "")
annotation class Controller(
    @get:AliasFor(annotation = RequestMapping::class) val value: String,
    @get:AliasFor(annotation = Tag::class) val name: String,
    @get:AliasFor(annotation = Tag::class) val description: String = ""
)
