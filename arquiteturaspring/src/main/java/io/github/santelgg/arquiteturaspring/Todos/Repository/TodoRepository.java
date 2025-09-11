package io.github.santelgg.arquiteturaspring.Todos.Repository;

import io.github.santelgg.arquiteturaspring.Todos.Entity.TodoEntity;
import io.github.santelgg.arquiteturaspring.Todos.Service.TodoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

    boolean existsByDescricao(String descricao);
}
