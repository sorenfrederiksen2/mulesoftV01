package com.mulesoft.connectors.mindzieapi.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.StringInputMetadataResolver;
import com.mulesoft.connectors.mindzieapi.internal.extension.MindzieApi;

public class PostUploadCsvUpdateLogWithCsvDataInputMetadataResolver
    extends StringInputMetadataResolver {
  @Override
  public String getResolverName() {
    return "post-upload-csv-update-log-with-csv-data-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return MindzieApi.API_METADATA_CATEGORY;
  }
}
