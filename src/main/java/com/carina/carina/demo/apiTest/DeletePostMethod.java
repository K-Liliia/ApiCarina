package com.carina.carina.demo.apiTest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class DeletePostMethod extends AbstractApiMethodV2 {
    public DeletePostMethod() {
        super("api/test/posts/_delete/rq.json", "api/test/posts/_delete/rs.json", "api/test/posts/post.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
