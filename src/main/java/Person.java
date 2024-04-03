public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    // Конструкторы
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // Методы для проверки наличия возраста и адреса
    public boolean hasAge() {
        return age > 0;
    }

    public boolean hasAddress() {
        return address != null && !address.isEmpty();
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < this.age) {
            throw new IllegalArgumentException("Возраст не может уменьшаться");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Увеличение возраста на 1 год
    public void happyBirthday() {
        age++;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return name + " " + surname + ", возраст: " + age + ", адрес: " + (address != null ? address : "не указан");
    }

    // Создание полузаполненного билдера для ребёнка
    public PersonBuilder newChildBuilder() {
        PersonBuilder builder = new PersonBuilder();
        builder.setSurname(this.surname);
        return builder;
    }
}
