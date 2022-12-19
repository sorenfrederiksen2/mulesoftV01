package com.mulesoft.connectors.mindzieapi.internal.config;

import com.mulesoft.connectors.mindzieapi.internal.config.refinement.MindzieApiConfigurationRefinement;
import com.mulesoft.connectors.mindzieapi.internal.connection.provider.BasicConnectionProvider;
import com.mulesoft.connectors.mindzieapi.internal.operation.PostUploadCsvUpdateLogWithCsvDataOperation;
import org.mule.runtime.extension.api.annotation.Configuration;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Configuration
@Operations({PostUploadCsvUpdateLogWithCsvDataOperation.class})
@ConnectionProviders({BasicConnectionProvider.class})
public class MindzieApiConfiguration extends MindzieApiConfigurationRefinement {}
