package com.carina.carina.demo.apiTest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostPhotoMethod extends AbstractApiMethodV2 {
    public PostPhotoMethod() {
        super("api/test/photos/_post/rq.json", "api/test/photos/_post/rs.json", "api/test/photos/photos.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
