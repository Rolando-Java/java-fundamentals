package org.aguzman.api.stream.ejemplos;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class EjemploStreamRange {

    public static void main(String... args) {

        IntStream intStream = IntStream.of(10, 20, 30);
        IntSummaryStatistics statisticsInt = intStream.summaryStatistics();
        System.out.println("min: " + statisticsInt.getMin());//10
        System.out.println("max: " + statisticsInt.getMax());//30
        System.out.println("count: " +statisticsInt.getCount());//3
        System.out.println("sum: " + statisticsInt.getSum());//60
        System.out.println("average: " + statisticsInt.getAverage());//20

        DoubleStream doubleStream = DoubleStream.of(10, 20, 30);
        DoubleSummaryStatistics statisticsDouble = doubleStream.summaryStatistics();
        System.out.println("min: " + statisticsDouble.getMin());//10
        System.out.println("max: " +statisticsDouble.getMax());//30
        System.out.println("count: " + statisticsDouble.getCount());//3
        System.out.println("sum: " + statisticsDouble.getSum());//60
        System.out.println("average: " +statisticsDouble.getAverage());//20

        LongStream longStream = LongStream.of(10, 20, 30);
        LongSummaryStatistics statisticsLong = longStream.summaryStatistics();
        System.out.println("min: " + statisticsLong.getMin());//10
        System.out.println("max: " + statisticsLong.getMax());//30
        System.out.println("count: " + statisticsLong.getCount());//3
        System.out.println("sum: " + statisticsLong.getSum());//60
        System.out.println("average: " + statisticsLong.getAverage());//20

    }

}
