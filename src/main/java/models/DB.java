package models;

import org.sql2o.Sql2o;

public class DB {
        public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/ntiko","diana","diana@123");
//    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-35-168-194-15.compute-1.amazonaws.com:5432/dciila8rs0i5a3", "rgshxiotqhtjxx","cece8f2c42c8db81340f42fa828744c6571a4a1855fc097f5b7a5bc44f173722");
}