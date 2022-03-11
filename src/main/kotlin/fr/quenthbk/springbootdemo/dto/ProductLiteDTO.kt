package fr.quenthbk.springbootdemo.dto

import javax.validation.constraints.NotEmpty

data class ProductLiteDTO(
  var id: Int = 0,

  @field:NotEmpty
  var name: String = "",

  @field:NotEmpty
  var description: String = ""
)
