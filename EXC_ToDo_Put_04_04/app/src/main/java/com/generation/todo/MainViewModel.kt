package com.generation.todo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.generation.todo.model.Categoria
import com.generation.todo.model.Tarefa
import com.generation.todo.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel //Indica que a nossa ViewModel vai injetar dependências
class MainViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    var tarefaSelecionada: Tarefa? = null

    private val _responseListCategoria =
        MutableLiveData<Response<List<Categoria>>>()

    val responseListCategoria: LiveData<Response<List<Categoria>>> =
        _responseListCategoria

    private val _myTarefaResponse =
        MutableLiveData<Response<List<Tarefa>>>()
    val myTarefaResponse: LiveData<Response<List<Tarefa>>> =
        _myTarefaResponse


    val dataSelecionada = MutableLiveData<LocalDate>()

    init {

        dataSelecionada.value = LocalDate.now()

        listCategoria()
    }


    fun listCategoria() {
        /*
        Declarar a nossa corrotina (ou seja, a Thread secundária que o
        método vai rodar)

        Como vamos executar a requisição dentro da ViewModel, utilizaremos a nossa
        corrotina no escopo da ViewModel (viewModelScope)
         */

        viewModelScope.launch {
            try {
                val response = repository.listCategoria()
                _responseListCategoria.value = response!!
            } catch (e: Exception) {
                Log.d("ErroRequisicao", e.message.toString())
            }
        }
    }

    fun listTarefa() {
        viewModelScope.launch {
            try {
                val response = repository.listTarefas()
                _myTarefaResponse.value = response
            } catch (e: Exception) {
                Log.e("Developer", "Error", e)
            }
        }
    }

    fun updateTarefa(tarefa: Tarefa) {
        viewModelScope.launch {
            try {
                repository.updateTarefa(tarefa)
                listTarefa()
            } catch (e: Exception) {
                Log.d("Erro", e.message.toString())
            }
        }
    }

    fun addTarefa(tarefa: Tarefa) {
        viewModelScope.launch {
            try {
                repository.addTarefa(tarefa)
            } catch (e: Exception) {
                Log.d("ERRO", e.message.toString())
            }
        }
    }


}