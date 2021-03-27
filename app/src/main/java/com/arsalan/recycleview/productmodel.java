package com.arsalan.recycleview;

public class productmodel {
    private int Image;
    private String Heading;
    private String Des;
    public productmodel(int image, String heading, String des) {
        Image = image;
        Heading = heading;
        Des = des;
    }
    public int getImage() {
        return Image;
    }
    public void setImage(int image) {
        Image = image;
    }
    public String getHeading() {
        return Heading;
    }
    public void setHeading(String heading) {
        Heading = heading;
    }
    public String getDes() {
        return Des;
    }
    public void setDes(String des) {
        Des = des;
    }
}
