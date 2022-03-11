package fr.quenthbk.springbootdemo.controller;

import fr.quenthbk.springbootdemo.dto.ProductLiteDTO
import fr.quenthbk.springbootdemo.model.Product
import fr.quenthbk.springbootdemo.repository.ProductRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

  @Autowired
  lateinit var mapper: ModelMapper

  @Autowired
  lateinit var repository: ProductRepository

  @GetMapping("/products")
  fun list(): ProductLiteDTO {
    val prod = Product(
      "item", "desc"
    )
    repository.save(prod)
    return mapper.map(prod, ProductLiteDTO::class.java)
  }
}
