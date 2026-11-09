package com.ohgiraffers.level03.hard.stay.controller;

import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class StayManager {

    private List<StayDTO> stays;

    {
        stays = new ArrayList<>();
    }

    public void addStay(StayDTO stay){
        stays.add(stay);
    }

    public List<StayDTO> search(Predicate<StayDTO> condition){
        return stays.stream().filter(condition).collect(Collectors.toList());
    }

    public int changePrice(Predicate<StayDTO> condition, UnaryOperator<Integer> rule){
        int cnt = (int) stays.stream().filter(condition).count();
        stays.stream().filter(condition).forEach(stay -> stay.setPrice(rule.apply(stay.getPrice())));
        return cnt;
    }

    public List<StayDTO> sortedList(Comparator<StayDTO> comparator){
        return stays.stream().sorted(comparator).toList();
    }

    public void printAll(List<StayDTO> list, Consumer<StayDTO> printer){
        if(list.isEmpty()) System.out.println("검색 결과 없음");
        else list.forEach(printer);
    }
}
