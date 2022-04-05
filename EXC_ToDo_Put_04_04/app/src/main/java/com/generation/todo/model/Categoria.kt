package com.generation.todo.model

import retrofit2.Response

data class Categoria(
    var id: Long,
    var descricao: String?,
    var tarefas: Response<List<Categoria>>?
        ) {

    override fun toString(): String {
        return descricao!!
    }
}