package fr.quenthbk.springbootdemo.products

/**
 * Permet d'implémenter la logique métier de l'application
 */
interface ProductService {
  fun getById(id: Long): Product

  fun create(name: String): Product
}
