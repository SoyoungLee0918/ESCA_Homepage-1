package com.esca.escahp.service;

import com.esca.escahp.dto.FreeBoardDto;
import com.esca.escahp.mapper.FreeBoardDao;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class FreeBoardService implements I_FreeBoardService {

    private final FreeBoardDao freeBoardDao;

    public FreeBoardService(FreeBoardDao freeBoardDao) {
        this.freeBoardDao = freeBoardDao;
    }

    @Override
    public FreeBoardDto getArticle(long no) {
        return freeBoardDao.select(no);
    }

    @Override
    public List<FreeBoardDto> getArticles() {
        return freeBoardDao.selectAll();
    }

    @Override
    public long writeArticle(FreeBoardDto dto) {
        return freeBoardDao.insert(dto);
    }

    @Override
    public long modifyArticle(FreeBoardDto dto) {
        return freeBoardDao.update(dto);
    }

    @Override
    public long deleteArticle(long no) {
        return freeBoardDao.delete(no);
    }
}
