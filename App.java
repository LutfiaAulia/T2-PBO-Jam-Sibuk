class App{
    public static void main(String[] args) {
        Asdos a = new Asdos("Fairuzikun ", 24, 49);
        Dosen d = new Dosen("Raja OP Damanik ", 5);
        Elemen as = new Asdos("Angel-chan ", 20, 44); //Upcasting
        Mahasiswa m = new Mahasiswa("Firman ", 20);
        Elemen ma = new Mahasiswa("Nid to pass this sem ", 23); //Upcasting
        Elemen dos = new Dosen("Nivotko ", 3); //Upcasting

        int asdos1 = a.getJamsibuk();
        int dosen1 = d.getJamsibuk();
        int asdos2 = as.getJamsibuk();
        int mahas1 = m.getJamsibuk();
        int mahas2 = ma.getJamsibuk();
        int dosen2 = dos.getJamsibuk();
        int total = asdos1+dosen1+asdos2+mahas1+mahas2+dosen2;
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+total);

    }
}
