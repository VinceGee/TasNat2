package zw.co.vokers.vinceg.tasnat.models;

/**
 * Created by Vince G on 10/1/2019
 */

public class BeanlistBrands {
    private int imgbrand;
    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;
    private String text6;

    public BeanlistBrands(int imgbrand, String text1, String text2, String text3, String text4, String text5, String text6) {
        this.imgbrand = imgbrand;
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.text5 = text5;
        this.text6 = text6;
    }

    public int getImgbrand() {
        return imgbrand;
    }

    public void setImgbrand(int imgbrand) {
        this.imgbrand = imgbrand;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }


    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }


    public String getText3() {
        return text3;
    }

    public void setText3(String text3) {
        this.text3 = text3;
    }


    public String getText4() {
        return text4;
    }

    public void setText4(String text4) {
        this.text4 = text4;
    }


    public String getText5() {
        return text5;
    }

    public void setText5(String text5) {
        this.text5 = text5;
    }


    public String getText6() {
        return text6;
    }

    public void setText6(String text6) {
        this.text6 = text6;
    }
}
