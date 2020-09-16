package com.example.petagram.pojo;

public class ProfileItem {
    private int petPic;
    private String likes;

    public ProfileItem() {
    }

    public ProfileItem(int petPic, String likes) {
        this.petPic = petPic;
        this.likes = likes;
    }

    public int getPetPic() {
        return petPic;
    }

    public void setPetPic(int petPic) {
        this.petPic = petPic;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }
}
