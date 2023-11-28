package com.example.splitwiseaug23.repositories;

import com.example.splitwiseaug23.models.Expense;
import com.example.splitwiseaug23.models.ExpenseUser;
import com.example.splitwiseaug23.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExpenseUserRepository extends JpaRepository<ExpenseUser, Long> {
    List<ExpenseUser> findByUser(User user);
}
