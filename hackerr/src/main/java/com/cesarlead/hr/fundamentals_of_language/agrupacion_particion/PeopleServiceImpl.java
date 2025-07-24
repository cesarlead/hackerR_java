package com.cesarlead.hr.fundamentals_of_language.agrupacion_particion;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class PeopleServiceImpl implements PersonService {

    private final List<People> people;

    public PeopleServiceImpl(List<People> people) {
        this.people = Objects.requireNonNull(people, "people cannot be null");
    }

    @Override
    public Map<String, List<People>> groupByCity(List<People> people) {
        return people.stream()
                .collect(Collectors.groupingBy(p -> p.city()));
    }

    @Override
    public Map<String, List<People>> groupBySalary(List<People> people) {
        return people.stream()
                .collect(Collectors.groupingBy(p -> p.salary() > 5000 ? "high" : "low"));
    }

    @Override
    public Map<Boolean, List<People>> PartitionByAge(List<People> people) {
        return people.stream()
                .collect(Collectors.partitioningBy(p -> p.age() > 25));
    }
}
