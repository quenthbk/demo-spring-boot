package fr.quenthbk.springbootdemo.config

import org.modelmapper.ModelMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ModelMapperConfig {

  @Bean
  fun getModelMapper(): ModelMapper {
    return ModelMapper()
  }
}
