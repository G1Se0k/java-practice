package com.ohgiraffers.level03.hard.stay.controller;

import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StayManager {
    private List<StayDTO> stays;

    public StayManager(){
    }
    public void addStay(StayDTO stay){
        if(stays == null) stays = new ArrayList<>();
        stays.add(stay);
    }

    public List<StayDTO> search(Predicate<StayDTO> condition){
        return stays.stream().filter(condition).toList();
    }
    public int changePrice(Predicate<StayDTO> condition, UnaryOperator<Integer> rule){
        final int[] count = {0};

        stays.stream().filter(condition).forEach(stay -> {
            stay.setPrice(rule.apply(stay.getPrice()));
            count[0]++;
        });
        return count[0];
    }

    public List<StayDTO> sortedList(Comparator<StayDTO> comparator){
        List<StayDTO> result = stays;
        return result.stream().sorted(comparator).toList();
    }

    public void printAll(List<StayDTO> list, Consumer<StayDTO> printer){
        if(list.isEmpty()) {
            System.out.println("검색 결과 없음");
            return;
        }

        list.forEach(printer);
    }
}
