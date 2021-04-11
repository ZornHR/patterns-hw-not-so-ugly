package person;

import person.appearance.Appearance;

public class Person {

    private final String id;
    private final FIO fio;
    private final Physical phys;
    private final Appearance appearance;
    private final Phone phone;

    public Person(final String id,
                  final FIO fio,
                  final Physical phys,
                  final Appearance appearance,
                  final Phone phone) {
        this.id = id;
        this.fio = fio;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
    }


    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder()
                .append(id).append("\n")
                .append(String.format("%s %s %s", fio.getLastName(), fio.getFirstName(), fio.getMiddleName()))
                .append("\n")
                .append(phys).append("\n")
                .append(appearance).append("\n");
        if (phone != null) {
            sb.append(phone);
        } else {
            sb.append("Телефона нет");
        }
        return sb.toString();
    }
}