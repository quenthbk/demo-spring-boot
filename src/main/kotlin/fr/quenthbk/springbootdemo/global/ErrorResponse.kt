package fr.quenthbk.springbootdemo.global

import org.springframework.http.HttpStatus

class ErrorResponse(var status: HttpStatus, var message: String)
