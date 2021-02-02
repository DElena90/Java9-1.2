package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private boolean canLikes;
    private boolean canPublish;

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

    public boolean getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(boolean canLikes) {
        this.canLikes = canLikes;
    }

    public boolean getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
