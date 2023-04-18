package com.example;

import java.util.List;

public interface IFeline extends Predator{
    int getKittens();
    @Override
    List<String> eatMeat() throws Exception;
}
