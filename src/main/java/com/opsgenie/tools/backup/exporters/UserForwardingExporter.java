package com.opsgenie.tools.backup.exporters;

import com.opsgenie.oas.sdk.ApiException;
import com.opsgenie.oas.sdk.model.ForwardingRule;
import com.opsgenie.tools.backup.EntityListService;

import java.util.List;

public class UserForwardingExporter extends BaseExporter<ForwardingRule> {

    public UserForwardingExporter(String backupRootDirectory) {
        super(backupRootDirectory, "forwardings");
    }

    @Override
    protected String getEntityFileName(ForwardingRule forwardingRule) {
        return forwardingRule.getId();
    }

    @Override
    protected List<ForwardingRule> retrieveEntities() throws ApiException {
        return EntityListService.listForwardingRules();
    }
}
