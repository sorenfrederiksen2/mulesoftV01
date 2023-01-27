package com.mulesoft.connectors.mindzieconnectormule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.mindzieconnectormule4.internal.extension.MindzieConnectorMule4;

public class PostUploadCsvUpdateLogWithCsvDataOutputMetadataResolver
    extends JsonOutputMetadataResolver {
  @Override
  public String getSchemaPath() {
    return "/rest_sdk_generated_schemas/post-upload-csv-update-log-with-csv-data-output-schema.json";
  }

  @Override
  public String getResolverName() {
    return "post-upload-csv-update-log-with-csv-data-output-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return MindzieConnectorMule4.API_METADATA_CATEGORY;
  }
}
