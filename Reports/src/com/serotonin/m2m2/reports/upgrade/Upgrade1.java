package com.serotonin.m2m2.reports.upgrade;

import java.util.List;

import com.serotonin.m2m2.db.upgrade.DBUpgrade;
import com.serotonin.m2m2.reports.ReportDao;
import com.serotonin.m2m2.reports.vo.ReportVO;

/**
 * Upgrade Schema 1 to 2
 * @author Terry Packer
 *
 */
public class Upgrade1 extends DBUpgrade {
    @Override
    protected void upgrade() throws Exception {
    	runScript(new String[] { "alter table reports add xid varchar(50);" });
    	
    	//Now generate XIDs for all entries in the table
    	ReportDao dao = new ReportDao();
    	List<ReportVO> reports = dao.getReports();
    	for(ReportVO report : reports){
    		report.setXid(dao.generateUniqueXid());
    		dao.saveReport(report);
    	}
    	
    	//Alter the colum back to have no default
    	runScript(new String[] { "alter table reports alter column xid varchar(50) NOT NULL;" });
    }

    @Override
    protected String getNewSchemaVersion() {
        return "2";
    }
}
