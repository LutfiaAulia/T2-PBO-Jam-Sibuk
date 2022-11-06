class Mahasiswa extends Elemen{

    private int SKS;

    public Mahasiswa(String nama, int SKS){
        super(nama);
        setSKS(SKS);
        this.SKS = SKS*3;
    }

    public int getJamsibuk (){
         System.out.println(getNama()+"adalah seorang mahasiswa dengan jam sibuk "+ SKS);
         return SKS;
    }

    public int getSKS(){
        return SKS;
    }

    public void setSKS(int newSKS){
        newSKS = SKS;
        SKS = newSKS;
    }
}