package com.ohgiraffers.section01.xmlconfig;

import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.section01.xmlconfig.Template.getSession;

public class ItemService {

    public List<ItemDTO> selectAllItem() {

        SqlSession sqlSession = getSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        List<ItemDTO> itemList =itemMapper.selectAllItem();

        sqlSession.close();

        return itemList;
    }

    public ItemDTO selectItemById(int id) {

        SqlSession sqlSession = getSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        ItemDTO item = itemMapper.selectItemById(id);

        sqlSession.close();

        return item;
    }

    public boolean insertItem(ItemDTO item) {

        SqlSession sqlSession = getSession();

        ItemMapper itemMapper = sqlSession.getMapper(ItemMapper.class);

        int result = itemMapper.insertItem(item);

        if (result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        return result > 0 ? true : false;
    }
}
