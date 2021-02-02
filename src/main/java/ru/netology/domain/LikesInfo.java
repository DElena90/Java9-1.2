package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private int canLikes;
    private int canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(int canLikes) {
        this.canLikes = canLikes;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
