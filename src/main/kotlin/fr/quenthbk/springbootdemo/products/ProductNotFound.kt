package fr.quenthbk.springbootdemo.products

import javax.persistence.EntityNotFoundException

class ProductNotFound(
  val id: Long
): EntityNotFoundException("The product id '$id' was not found.")
