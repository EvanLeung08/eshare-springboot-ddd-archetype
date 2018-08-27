package com.eshare.infrastructure.repository;

import com.eshare.domain.model.user.User;
import com.eshare.domain.model.user.UserRepository;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

/**
 * 访问Mongo数据库的User存储实现类
 * Created by liangyh on 2018/8/19.
 * Email:10856214@163.com
 */
@Repository
public class UserMongoRepository implements UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public User findById(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query,User.class);
    }

    @Override
    public User findByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.findOne(query,User.class);
    }

    @Override
    public void save(User user) {
        mongoTemplate.save(user);
    }

    @Override
    public Long deleteUser(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        DeleteResult result= mongoTemplate.remove(query,User.class);
        return result.getDeletedCount();
    }

    @Override
    public boolean updateUser(User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("name",user.getName()).set("age",user.getAge());
        UpdateResult updateResult = mongoTemplate.updateFirst(query, update, User.class);
        return updateResult.isModifiedCountAvailable();
    }

}
