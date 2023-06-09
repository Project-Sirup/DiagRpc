package sirup.service.diag.rpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: sirup_diag.proto")
public final class SirupDiagnosticsServiceGrpc {

  private SirupDiagnosticsServiceGrpc() {}

  public static final String SERVICE_NAME = "diag.v1.SirupDiagnosticsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sirup.service.diag.rpc.proto.DiagnosticsRequest,
      sirup.service.diag.rpc.proto.DiagnosticsResponse> getRunDiagnosticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RunDiagnostics",
      requestType = sirup.service.diag.rpc.proto.DiagnosticsRequest.class,
      responseType = sirup.service.diag.rpc.proto.DiagnosticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sirup.service.diag.rpc.proto.DiagnosticsRequest,
      sirup.service.diag.rpc.proto.DiagnosticsResponse> getRunDiagnosticsMethod() {
    io.grpc.MethodDescriptor<sirup.service.diag.rpc.proto.DiagnosticsRequest, sirup.service.diag.rpc.proto.DiagnosticsResponse> getRunDiagnosticsMethod;
    if ((getRunDiagnosticsMethod = SirupDiagnosticsServiceGrpc.getRunDiagnosticsMethod) == null) {
      synchronized (SirupDiagnosticsServiceGrpc.class) {
        if ((getRunDiagnosticsMethod = SirupDiagnosticsServiceGrpc.getRunDiagnosticsMethod) == null) {
          SirupDiagnosticsServiceGrpc.getRunDiagnosticsMethod = getRunDiagnosticsMethod = 
              io.grpc.MethodDescriptor.<sirup.service.diag.rpc.proto.DiagnosticsRequest, sirup.service.diag.rpc.proto.DiagnosticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "diag.v1.SirupDiagnosticsService", "RunDiagnostics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.diag.rpc.proto.DiagnosticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sirup.service.diag.rpc.proto.DiagnosticsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SirupDiagnosticsServiceMethodDescriptorSupplier("RunDiagnostics"))
                  .build();
          }
        }
     }
     return getRunDiagnosticsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SirupDiagnosticsServiceStub newStub(io.grpc.Channel channel) {
    return new SirupDiagnosticsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SirupDiagnosticsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SirupDiagnosticsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SirupDiagnosticsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SirupDiagnosticsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SirupDiagnosticsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void runDiagnostics(sirup.service.diag.rpc.proto.DiagnosticsRequest request,
        io.grpc.stub.StreamObserver<sirup.service.diag.rpc.proto.DiagnosticsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRunDiagnosticsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRunDiagnosticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                sirup.service.diag.rpc.proto.DiagnosticsRequest,
                sirup.service.diag.rpc.proto.DiagnosticsResponse>(
                  this, METHODID_RUN_DIAGNOSTICS)))
          .build();
    }
  }

  /**
   */
  public static final class SirupDiagnosticsServiceStub extends io.grpc.stub.AbstractStub<SirupDiagnosticsServiceStub> {
    private SirupDiagnosticsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupDiagnosticsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupDiagnosticsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupDiagnosticsServiceStub(channel, callOptions);
    }

    /**
     */
    public void runDiagnostics(sirup.service.diag.rpc.proto.DiagnosticsRequest request,
        io.grpc.stub.StreamObserver<sirup.service.diag.rpc.proto.DiagnosticsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRunDiagnosticsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SirupDiagnosticsServiceBlockingStub extends io.grpc.stub.AbstractStub<SirupDiagnosticsServiceBlockingStub> {
    private SirupDiagnosticsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupDiagnosticsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupDiagnosticsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupDiagnosticsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sirup.service.diag.rpc.proto.DiagnosticsResponse runDiagnostics(sirup.service.diag.rpc.proto.DiagnosticsRequest request) {
      return blockingUnaryCall(
          getChannel(), getRunDiagnosticsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SirupDiagnosticsServiceFutureStub extends io.grpc.stub.AbstractStub<SirupDiagnosticsServiceFutureStub> {
    private SirupDiagnosticsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SirupDiagnosticsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SirupDiagnosticsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SirupDiagnosticsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sirup.service.diag.rpc.proto.DiagnosticsResponse> runDiagnostics(
        sirup.service.diag.rpc.proto.DiagnosticsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRunDiagnosticsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RUN_DIAGNOSTICS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SirupDiagnosticsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SirupDiagnosticsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RUN_DIAGNOSTICS:
          serviceImpl.runDiagnostics((sirup.service.diag.rpc.proto.DiagnosticsRequest) request,
              (io.grpc.stub.StreamObserver<sirup.service.diag.rpc.proto.DiagnosticsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SirupDiagnosticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SirupDiagnosticsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sirup.service.diag.rpc.proto.Diagnostics.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SirupDiagnosticsService");
    }
  }

  private static final class SirupDiagnosticsServiceFileDescriptorSupplier
      extends SirupDiagnosticsServiceBaseDescriptorSupplier {
    SirupDiagnosticsServiceFileDescriptorSupplier() {}
  }

  private static final class SirupDiagnosticsServiceMethodDescriptorSupplier
      extends SirupDiagnosticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SirupDiagnosticsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SirupDiagnosticsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SirupDiagnosticsServiceFileDescriptorSupplier())
              .addMethod(getRunDiagnosticsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
