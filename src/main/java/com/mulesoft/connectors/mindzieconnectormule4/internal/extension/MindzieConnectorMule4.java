package com.mulesoft.connectors.mindzieconnectormule4.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.mindzieconnectormule4.internal.config.MindzieConnectorMule4Configuration;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Mindzie Connector Mule4", category = Category.CERTIFIED)
@Xml(prefix = "mindzie-connector-mule-4")
@Configurations({MindzieConnectorMule4Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class MindzieConnectorMule4 {
  public static final String API_METADATA_CATEGORY = "mindzie Connector - Mule 4";
}
