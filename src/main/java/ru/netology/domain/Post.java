package ru.netology.domain;

public class Post {
    private int id;
    private int date;
    private String text;
    private String imageUrl;
    private LikesInfo likesInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostInfo;
    private ViewsInfo viewsInfo;
    private int ownerId;
    private int fromId;
    private int createdId;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private PostType postType;
    private PostSource postSource;
    private Geo geo;
    private int singerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
}
