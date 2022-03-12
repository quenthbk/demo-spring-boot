package fr.quenthbk.springbootdemo.products;

import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController {

  @Autowired
  lateinit var mapper: ModelMapper

  @Autowired
  lateinit var service: ProductService

  @GetMapping
  fun list(): ProductLiteDTO {
    return mapper.map(service.create("item"), ProductLiteDTO::class.java)
  }

  @GetMapping("/{id}")
  fun findOne(@PathVariable id: Long): ProductLiteDTO {
    return mapper.map(service.getById(id), ProductLiteDTO::class.java)
  }
}
