package ru.social.media.web.userservice.service;

import io.grpc.stub.StreamObserver;
import ru.social.media.web.proto.user_service.*;

public class UserService extends UserServiceGrpc.UserServiceImplBase {
    @Override
    public void login(LoginRequest request, StreamObserver<User> responseObserver) {
        super.login(request, responseObserver);
    }

    @Override
    public void register(RegisterRequest request, StreamObserver<ru.social.media.web.proto.common_types.VoidMessage> responseObserver) {
        super.register(request, responseObserver);
    }

    @Override
    public void authenticate(StringMessage request, StreamObserver<User> responseObserver) {
        super.authenticate(request, responseObserver);
    }
}
