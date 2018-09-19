package com.whd.news.common;

/**
 * Created by xhbg on 2018/3/25.
 */
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Mapper
public interface IBaseMapper<T, ID extends Serializable> {
    int insert(T obj);

    List<T> selectAll(T obj);

    T selectOne(T obj);

    int update(T obj);

    int delete(T obj);

    int deleteByPK(ID obj);

    int deleteByPKs(Collection<ID> obj);

    int totalCount(T obj);
}