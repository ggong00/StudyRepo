package com.kh.exam5;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExam1 {

    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87); //scores
//        == scores.add(new Integer(87));
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);
        System.out.println(scores);

        Integer score = null;
        score = scores.first();
        System.out.println("가장 낮은 점수 : " + score);

        score = scores.last();
        System.out.println("가장 높은 점수 : " + score);

        score = scores.lower(87);
        System.out.println("87보다 낮은 점수 : " + score);

        score = scores.higher(87);
        System.out.println("87보다 높은 점수 : " + score);

        score = scores.floor(87);
        System.out.println("87이거나 낮은 점수 : " + score);

        score = scores.ceiling(87);
        System.out.println("87이거나 높은 점수 : " + score);

//        while (!scores.isEmpty()) {
//            score = scores.pollLast();
//            System.out.println(score + " 남은 객체 수 " + scores.size());
//        }

        NavigableSet<Integer> integers = scores.descendingSet();
        System.out.println(integers);

        //범위검색
        SortedSet<Integer> sortedSet = scores.subSet(80, 90);
        System.out.println(sortedSet);

        NavigableSet<Integer> sortedSet2 = scores.subSet(80,false, 95,true);
        System.out.println(sortedSet2);
    }
}
