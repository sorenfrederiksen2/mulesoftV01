package com.mulesoft.connectors.mindziemule4.internal.config;

import com.mulesoft.connectors.mindziemule4.internal.config.refinement.MindzieMule4ConfigurationRefinement;
import com.mulesoft.connectors.mindziemule4.internal.connection.provider.BasicConnectionProvider;
import com.mulesoft.connectors.mindziemule4.internal.operation.PostUploadCsvUpdateLogWithCsvDataOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({PostUploadCsvUpdateLogWithCsvDataOperation.class})
@ConnectionProviders({BasicConnectionProvider.class})
public class MindzieMule4Configuration extends MindzieMule4ConfigurationRefinement {}
