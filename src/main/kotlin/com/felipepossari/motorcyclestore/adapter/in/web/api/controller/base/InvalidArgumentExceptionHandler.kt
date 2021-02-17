package com.felipepossari.motorcyclestore.adapter.`in`.web.api.controller.base

import com.felipepossari.motorcyclestore.application.exception.InvalidArgumentException
import io.micronaut.context.annotation.Requirements
import io.micronaut.context.annotation.Requires
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Produces
import io.micronaut.http.server.exceptions.ExceptionHandler
import javax.inject.Singleton

@Produces
@Singleton
@Requirements(
        Requires(classes = [InvalidArgumentExceptionHandler::class, ExceptionHandler::class])
)
class InvalidArgumentExceptionHandler : ExceptionHandler<InvalidArgumentException, HttpResponse<*>> {
    override fun handle(request: HttpRequest<*>?, exception: InvalidArgumentException): HttpResponse<*> {
        return HttpResponse.badRequest(buildResultError(exception.errors))
    }
}