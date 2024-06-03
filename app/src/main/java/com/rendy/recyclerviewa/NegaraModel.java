package com.rendy.recyclerviewa;

public class NegaraModel {
    private String nama, deskripsi, url;

    public NegaraModel()
    {

    }

//    Nama Negara //

    public String getNama()
    {
        return nama;
    }
    public void setNama( String nama)
    {
        this.nama = nama;
    }
    // END NAMA NEGARA


    // DESKRIPSI //

    public String getDeskripsi()
    {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    // END DESKRIPSI


    // URL
    public String getUrl(){
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
