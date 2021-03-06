package com.example.coderqiang.xmatch_android.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.coderqiang.xmatch_android.model.Department;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DEPARTMENT".
*/
public class DepartmentDao extends AbstractDao<Department, Long> {

    public static final String TABLENAME = "DEPARTMENT";

    /**
     * Properties of entity Department.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property DepartmentId = new Property(0, Long.class, "departmentId", true, "_id");
        public final static Property DepName = new Property(1, String.class, "depName", false, "DEP_NAME");
        public final static Property DepSummary = new Property(2, String.class, "depSummary", false, "DEP_SUMMARY");
        public final static Property MemberNum = new Property(3, int.class, "memberNum", false, "MEMBER_NUM");
        public final static Property ActivityNum = new Property(4, int.class, "activityNum", false, "ACTIVITY_NUM");
        public final static Property ChildDepNum = new Property(5, int.class, "childDepNum", false, "CHILD_DEP_NUM");
        public final static Property DepManagerId = new Property(6, long.class, "depManagerId", false, "DEP_MANAGER_ID");
        public final static Property CreatTime = new Property(7, long.class, "creatTime", false, "CREAT_TIME");
        public final static Property ImageUrl = new Property(8, String.class, "imageUrl", false, "IMAGE_URL");
        public final static Property EmergencyPhone = new Property(9, String.class, "emergencyPhone", false, "EMERGENCY_PHONE");
        public final static Property State = new Property(10, int.class, "state", false, "STATE");
    }


    public DepartmentDao(DaoConfig config) {
        super(config);
    }
    
    public DepartmentDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DEPARTMENT\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: departmentId
                "\"DEP_NAME\" TEXT," + // 1: depName
                "\"DEP_SUMMARY\" TEXT," + // 2: depSummary
                "\"MEMBER_NUM\" INTEGER NOT NULL ," + // 3: memberNum
                "\"ACTIVITY_NUM\" INTEGER NOT NULL ," + // 4: activityNum
                "\"CHILD_DEP_NUM\" INTEGER NOT NULL ," + // 5: childDepNum
                "\"DEP_MANAGER_ID\" INTEGER NOT NULL ," + // 6: depManagerId
                "\"CREAT_TIME\" INTEGER NOT NULL ," + // 7: creatTime
                "\"IMAGE_URL\" TEXT," + // 8: imageUrl
                "\"EMERGENCY_PHONE\" TEXT," + // 9: emergencyPhone
                "\"STATE\" INTEGER NOT NULL );"); // 10: state
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DEPARTMENT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Department entity) {
        stmt.clearBindings();
 
        Long departmentId = entity.getDepartmentId();
        if (departmentId != null) {
            stmt.bindLong(1, departmentId);
        }
 
        String depName = entity.getDepName();
        if (depName != null) {
            stmt.bindString(2, depName);
        }
 
        String depSummary = entity.getDepSummary();
        if (depSummary != null) {
            stmt.bindString(3, depSummary);
        }
        stmt.bindLong(4, entity.getMemberNum());
        stmt.bindLong(5, entity.getActivityNum());
        stmt.bindLong(6, entity.getChildDepNum());
        stmt.bindLong(7, entity.getDepManagerId());
        stmt.bindLong(8, entity.getCreatTime());
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(9, imageUrl);
        }
 
        String emergencyPhone = entity.getEmergencyPhone();
        if (emergencyPhone != null) {
            stmt.bindString(10, emergencyPhone);
        }
        stmt.bindLong(11, entity.getState());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Department entity) {
        stmt.clearBindings();
 
        Long departmentId = entity.getDepartmentId();
        if (departmentId != null) {
            stmt.bindLong(1, departmentId);
        }
 
        String depName = entity.getDepName();
        if (depName != null) {
            stmt.bindString(2, depName);
        }
 
        String depSummary = entity.getDepSummary();
        if (depSummary != null) {
            stmt.bindString(3, depSummary);
        }
        stmt.bindLong(4, entity.getMemberNum());
        stmt.bindLong(5, entity.getActivityNum());
        stmt.bindLong(6, entity.getChildDepNum());
        stmt.bindLong(7, entity.getDepManagerId());
        stmt.bindLong(8, entity.getCreatTime());
 
        String imageUrl = entity.getImageUrl();
        if (imageUrl != null) {
            stmt.bindString(9, imageUrl);
        }
 
        String emergencyPhone = entity.getEmergencyPhone();
        if (emergencyPhone != null) {
            stmt.bindString(10, emergencyPhone);
        }
        stmt.bindLong(11, entity.getState());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Department readEntity(Cursor cursor, int offset) {
        Department entity = new Department( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // departmentId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // depName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // depSummary
            cursor.getInt(offset + 3), // memberNum
            cursor.getInt(offset + 4), // activityNum
            cursor.getInt(offset + 5), // childDepNum
            cursor.getLong(offset + 6), // depManagerId
            cursor.getLong(offset + 7), // creatTime
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // imageUrl
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // emergencyPhone
            cursor.getInt(offset + 10) // state
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Department entity, int offset) {
        entity.setDepartmentId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDepName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDepSummary(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMemberNum(cursor.getInt(offset + 3));
        entity.setActivityNum(cursor.getInt(offset + 4));
        entity.setChildDepNum(cursor.getInt(offset + 5));
        entity.setDepManagerId(cursor.getLong(offset + 6));
        entity.setCreatTime(cursor.getLong(offset + 7));
        entity.setImageUrl(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setEmergencyPhone(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setState(cursor.getInt(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Department entity, long rowId) {
        entity.setDepartmentId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Department entity) {
        if(entity != null) {
            return entity.getDepartmentId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Department entity) {
        return entity.getDepartmentId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
