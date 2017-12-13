package com.example.coderqiang.xmatch_android.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.coderqiang.xmatch_android.model.ActivityApply;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "ACTIVITY_APPLY".
*/
public class ActivityApplyDao extends AbstractDao<ActivityApply, Long> {

    public static final String TABLENAME = "ACTIVITY_APPLY";

    /**
     * Properties of entity ActivityApply.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ActivityApplyId = new Property(0, Long.class, "activityApplyId", true, "_id");
        public final static Property ActivityId = new Property(1, Long.class, "activityId", false, "ACTIVITY_ID");
        public final static Property UserId = new Property(2, Long.class, "userId", false, "USER_ID");
        public final static Property UserName = new Property(3, String.class, "userName", false, "USER_NAME");
        public final static Property State = new Property(4, int.class, "state", false, "STATE");
        public final static Property ApplyTime = new Property(5, long.class, "applyTime", false, "APPLY_TIME");
        public final static Property SignInTime = new Property(6, long.class, "signInTime", false, "SIGN_IN_TIME");
        public final static Property Lon = new Property(7, double.class, "lon", false, "LON");
        public final static Property Lat = new Property(8, double.class, "lat", false, "LAT");
        public final static Property Distance = new Property(9, double.class, "distance", false, "DISTANCE");
    }


    public ActivityApplyDao(DaoConfig config) {
        super(config);
    }
    
    public ActivityApplyDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"ACTIVITY_APPLY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: activityApplyId
                "\"ACTIVITY_ID\" INTEGER," + // 1: activityId
                "\"USER_ID\" INTEGER," + // 2: userId
                "\"USER_NAME\" TEXT," + // 3: userName
                "\"STATE\" INTEGER NOT NULL ," + // 4: state
                "\"APPLY_TIME\" INTEGER NOT NULL ," + // 5: applyTime
                "\"SIGN_IN_TIME\" INTEGER NOT NULL ," + // 6: signInTime
                "\"LON\" REAL NOT NULL ," + // 7: lon
                "\"LAT\" REAL NOT NULL ," + // 8: lat
                "\"DISTANCE\" REAL NOT NULL );"); // 9: distance
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"ACTIVITY_APPLY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ActivityApply entity) {
        stmt.clearBindings();
 
        Long activityApplyId = entity.getActivityApplyId();
        if (activityApplyId != null) {
            stmt.bindLong(1, activityApplyId);
        }
 
        Long activityId = entity.getActivityId();
        if (activityId != null) {
            stmt.bindLong(2, activityId);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(3, userId);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(4, userName);
        }
        stmt.bindLong(5, entity.getState());
        stmt.bindLong(6, entity.getApplyTime());
        stmt.bindLong(7, entity.getSignInTime());
        stmt.bindDouble(8, entity.getLon());
        stmt.bindDouble(9, entity.getLat());
        stmt.bindDouble(10, entity.getDistance());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ActivityApply entity) {
        stmt.clearBindings();
 
        Long activityApplyId = entity.getActivityApplyId();
        if (activityApplyId != null) {
            stmt.bindLong(1, activityApplyId);
        }
 
        Long activityId = entity.getActivityId();
        if (activityId != null) {
            stmt.bindLong(2, activityId);
        }
 
        Long userId = entity.getUserId();
        if (userId != null) {
            stmt.bindLong(3, userId);
        }
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(4, userName);
        }
        stmt.bindLong(5, entity.getState());
        stmt.bindLong(6, entity.getApplyTime());
        stmt.bindLong(7, entity.getSignInTime());
        stmt.bindDouble(8, entity.getLon());
        stmt.bindDouble(9, entity.getLat());
        stmt.bindDouble(10, entity.getDistance());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public ActivityApply readEntity(Cursor cursor, int offset) {
        ActivityApply entity = new ActivityApply( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // activityApplyId
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // activityId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // userId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userName
            cursor.getInt(offset + 4), // state
            cursor.getLong(offset + 5), // applyTime
            cursor.getLong(offset + 6), // signInTime
            cursor.getDouble(offset + 7), // lon
            cursor.getDouble(offset + 8), // lat
            cursor.getDouble(offset + 9) // distance
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ActivityApply entity, int offset) {
        entity.setActivityApplyId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setActivityId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setUserId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setUserName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setState(cursor.getInt(offset + 4));
        entity.setApplyTime(cursor.getLong(offset + 5));
        entity.setSignInTime(cursor.getLong(offset + 6));
        entity.setLon(cursor.getDouble(offset + 7));
        entity.setLat(cursor.getDouble(offset + 8));
        entity.setDistance(cursor.getDouble(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(ActivityApply entity, long rowId) {
        entity.setActivityApplyId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(ActivityApply entity) {
        if(entity != null) {
            return entity.getActivityApplyId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ActivityApply entity) {
        return entity.getActivityApplyId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
