package com.wanghuan.service.sys;

import java.util.List;

import com.wanghuan.model.sys.ReplyCardEntity;

public interface ReplyCardService {

//	public void insertEntity(PostCardEntity postCardEntity);
//
//	public PostCardEntity getPostcard(int id);

	public List<ReplyCardEntity> replycardList(int postcardid, int pageSize, int start);

	public Integer replycardSize(int postcardid, int pageSize, int start);

	public void insertEntity(ReplyCardEntity replyCardEntity);

}