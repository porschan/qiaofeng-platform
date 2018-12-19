package com.chanchifeng.qiaofeng.model;

import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:25 2018/12/19
 * @modified By:
 */

public class CompletableAuthorModel extends AuthorModel{
    private List<AuthorModel> friendsCompletableInfo;
    private List<CompletableContentModel> contentModelList; // the content list of this author including the comments

    public List<AuthorModel> getFriendsCompletableInfo() {
        return friendsCompletableInfo;
    }

    public void setFriendsCompletableInfo(List<AuthorModel> friendsCompletableInfo) {
        this.friendsCompletableInfo = friendsCompletableInfo;
    }

    public List<CompletableContentModel> getContentModelList() {
        return contentModelList;
    }

    public void setContentModelList(List<CompletableContentModel> contentModelList) {
        this.contentModelList = contentModelList;
    }
}
