package Buoi6.Baitapvenha;

public class Publisher {
    private String name;
    private  String address;

    public Publisher() {
    }

    public Publisher(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Publisher(" +"Name :"+name+" "+"Address :"+address+")";
    }
}
