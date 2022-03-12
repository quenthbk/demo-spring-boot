package fr.quenthbk.springbootdemo.products

import fr.quenthbk.springbootdemo.global.ResourceNotFoundException

class ProductNotFoundException(
  val id: Long
): ResourceNotFoundException("The product id '$id' was not found.")
