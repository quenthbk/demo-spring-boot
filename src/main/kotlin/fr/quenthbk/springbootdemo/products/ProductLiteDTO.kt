package fr.quenthbk.springbootdemo.products

import javax.validation.constraints.NotEmpty

data class ProductLiteDTO(
  var id: Long = 0,

  @field:NotEmpty
  var name: String = "",

  @field:NotEmpty
  var description: String = ""
)
