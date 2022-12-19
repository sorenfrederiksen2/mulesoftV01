package com.mulesoft.connectors.mindzieapi.internal.operation.refinement;

import com.mulesoft.connectors.mindzieapi.internal.operation.base.PostUploadCsvUpdateLogWithCsvDataOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class PostUploadCsvUpdateLogWithCsvDataOperationRefinement
    extends PostUploadCsvUpdateLogWithCsvDataOperationBase {
  public PostUploadCsvUpdateLogWithCsvDataOperationRefinement() {
    super();
  }

  public PostUploadCsvUpdateLogWithCsvDataOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
