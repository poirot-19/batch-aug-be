package com.example.splitwiseaug23.strategies;

import com.example.splitwiseaug23.models.Expense;

import java.util.List;

public interface SettleUpStrategy {
    public List<Expense> settleUp(List<Expense> expenses);
    // HW - try to code Min/Max Heap strategies
    // Dummy Expense would be created by
    /*
    Expense 1 -> A:1000 B:0
                A: 500 B:500

    Expense 2 -> A:1000 B:0
                A: 500 B:500

    Final Balances -> A: +1000 - 500 + 1000 - 500 = +1000 + 0 - 1000 -> 0
                   -> B: +0 - 500 + 0 - 500 = -1000 + 1000 - 0 -> 0

    we call SettleUpStrategy to find the final transactions that should happen
    in order for A and B to be settled up

    below expense would be returned by SettleUpStrategy
    Expense 3 (Dummy) -> A:0 B:1000
                A: 1000 B:0

     */
}
