package com.fw.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Mobile")
public class Mobile {
    private Integer id;

    private Integer mobilenumber;

    private String mobilearea;

    private String mobiletype;

    private Integer areacode;

    private Integer postcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMobilenumber() {
        return mobilenumber;
    }

    public void setMobilenumber(Integer mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    public String getMobilearea() {
        return mobilearea;
    }

    public void setMobilearea(String mobilearea) {
        this.mobilearea = mobilearea == null ? null : mobilearea.trim();
    }

    public String getMobiletype() {
        return mobiletype;
    }

    public void setMobiletype(String mobiletype) {
        this.mobiletype = mobiletype == null ? null : mobiletype.trim();
    }

    public Integer getAreacode() {
        return areacode;
    }

    public void setAreacode(Integer areacode) {
        this.areacode = areacode;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }
}