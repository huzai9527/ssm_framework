package dao;

import pojo.Moive;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface moivesMapper {
    public void addMoive(Moive moive) throws Exception;
    public List<Moive> queryall() throws Exception;
    public Moive selectById(int id) throws Exception;
}
