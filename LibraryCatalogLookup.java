class LibraryCatalogLookup{
    public void findBook(String catalog[][], String targetIsbn){
        String ISBN;
        String title;
        for (int i=0; i<catalog.length; i++){
            ISBN = catalog[i][0];
            title = catalog[i][1]; // Assuming title is the next element in the array
            if (ISBN.equals(targetIsbn)){
                System.out.println("Book found: " + title);
                return;
            }
        }
        System.out.println("Book not found.");
    }
    public static void main(String[] args){
        String[][] catalog = {{"0001112223", "Introduction to Algebra"},
        {"0002223334", "Beginning Python"},
        {"0003334445", "Classic Mythology"},
        {"0004445556", "Data and Society"},
        {"0005556667", "European History"}};
        String targetIsbn = "0003334445";
        LibraryCatalogLookup lookup = new LibraryCatalogLookup();
        lookup.findBook(catalog, targetIsbn);
    }
}