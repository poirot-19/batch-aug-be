package com.example.splitwiseaug23.repositories;

import com.example.splitwiseaug23.models.Expense;
import com.example.splitwiseaug23.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findAllByGroup(Group group);
}
