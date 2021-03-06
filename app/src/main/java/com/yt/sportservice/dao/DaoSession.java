package com.yt.sportservice.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.yt.sportservice.entity.StepHistory;
import com.yt.sportservice.entity.UploadDataEntity;

import com.yt.sportservice.dao.StepHistoryDao;
import com.yt.sportservice.dao.UploadDataEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig stepHistoryDaoConfig;
    private final DaoConfig uploadDataEntityDaoConfig;

    private final StepHistoryDao stepHistoryDao;
    private final UploadDataEntityDao uploadDataEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        stepHistoryDaoConfig = daoConfigMap.get(StepHistoryDao.class).clone();
        stepHistoryDaoConfig.initIdentityScope(type);

        uploadDataEntityDaoConfig = daoConfigMap.get(UploadDataEntityDao.class).clone();
        uploadDataEntityDaoConfig.initIdentityScope(type);

        stepHistoryDao = new StepHistoryDao(stepHistoryDaoConfig, this);
        uploadDataEntityDao = new UploadDataEntityDao(uploadDataEntityDaoConfig, this);

        registerDao(StepHistory.class, stepHistoryDao);
        registerDao(UploadDataEntity.class, uploadDataEntityDao);
    }
    
    public void clear() {
        stepHistoryDaoConfig.clearIdentityScope();
        uploadDataEntityDaoConfig.clearIdentityScope();
    }

    public StepHistoryDao getStepHistoryDao() {
        return stepHistoryDao;
    }

    public UploadDataEntityDao getUploadDataEntityDao() {
        return uploadDataEntityDao;
    }

}
