class Customer {
    public String firstName;
    public String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Ім'я ='" + firstName + '\'' +
                ", Прізвище ='" + lastName + '\'' +
                '}';
    }
}