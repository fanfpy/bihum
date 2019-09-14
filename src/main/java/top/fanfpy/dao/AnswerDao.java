package top.fanfpy.dao;


import com.blade.ioc.annotation.Bean;
import top.fanfpy.core.BaseDao;
import top.fanfpy.model.Answer;

import java.util.List;

import static io.github.biezhi.anima.Anima.select;

@Bean
public class AnswerDao extends BaseDao<Answer> {

    public Answer findByQidOrderByUpTopOne(Long qid){
        return select().from(Answer.class).where("qid",qid).order("up desc").one();
    }


    public List<Answer> finByIdAndQid(Long qid,Long id){
        return  select().from(Answer.class).where("id",id).where("qid",qid).all();
    }
}
