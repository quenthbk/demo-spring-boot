package fr.quenthbk.springbootdemo.products

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl: ProductService {

  @Autowired
  lateinit var repo: ProductRepository

  override fun getById(id: Long): Product {
    val opt = repo.findById(id)
    if (opt.isEmpty) {
      throw ProductNotFoundException(id)
    }
    return opt.get()
  }

  override fun create(name: String): Product {
    return repo.save(Product(name = name, description = "test"))
  }
}
