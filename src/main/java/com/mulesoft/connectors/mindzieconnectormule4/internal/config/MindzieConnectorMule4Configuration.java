package com.mulesoft.connectors.mindzieconnectormule4.internal.config;

import com.mulesoft.connectors.mindzieconnectormule4.internal.config.refinement.MindzieConnectorMule4ConfigurationRefinement;
import com.mulesoft.connectors.mindzieconnectormule4.internal.connection.provider.BasicConnectionProvider;
import com.mulesoft.connectors.mindzieconnectormule4.internal.operation.PostUploadCsvUpdateLogWithCsvDataOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({PostUploadCsvUpdateLogWithCsvDataOperation.class})
@ConnectionProviders({BasicConnectionProvider.class})
public class MindzieConnectorMule4Configuration
    extends MindzieConnectorMule4ConfigurationRefinement {}
