package com.mulesoft.connectors.mindziemule4.internal.metadata;

import com.mulesoft.connectivity.rest.commons.api.datasense.metadata.input.StringInputMetadataResolver;
import com.mulesoft.connectors.mindziemule4.internal.extension.MindzieMule4;

public class PostUploadCsvUpdateLogWithCsvDataInputMetadataResolver
    extends StringInputMetadataResolver {
  @Override
  public String getResolverName() {
    return "post-upload-csv-update-log-with-csv-data-input-type-resolver";
  }

  @Override
  public String getCategoryName() {
    return MindzieMule4.API_METADATA_CATEGORY;
  }
}
