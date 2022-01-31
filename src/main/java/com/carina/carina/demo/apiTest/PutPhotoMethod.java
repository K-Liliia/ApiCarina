package com.carina.carina.demo.apiTest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PutPhotoMethod extends AbstractApiMethodV2 {
    public PutPhotoMethod() {
        super("api/test/photos/_put/rq.json", "api/test/photos/_put/rs.json", "api/test/photos/photos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
