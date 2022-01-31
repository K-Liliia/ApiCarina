package com.carina.carina.demo;

import com.carina.carina.demo.apiTest.*;
import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class APITaskLK implements IAbstractTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test()
    @MethodOwner(owner = "lkozachuk")
    public void testCreatePhoto() {
        LOGGER.info("test create a photo");
        PostPhotoMethod postPhoto = new PostPhotoMethod();
        postPhoto.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postPhoto.callAPI();
        postPhoto.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "lkozachuk")
    public void testPutPhoto() {
        LOGGER.info("--------------------------- incorrect http response 401 instead of 200");
        LOGGER.info("test update photo info");
        PutPhotoMethod putPhoto = new PutPhotoMethod();
        putPhoto.expectResponseStatus(HttpResponseStatusType.OK_200);
        putPhoto.callAPI();
        putPhoto.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "lkozachuk")
    public void testDeletePost() {
        LOGGER.info("test delete post");
        DeletePostMethod deletePost = new DeletePostMethod();
        deletePost.expectResponseStatus(HttpResponseStatusType.OK_200);
        deletePost.callAPI();
        deletePost.validateResponse();
    }

    @Test()
    @MethodOwner(owner = "lkozachuk")
    public void testGetPosts() {
        LOGGER.info("test get all posts");
        GetPostMethod getPost = new GetPostMethod();
        getPost.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPost.callAPI();
        getPost.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
        getPost.validateResponseAgainstSchema("api/test/posts/_get/rs.schema");
    }

    @Test()
    @MethodOwner(owner = "lkozachuk")
    public void testGetPost() {
        LOGGER.info("test get post");
        GetPostMethod getPost = new GetPostMethod();
        getPost.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPost.callAPI();
        getPost.validateResponse(JSONCompareMode.STRICT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }
}


















