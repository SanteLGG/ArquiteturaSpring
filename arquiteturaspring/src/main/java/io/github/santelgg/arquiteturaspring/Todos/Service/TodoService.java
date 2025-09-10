package io.github.santelgg.arquiteturaspring.Todos.Service;

import io.github.santelgg.arquiteturaspring.Todos.Entity.TodoEntity;
import io.github.santelgg.arquiteturaspring.Todos.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private TodoRepository repository;

    public TodoService(TodoRepository todoRepository){
        this.repository = todoRepository;
    }

    public TodoEntity salvar(TodoEntity novoTodo){
        return repository.save(novoTodo);
    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(id).orElse(null);
    }


}
