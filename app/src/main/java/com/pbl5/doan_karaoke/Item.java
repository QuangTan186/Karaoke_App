package com.pbl5.doan_karaoke;

public class Item {
    private String maso,tieude;
    private Integer thich;
    public Item() {

    }
    public Item(String maso, String tieude, Integer thich)
    {
        this.maso= maso;
        this.tieude= tieude;
        this.thich= thich;
    }
    /**
     * @returnthe tieude
     */
    public String getTieude()
    {
        return tieude;
    }
    /**
     * @paramtieude the tieudeto set
     */
    public void setTieude(String tieude)
    {
        this.tieude= tieude;
    }
    /**
     * @returnthe maso
     */
    public String getMaso()
    {
        return maso;
    }
    /**
     * @parammaso the masoto set
     */
    public void setMaso(String maso)
    {
        this.maso= maso;
    }
    /**
     * @returnthe thich
     */
    public Integer getThich()
    {
        return thich;
    }
    /**
     * @paramthich the thichto set
     */
    public void setThich(Integer thich) {
        this.thich= thich;
    }
}
