package ru.social.media.web.userservice;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import ru.social.media.web.proto.common_types.StringMessage;
import ru.social.media.web.proto.common_types.VoidMessage;
import ru.social.media.web.proto.user_service.LoginRequest;
import ru.social.media.web.proto.user_service.RegisterRequest;
import ru.social.media.web.proto.user_service.User;
import ru.social.media.web.proto.user_service.UserServiceGrpc;

@GrpcService
public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void login(LoginRequest request, StreamObserver<User> responseObserver) {
        super.login(request, responseObserver);
    }

    @Override
    public void register(RegisterRequest request, StreamObserver<User> responseObserver) {
        super.register(request, responseObserver);
    }

    @Override
    public void authenticate(StringMessage request, StreamObserver<User> responseObserver) {
        super.authenticate(request, responseObserver);
    }
}
