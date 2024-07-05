package com.example.babybuy.Model;

import android.graphics.Bitmap;

public class ProductDataModel {
    Bitmap ImageDataInBitmap;
    public Integer productid;
    public String productname;
    public Integer productquantity;
    public Double productprice;
    public String productdescription;
    Integer productstatus;
    byte[] productimage;
    Integer productcategoryid;

    public Bitmap getImageDataInBitmap() {
        return ImageDataInBitmap;
    }

    public void setImageDataInBitmap(Bitmap imageDataInBitmap) {
        ImageDataInBitmap = imageDataInBitmap;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Integer getProductquantity() {
        return productquantity;
    }

    public void setProductquantity(Integer productquantity) {
        this.productquantity = productquantity;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public Integer getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(Integer productstatus) {
        this.productstatus = productstatus;
    }

    public byte[] getProductimage() {
        return productimage;
    }

    public void setProductimage(byte[] productimage) {
        this.productimage = productimage;
    }

    public Integer getProductcategoryid() {
        return productcategoryid;
    }

    public void setProductcategoryid(Integer productcategoryid) {
        this.productcategoryid = productcategoryid;
    }
}