class OOP {
    public static void main(String[] args) {
        Book readyPlayerOne = new Book("Ready Player One","Ernist Cline", 500);

        AudioBook  dracula = new AudioBook("Dracula", "Bram stoker", 30000);
        Ebook jeeves= new Ebook("Carry on Jeeves", "P.G. Wodehouse", 280, "PDF");
        System.out.println(jeeves.toString());

    }
}
