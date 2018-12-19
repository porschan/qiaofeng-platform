package com.chanchifeng.qiaofeng.model;

import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:26 2018/12/19
 * @modified By:
 */

public class CompletableContentModel extends ContentModel{
    private List<CommentModel> commentModelList; // the comment info list of this content


    public List<CommentModel> getCommentModelList() {
        return commentModelList;
    }

    public void setCommentModelList(List<CommentModel> commentModelList) {
        this.commentModelList = commentModelList;
    }

}
