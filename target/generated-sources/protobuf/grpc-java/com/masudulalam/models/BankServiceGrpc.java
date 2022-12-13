package com.masudulalam.models;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: bank-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.masudulalam.models.BalanceRequest,
      com.masudulalam.models.Balance> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = com.masudulalam.models.BalanceRequest.class,
      responseType = com.masudulalam.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.masudulalam.models.BalanceRequest,
      com.masudulalam.models.Balance> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.masudulalam.models.BalanceRequest, com.masudulalam.models.Balance> getGetBalanceMethod;
    if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBalanceMethod = BankServiceGrpc.getGetBalanceMethod) == null) {
          BankServiceGrpc.getGetBalanceMethod = getGetBalanceMethod =
              io.grpc.MethodDescriptor.<com.masudulalam.models.BalanceRequest, com.masudulalam.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getBalance"))
              .build();
        }
      }
    }
    return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.masudulalam.models.DepositRequest,
      com.masudulalam.models.Balance> getAddBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBalance",
      requestType = com.masudulalam.models.DepositRequest.class,
      responseType = com.masudulalam.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.masudulalam.models.DepositRequest,
      com.masudulalam.models.Balance> getAddBalanceMethod() {
    io.grpc.MethodDescriptor<com.masudulalam.models.DepositRequest, com.masudulalam.models.Balance> getAddBalanceMethod;
    if ((getAddBalanceMethod = BankServiceGrpc.getAddBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getAddBalanceMethod = BankServiceGrpc.getAddBalanceMethod) == null) {
          BankServiceGrpc.getAddBalanceMethod = getAddBalanceMethod =
              io.grpc.MethodDescriptor.<com.masudulalam.models.DepositRequest, com.masudulalam.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("addBalance"))
              .build();
        }
      }
    }
    return getAddBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.masudulalam.models.WithdrawRequest,
      com.masudulalam.models.Balance> getDeductBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deductBalance",
      requestType = com.masudulalam.models.WithdrawRequest.class,
      responseType = com.masudulalam.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.masudulalam.models.WithdrawRequest,
      com.masudulalam.models.Balance> getDeductBalanceMethod() {
    io.grpc.MethodDescriptor<com.masudulalam.models.WithdrawRequest, com.masudulalam.models.Balance> getDeductBalanceMethod;
    if ((getDeductBalanceMethod = BankServiceGrpc.getDeductBalanceMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDeductBalanceMethod = BankServiceGrpc.getDeductBalanceMethod) == null) {
          BankServiceGrpc.getDeductBalanceMethod = getDeductBalanceMethod =
              io.grpc.MethodDescriptor.<com.masudulalam.models.WithdrawRequest, com.masudulalam.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deductBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("deductBalance"))
              .build();
        }
      }
    }
    return getDeductBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.masudulalam.models.WithdrawRequest,
      com.masudulalam.models.Money> getGetMoneyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMoneyStream",
      requestType = com.masudulalam.models.WithdrawRequest.class,
      responseType = com.masudulalam.models.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.masudulalam.models.WithdrawRequest,
      com.masudulalam.models.Money> getGetMoneyStreamMethod() {
    io.grpc.MethodDescriptor<com.masudulalam.models.WithdrawRequest, com.masudulalam.models.Money> getGetMoneyStreamMethod;
    if ((getGetMoneyStreamMethod = BankServiceGrpc.getGetMoneyStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetMoneyStreamMethod = BankServiceGrpc.getGetMoneyStreamMethod) == null) {
          BankServiceGrpc.getGetMoneyStreamMethod = getGetMoneyStreamMethod =
              io.grpc.MethodDescriptor.<com.masudulalam.models.WithdrawRequest, com.masudulalam.models.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMoneyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.Money.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("getMoneyStream"))
              .build();
        }
      }
    }
    return getGetMoneyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.masudulalam.models.DepositRequest,
      com.masudulalam.models.Balance> getAddBalanceStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addBalanceStream",
      requestType = com.masudulalam.models.DepositRequest.class,
      responseType = com.masudulalam.models.Balance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.masudulalam.models.DepositRequest,
      com.masudulalam.models.Balance> getAddBalanceStreamMethod() {
    io.grpc.MethodDescriptor<com.masudulalam.models.DepositRequest, com.masudulalam.models.Balance> getAddBalanceStreamMethod;
    if ((getAddBalanceStreamMethod = BankServiceGrpc.getAddBalanceStreamMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getAddBalanceStreamMethod = BankServiceGrpc.getAddBalanceStreamMethod) == null) {
          BankServiceGrpc.getAddBalanceStreamMethod = getAddBalanceStreamMethod =
              io.grpc.MethodDescriptor.<com.masudulalam.models.DepositRequest, com.masudulalam.models.Balance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addBalanceStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.masudulalam.models.Balance.getDefaultInstance()))
              .setSchemaDescriptor(new BankServiceMethodDescriptorSupplier("addBalanceStream"))
              .build();
        }
      }
    }
    return getAddBalanceStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceStub>() {
        @java.lang.Override
        public BankServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceStub(channel, callOptions);
        }
      };
    return BankServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceBlockingStub>() {
        @java.lang.Override
        public BankServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceBlockingStub(channel, callOptions);
        }
      };
    return BankServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankServiceFutureStub>() {
        @java.lang.Override
        public BankServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankServiceFutureStub(channel, callOptions);
        }
      };
    return BankServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getBalance(com.masudulalam.models.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void addBalance(com.masudulalam.models.DepositRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddBalanceMethod(), responseObserver);
    }

    /**
     */
    public void deductBalance(com.masudulalam.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeductBalanceMethod(), responseObserver);
    }

    /**
     * <pre>
     *server side streaming
     * </pre>
     */
    public void getMoneyStream(com.masudulalam.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Money> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoneyStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.masudulalam.models.DepositRequest> addBalanceStream(
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAddBalanceStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.masudulalam.models.BalanceRequest,
                com.masudulalam.models.Balance>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getAddBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.masudulalam.models.DepositRequest,
                com.masudulalam.models.Balance>(
                  this, METHODID_ADD_BALANCE)))
          .addMethod(
            getDeductBalanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.masudulalam.models.WithdrawRequest,
                com.masudulalam.models.Balance>(
                  this, METHODID_DEDUCT_BALANCE)))
          .addMethod(
            getGetMoneyStreamMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.masudulalam.models.WithdrawRequest,
                com.masudulalam.models.Money>(
                  this, METHODID_GET_MONEY_STREAM)))
          .addMethod(
            getAddBalanceStreamMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.masudulalam.models.DepositRequest,
                com.masudulalam.models.Balance>(
                  this, METHODID_ADD_BALANCE_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractAsyncStub<BankServiceStub> {
    private BankServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void getBalance(com.masudulalam.models.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addBalance(com.masudulalam.models.DepositRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deductBalance(com.masudulalam.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeductBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server side streaming
     * </pre>
     */
    public void getMoneyStream(com.masudulalam.models.WithdrawRequest request,
        io.grpc.stub.StreamObserver<com.masudulalam.models.Money> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMoneyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.masudulalam.models.DepositRequest> addBalanceStream(
        io.grpc.stub.StreamObserver<com.masudulalam.models.Balance> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAddBalanceStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.masudulalam.models.Balance getBalance(com.masudulalam.models.BalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.masudulalam.models.Balance addBalance(com.masudulalam.models.DepositRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.masudulalam.models.Balance deductBalance(com.masudulalam.models.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeductBalanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server side streaming
     * </pre>
     */
    public java.util.Iterator<com.masudulalam.models.Money> getMoneyStream(
        com.masudulalam.models.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMoneyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BankServiceFutureStub> {
    private BankServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.masudulalam.models.Balance> getBalance(
        com.masudulalam.models.BalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.masudulalam.models.Balance> addBalance(
        com.masudulalam.models.DepositRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.masudulalam.models.Balance> deductBalance(
        com.masudulalam.models.WithdrawRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeductBalanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BALANCE = 0;
  private static final int METHODID_ADD_BALANCE = 1;
  private static final int METHODID_DEDUCT_BALANCE = 2;
  private static final int METHODID_GET_MONEY_STREAM = 3;
  private static final int METHODID_ADD_BALANCE_STREAM = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.masudulalam.models.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.masudulalam.models.Balance>) responseObserver);
          break;
        case METHODID_ADD_BALANCE:
          serviceImpl.addBalance((com.masudulalam.models.DepositRequest) request,
              (io.grpc.stub.StreamObserver<com.masudulalam.models.Balance>) responseObserver);
          break;
        case METHODID_DEDUCT_BALANCE:
          serviceImpl.deductBalance((com.masudulalam.models.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.masudulalam.models.Balance>) responseObserver);
          break;
        case METHODID_GET_MONEY_STREAM:
          serviceImpl.getMoneyStream((com.masudulalam.models.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<com.masudulalam.models.Money>) responseObserver);
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
        case METHODID_ADD_BALANCE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.addBalanceStream(
              (io.grpc.stub.StreamObserver<com.masudulalam.models.Balance>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.masudulalam.models.BankServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankService");
    }
  }

  private static final class BankServiceFileDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier {
    BankServiceFileDescriptorSupplier() {}
  }

  private static final class BankServiceMethodDescriptorSupplier
      extends BankServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankServiceFileDescriptorSupplier())
              .addMethod(getGetBalanceMethod())
              .addMethod(getAddBalanceMethod())
              .addMethod(getDeductBalanceMethod())
              .addMethod(getGetMoneyStreamMethod())
              .addMethod(getAddBalanceStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
