package io.github.santelgg.arquiteturaspring.Todos;

import io.github.santelgg.arquiteturaspring.Todos.Entity.TodoEntity;
import io.github.santelgg.arquiteturaspring.Todos.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    @Autowired
    private TodoRepository repository;

    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar (TodoEntity todo){
        if (existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException("Já existe um To-Do com esta descricao");
        }
    }

    private boolean existeTodoComDescricao(String descricao){

    }
}
