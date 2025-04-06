package com.cromxt.storageserver.auth.derived;

import com.cromxt.storageserver.auth.BucketAuthorizationBase;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"local","local-docker","local-docker-dev"})
@Service
public class LocalBucketAuthorizationBase implements BucketAuthorizationBase {
    @Override
    public boolean isRequestAuthorized(String secret) {
        return secret.equals("long-client-secret");
    }

    @Override
    public String extractClientId(String secret) {
        return "local-client";
    }

}
