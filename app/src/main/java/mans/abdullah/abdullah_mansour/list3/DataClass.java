package mans.abdullah.abdullah_mansour.list3;

public class DataClass
{
    String name,mobile;
    int image;

    public DataClass(String name, String mobile, int image) {
        this.name = name;
        this.mobile = mobile;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
