class Mahasiswa extends Elemen{

    private int SKS;

    public Mahasiswa(String nama, int SKS){
        super(nama); //Downcasting
        this.SKS = SKS*3;
    }
    //Polymorphisme
    public int getJamsibuk (){
         System.out.println(getNama()+"adalah seorang mahasiswa dengan jam sibuk "+ SKS);
         return SKS;
    }
}