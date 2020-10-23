package edu.cnm.deepdive.smartcheff.model.entity.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "user_id")
  private Long id;

  @ColumnInfo(name = "oauth_key")
  private String oauthKey;

}
