class Asdos extends Mahasiswa{
    private int jamNgasdos;

    public Asdos(String nama, int SKS, int jamNgasdos){
        super(nama, SKS); //Downcasting
        setJamNgasdos(jamNgasdos);
        this.jamNgasdos = jamNgasdos+SKS;
    }
    //Polymorphisme
    public int getJamsibuk(){
        System.out.println(getNama()+"adalah seorang asdos dengan jam sibuk "+jamNgasdos);
        return jamNgasdos;
    }

    public void setJamNgasdos(int newJamNgasdos){
        newJamNgasdos = jamNgasdos;
        jamNgasdos = newJamNgasdos;
    }
}
