/*
    Copyright (C) 2014 Infinite Automation Systems Inc. All rights reserved.
    @author Matthew Lohbihler
 */
package com.serotonin.m2m2.scheduledEvents;

import java.util.List;

import com.serotonin.db.spring.ExtendedJdbcTemplate;
import com.serotonin.m2m2.Common;
import com.serotonin.m2m2.module.DatabaseSchemaDefinition;

public class ScheduledEventsSchemaDefinition extends DatabaseSchemaDefinition {
    @Override
    public void newInstallationCheck(ExtendedJdbcTemplate ejt) {
        if (!Common.databaseProxy.tableExists(ejt, "scheduledEvents")) {
            String path = Common.M2M2_HOME + getModule().getDirectoryPath() + "/web/db/createTables-"
                    + Common.databaseProxy.getType().name() + ".sql";
            Common.databaseProxy.runScriptFile(path, null);
        }
    }

    @Override
    public void addConversionTableNames(List<String> tableNames) {
        tableNames.add("scheduledEvents");
    }

    @Override
    public String getUpgradePackage() {
        return "com.serotonin.m2m2.scheduledEvents.upgrade";
    }

    @Override
    public int getDatabaseSchemaVersion() {
        return 1;
    }

    @Override
    public void uninstall() {
        String path = Common.M2M2_HOME + getModule().getDirectoryPath() + "/web/db/uninstall.sql";
        Common.databaseProxy.runScriptFile(path, null);
    }
}
