package com.example.splitwiseaug23.commands;

public interface Command {
    public boolean matches(String input);
    public void execute(String input);
}
