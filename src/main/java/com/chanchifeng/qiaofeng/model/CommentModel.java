package com.chanchifeng.qiaofeng.model;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:25 2018/12/19
 * @modified By:
 */

public class CommentModel {
    private int commentId; // the comment id
    private int authorId; // the author of this comment
    private int ofContentId; // the content id

    private String content; // the content of this comment

    /**
     * just test
     * @return s
     */
    public String toString() {
        return "CommentId:" + commentId + ",AuthorId:" + authorId + "," +
                "ofContent:" + ofContentId + ", Content:" + content;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getOfContentId() {
        return ofContentId;
    }

    public void setOfContentId(int ofContentId) {
        this.ofContentId = ofContentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
