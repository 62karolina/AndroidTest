package com.sss.carolina.kyrsovaya.database;

/**
 * Created by carolina on 14.03.17.
 */

public class AndroidDBSchema {
    public static final class UsersTable{
        public static final String UserTable = "Users";
        public static final String scoreTable = "Score";

        public static final class Cols{
            public static final String id_user = "id";
            public static final String name = "name";
            public static final String status_u = "status";
        }

        public static final class ColsScore{
            public static final String id_score = "id_sc";
            public static final String score = "score";
            public static final String userId = "id_user";
        }


    }
}