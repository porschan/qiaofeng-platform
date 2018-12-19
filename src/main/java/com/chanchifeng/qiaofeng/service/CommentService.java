package com.chanchifeng.qiaofeng.service;

import com.chanchifeng.qiaofeng.DataMocker;
import com.chanchifeng.qiaofeng.model.CommentModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:porschan
 * @description:
 * @date: Created in 12:28 2018/12/19
 * @modified By:
 */
@Service
public class CommentService {
    private static final List<CommentModel> commentModelList = DataMocker.DataHolder.commentModelList;

    public CommentModel getCommentByCommentId(int commentId) {
        CommentModel commentModel = null;

        for (CommentModel model : commentModelList) {
            if (model.getCommentId() == commentId) {
                commentModel = model;
                break;
            }
        }

        if (commentModel == null) {
            commentModel = new CommentModel();
            commentModel.setCommentId(-1);
        }

        return commentModel;
    }
}
