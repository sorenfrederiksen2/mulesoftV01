package com.mulesoft.connectors.mindziemule4.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.mindziemule4.internal.config.MindzieMule4Configuration;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Mindzie Mule4", category = Category.CERTIFIED)
@Xml(prefix = "mindzie-mule-4")
@Configurations({MindzieMule4Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class MindzieMule4 {
  public static final String API_METADATA_CATEGORY = "Mindzie - Mule 4";
}
