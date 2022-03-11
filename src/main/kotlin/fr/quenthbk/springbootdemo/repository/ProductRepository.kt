package fr.quenthbk.springbootdemo.repository

import fr.quenthbk.springbootdemo.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository: JpaRepository<Product, Int> {
}
