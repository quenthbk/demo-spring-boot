package fr.quenthbk.springbootdemo.global

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler {

  @ExceptionHandler(
    ResourceNotFoundException::class
  )
  fun handleNotFoundException(exception: java.lang.Exception): ResponseEntity<ErrorResponse> {
    return buildErrorResponse(
      HttpStatus.NOT_FOUND,
      exception.message
    )
  }

  private fun buildErrorResponse(
    httpStatus: HttpStatus,
    message: String?
  ): ResponseEntity<ErrorResponse> {
    return ResponseEntity.status(httpStatus)
      .body(message?.let { ErrorResponse(httpStatus, it) })
  }
}
