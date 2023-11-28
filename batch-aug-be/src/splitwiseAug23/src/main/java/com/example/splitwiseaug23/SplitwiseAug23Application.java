package com.example.splitwiseaug23;

import com.example.splitwiseaug23.commands.CommandExecutor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseAug23Application implements CommandLineRunner {

    private Scanner scanner = new Scanner(System.in);
    private CommandExecutor commandExecutor;



    public static void main(String[] args) {
        SpringApplication.run(SplitwiseAug23Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        while(true){
            String input = scanner.next();
            commandExecutor.execute(input);
        }
    }
}
