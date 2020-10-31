package edu.cnm.deepdive.smartcheff.model.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import edu.cnm.deepdive.smartcheff.model.entity.User;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface UserDao {
  @Insert
  Single<Long> insert(User user);

  @Insert
  Single<List<Long>> insert(User...users);

  @Insert
  Single<List<Long>> insert(Collection<User> users);

  @Delete
  Single<Integer> delete(User user);

  @Delete
  Single<Integer> delete(User...users);

  @Delete
  Single<Integer>delete(Collection<User> users);

}
