package com.example.splitwiseaug23.services;

import com.example.splitwiseaug23.models.Expense;
import com.example.splitwiseaug23.models.ExpenseUser;
import com.example.splitwiseaug23.models.Group;
import com.example.splitwiseaug23.models.User;
import com.example.splitwiseaug23.repositories.ExpenseRepository;
import com.example.splitwiseaug23.repositories.ExpenseUserRepository;
import com.example.splitwiseaug23.repositories.GroupRepository;
import com.example.splitwiseaug23.repositories.UserRepository;
import com.example.splitwiseaug23.strategies.SettleUpStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Component
public class SettleUpService {

    private GroupRepository groupRepository;
    private ExpenseRepository expenseRepository;
    private SettleUpStrategy settleUpStrategy;
    private UserRepository userRepository;
    private ExpenseUserRepository expenseUserRepository;

    @Autowired
    public SettleUpService(GroupRepository groupRepository, ExpenseRepository expenseRepository, SettleUpStrategy settleUpStrategy, UserRepository userRepository, ExpenseUserRepository expenseUserRepository) {
        this.groupRepository = groupRepository;
        this.expenseRepository = expenseRepository;
        this.settleUpStrategy = settleUpStrategy;
        this.userRepository = userRepository;
        this.expenseUserRepository = expenseUserRepository;
    }

    public List<Expense> settleUpUser(Long userId){

        // get the user from User Repo
        // get all the expenses for the particular user
        // settle up the expenses using a settling up strategy
        // return expensesToSettleUp
        Optional<User> optionalUser = userRepository.findById(userId);
        if(optionalUser.isEmpty())
            throw new RuntimeException();
        User user = optionalUser.get();
        List<ExpenseUser> expenseUsers = expenseUserRepository.findByUser(user);

        Set<Expense> expenses = new HashSet<>();
        for(ExpenseUser expenseUser: expenseUsers){
            expenses.add(expenseUser.getExpense());
        }

        List<Expense> expensesToSettle = settleUpStrategy.settleUp(expenses.stream().toList());
        // I should only return the expenses in which this particular
        // user is involved

        // I need to add List<ExpenseUser> to Expense class so that
        // I can filter out the expenses where this user is involved

        List<Expense> expensesToReturn = new ArrayList<>();
        for (Expense expense: expensesToSettle){
            for(ExpenseUser expenseUser: expense.getExpenseUsers()){
                if(expenseUser.getUser().equals(user)){
                    expensesToReturn.add(expense);
                    break;
                }
            }
        }
        return expensesToReturn;
    }

    public List<Expense> settleUpGroup(Long groupId){

        // validate the group by getting the group from groupRepository
        // get the expenses for a particular group
        // settle up the expenses using a settling up strategy
        // return expensesToSettleUp

        // get the group from Group Repository
        Optional<Group> optionalGroup = groupRepository.findById(groupId);
        if(optionalGroup.isEmpty())
            throw new RuntimeException();
        Group group = optionalGroup.get();

        List<Expense> expenses = expenseRepository.findAllByGroup(group);
        // we have all the expenses for the required group
        List<Expense> expensesToReturn = settleUpStrategy.settleUp(expenses);
        return expensesToReturn;
    }
}
