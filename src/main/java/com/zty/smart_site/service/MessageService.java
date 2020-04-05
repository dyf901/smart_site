package com.zty.smart_site.service;

import com.zty.smart_site.dao.MessageDao;
import com.zty.smart_site.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MessageService implements MessageDao {
    @Autowired
    private MessageDao messageDao;

    @Override
    public int InsertMessage(Map map) {
        return messageDao.InsertMessage(map);
    }

    @Override
    public List<Message> FindMessage(Map map) {
        return messageDao.FindMessage(map);
    }

    @Override
    public long Total(Map map) {
        return messageDao.Total(map);
    }
}
