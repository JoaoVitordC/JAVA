package entities;


public class Aluno {
    private Double price;
    private String name;
    private String eMail;
    private Integer room;
    public Aluno(String name, String eMail, Integer Room, Double price ){
        this.name = name;
        this.room = room;
        this.eMail = eMail;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public Integer getRoom() {
        return room;
    }
    public void setRoom(Integer room) {
        this.room = room;
    }
    public Double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String toString() {
        return price + ", " + name + ", " + eMail + ", " + room;
    }
}
