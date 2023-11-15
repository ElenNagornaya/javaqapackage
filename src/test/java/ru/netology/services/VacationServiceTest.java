package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.VacationService;

public class VacationServiceTest {
    @ParameterizedTest
    //@CsvSource({
    // "3,10_000,3_000,20_000",
    // "2,100_000,60_000,150_000"
    // })
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void calcVacation(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calcVacation(expected, income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}
