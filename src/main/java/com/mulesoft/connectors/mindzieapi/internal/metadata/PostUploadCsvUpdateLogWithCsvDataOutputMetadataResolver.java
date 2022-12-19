package com.mulesoft.connectors.mindzieapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.output.JsonOutputMetadataResolver;
import com.mulesoft.connectors.mindzieapi.internal.extension.MindzieApi;

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
    return MindzieApi.API_METADATA_CATEGORY;
  }
}
