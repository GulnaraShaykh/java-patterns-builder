public class PersonBuilder {
    private String name;
    private String surname;
    private int age = 0;
    private String address;

    // Методы для установки данных через билдер
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    // Создание объекта Person
    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указаны обязательные поля: имя и фамилия");
        }
        return new Person(name, surname, age);
    }

}
