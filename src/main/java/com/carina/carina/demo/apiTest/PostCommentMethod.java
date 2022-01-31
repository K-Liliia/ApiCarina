package com.carina.carina.demo.apiTest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostCommentMethod extends AbstractApiMethodV2 {
    public PostCommentMethod () {
        super("api/test/comments/_post/rq.json", "api/test/comments/_post/rs.json", "api/test/comments/comment.properties");
        replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
    }
}
