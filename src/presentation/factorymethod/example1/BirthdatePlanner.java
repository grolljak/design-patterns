package presentation.factorymethod.example1;

import java.time.LocalDate;
import java.util.function.Supplier;

public record BirthdatePlanner(String firstName,
                               String lastName,
                               LocalDate birthDate,
                               Supplier<LocalDate> dateSupplier) {

    public static BirthdatePlanner of(String firstName,
                                      String lastName,
                                      LocalDate birthDate) {
        return new BirthdatePlanner(
                firstName,
                lastName,
                birthDate, LocalDate::now
        );
    }

    public static void main(String[] args) {
        BirthdatePlanner testBP = new BirthdatePlanner(
                "John",
                "Doe",
                LocalDate.of(1992, 12, 12),
                () -> LocalDate.of(2023, 6, 6));

        System.out.println(testBP.dateSupplier.get());

        final BirthdatePlanner planner = BirthdatePlanner.of(
                "Joe",
                "Mama",
                LocalDate.of(1992, 12, 12)
        );
        System.out.println(planner.dateSupplier.get());

    }
}
