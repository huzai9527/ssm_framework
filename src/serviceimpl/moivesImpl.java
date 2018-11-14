package serviceimpl;

import dao.moivesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Moive;

import java.util.List;

public class moivesImpl implements moivesMapper {
    @Autowired
    private moivesMapper moivesMapper;
    @Override
    public void addMoive(Moive moive) throws Exception {
        moivesMapper.addMoive(moive);
    }

    @Override
    public List<Moive> queryall() throws Exception {
        return moivesMapper.queryall();
    }

    @Override
    public Moive selectById(int id) throws Exception {
        return moivesMapper.selectById(id);
    }
}
