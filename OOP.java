class OOP {
    public static void main(String[] args) {
        User user = new User("Tyler Raymond Letendre", "1998-06-17");

        Book book = new Book("Ready Player One","Ernist Cline");

        user.borrow(book);

        System.out.printf("%s was born on %s and he is now %d years old. \n", user.getName(), user.getBirthDate(), user.age());
        System.out.printf("%s has borrowed these books: %s \n", user.getName(), user.borrowedBooks());
    }
}
