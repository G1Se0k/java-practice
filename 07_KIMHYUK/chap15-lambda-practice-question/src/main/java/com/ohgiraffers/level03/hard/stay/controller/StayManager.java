package com.ohgiraffers.level03.hard.stay.controller;

import com.ohgiraffers.level03.hard.stay.model.dto.StayDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class StayManager {

    private List<StayDTO> stays = new ArrayList<>();

    public void addStay(StayDTO stay) {
        stays.add(stay);
    }

    public List<StayDTO> search(Predicate<StayDTO> condition) {

        List<StayDTO> result = new ArrayList<>();

        for (StayDTO stay : stays) {
            if (condition.test(stay)) {
                result.add(stay);
            }
        }
        return result;
    }

    public int changePrice(Predicate<StayDTO> condition,
                           UnaryOperator<Integer> rule) {

        int count = 0;

        for (StayDTO stay : stays) {
            if (condition.test(stay)) {
                stay.setPrice(rule.apply(stay.getPrice()));
                count++;
            }
        }

        return count;
    }

    public List<StayDTO> sortedList(Comparator<StayDTO> comparator) {

        List<StayDTO> result = new ArrayList<>(stays);

        result.sort(comparator);

        return result;
    }

    public void printAll(List<StayDTO> list,
                         Consumer<StayDTO> printer) {

        for (StayDTO stay : list) {
            printer.accept(stay);
        }
    }
}
