package com.cesarlead.hr.fundamentals_of_language.agrupacion_particion;

import java.util.List;
import java.util.Map;

public interface PersonService {
    Map<String, List<People>> groupByCity(List<People> people);

    Map<String, List<People>> groupBySalary(List<People> people);

    Map<Boolean, List<People>> PartitionByAge(List<People> people);
}
