package com.mulesoft.connectors.mindzieapi.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.mindzieapi.internal.config.MindzieApiConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Mindzie Api")
@Xml(prefix = "mindzie-api")
@Configurations({MindzieApiConfiguration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class MindzieApi {
  public static final String API_METADATA_CATEGORY = "Mindzie Api";
}
