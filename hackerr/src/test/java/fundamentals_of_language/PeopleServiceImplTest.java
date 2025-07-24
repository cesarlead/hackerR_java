package fundamentals_of_language;

import com.cesarlead.hr.fundamentals_of_language.agrupacion_particion.People;
import com.cesarlead.hr.fundamentals_of_language.agrupacion_particion.PeopleServiceImpl;
import com.cesarlead.hr.fundamentals_of_language.agrupacion_particion.PersonService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class PeopleServiceImplTest {


    private List<People> people = List.of(
            new People(UUID.randomUUID(), "Cesar Fernandez", "bogota", 30, 5000),
            new People(UUID.randomUUID(), "Karli Mata", "venezuela", 25, 6000),
            new People(UUID.randomUUID(), "Eduardo Fernandez", "argentina", 35, 6000),
            new People(UUID.randomUUID(), "jose Fernandez", "bolivia", 24, 5000),
            new People(UUID.randomUUID(), "pedro Fernandez", "bogota", 23, 5000),
            new People(UUID.randomUUID(), "juan Fernandez", "bogota", 40, 7000)
    );

    private PersonService ps = new PeopleServiceImpl(people);


    @Test
    void groupByCityTest() {
        var map = ps.groupByCity(people);
        assert map.size() == 4;
        assertThat(map).containsKey("bogota");
    }

    @Test
    void groupBySalaryTest() {
        var map = ps.groupBySalary(people);
        assert map.size() == 2;
        assertThat(map).containsKey("high");
    }

    @Test
    void PartitionByAgeTest() {
        var map = ps.PartitionByAge(people);
        assert map.size() == 2;
        assertThat(map).containsKey(true);
    }


}
