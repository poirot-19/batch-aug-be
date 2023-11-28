package com.example.splitwiseaug23.commands;

import com.example.splitwiseaug23.controllers.SettleUpController;
import com.example.splitwiseaug23.dtos.SettleUpUserRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettleUp implements Command{

    private SettleUpController settleUpController;

    @Autowired
    public SettleUp(SettleUpController settleUpController){
        this.settleUpController = settleUpController;
    }

    @Override
    public boolean matches(String input) {
        // u1 SettleUp
        List<String> words = List.of(input.split(" "));
        if(words.get(1).equals("SettleUp")){
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));
        Long userId = Long.valueOf(words.get(0));
        SettleUpUserRequestDto settleUpUserRequestDto = new SettleUpUserRequestDto();
        settleUpUserRequestDto.setUserId(userId);
        settleUpController.settleUp(settleUpUserRequestDto);
    }
}
