package sistem.informasi.rumah.sakit;
//interface
interface fungsi{
    public void hitung(String obat, int i);
}

public class proses extends variable implements fungsi{

    private String[] harga = new String[100];
    //Polymorphisme
    @Override
    public void hitung(String obat, int i){
        if ("Antalgin".equals(obat)){
            harga[i] = "Rp 10.000,-";
            setHarga(harga);
        } else if ("Ibuprofen".equals(obat)){
            harga[i] = "Rp 15.000,-";
            setHarga(harga);
        } else if ("Cataflam".equals(obat)){
            harga[i] = "Rp 20.000,-";
            setHarga(harga);
        } else if ("Aspirin".equals(obat)){
            harga[i] = "Rp 25.000,-";
            setHarga(harga);
        } else if ("Ponstan".equals(obat)){
            harga[i] = "Rp 30.000,-";
            setHarga(harga);
        }
        
    }
    
    
    
}
