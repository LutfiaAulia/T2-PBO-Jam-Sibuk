class Dosen extends Elemen{
    
    private int jumlahHK;

    public Dosen (String nama, int jumlahHK){
        super (nama); //Downcasting
        setJumlahHK (jumlahHK);
        this.jumlahHK = jumlahHK*8;
    }
    //Polymorphisme
    public int getJamsibuk(){
        System.out.println(getNama()+"adalah seorang dosen dengan jam sibuk "+jumlahHK);
        return this.jumlahHK;
    }

    public void setJumlahHK(int newJumlahHK){
        newJumlahHK = jumlahHK;
        jumlahHK = newJumlahHK;
    }
}
