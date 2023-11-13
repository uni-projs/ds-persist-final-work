package br.ufc.work02.service

import br.ufc.work02.domain.model.Category
import org.springframework.data.domain.Sort

interface CategoryService : GenericCrudService<Category, Long> {
    fun findAllByName(name: String): List<Category>
    fun findAllOrderedByField(field: String, direction: Sort.Direction): List<Category>
}