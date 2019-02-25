package com.zbit.modules.base;

import com.zbit.modules.sorter.spi.SorterService;
import com.zbit.strings.util.StringCreator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    System.out.format("Hello World: " + new StringCreator().generateRandomString() + "\n");

    List<Integer> unsortedList = Stream.generate(() -> new Random().nextInt(50)).limit(15)
        .collect(Collectors.toList());
    System.out.println("Unsorted List: \t" + unsortedList);

    SorterService sorter = getSorterService();
    sorter.sort(unsortedList);
    System.out.println("Sorted List  : \t" + unsortedList);
  }

  private static SorterService getSorterService() {
    ServiceLoader<SorterService> sl = ServiceLoader.load(SorterService.class);
    Optional<SorterService> sorterService = sl.findFirst();
    if (sorterService.isEmpty()) {
      throw new RuntimeException("No service providers found!");
    }
    return sorterService.get();
  }
}