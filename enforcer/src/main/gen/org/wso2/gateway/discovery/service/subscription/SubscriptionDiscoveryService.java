// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/subscription/sds.proto

package org.wso2.gateway.discovery.service.subscription;

/**
 * <pre>
 * [#protodoc-title: SDS]
 * </pre>
 *
 * Protobuf service {@code discovery.service.subscription.SubscriptionDiscoveryService}
 */
public  abstract class SubscriptionDiscoveryService
    implements com.google.protobuf.Service {
  protected SubscriptionDiscoveryService() {}

  public interface Interface {
    /**
     * <code>rpc StreamSubscriptions(stream .envoy.service.discovery.v3.DiscoveryRequest) returns (stream .envoy.service.discovery.v3.DiscoveryResponse);</code>
     */
    public abstract void streamSubscriptions(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new SubscriptionDiscoveryService() {
      @java.lang.Override
      public  void streamSubscriptions(
          com.google.protobuf.RpcController controller,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
          com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
        impl.streamSubscriptions(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.streamSubscriptions(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc StreamSubscriptions(stream .envoy.service.discovery.v3.DiscoveryRequest) returns (stream .envoy.service.discovery.v3.DiscoveryResponse);</code>
   */
  public abstract void streamSubscriptions(
      com.google.protobuf.RpcController controller,
      io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
      com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return org.wso2.gateway.discovery.service.subscription.SdsProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.streamSubscriptions(controller, (io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest)request,
          com.google.protobuf.RpcUtil.<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends org.wso2.gateway.discovery.service.subscription.SubscriptionDiscoveryService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void streamSubscriptions(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request,
        com.google.protobuf.RpcCallback<io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.class,
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse streamSubscriptions(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse streamSubscriptions(
        com.google.protobuf.RpcController controller,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryRequest request)
        throws com.google.protobuf.ServiceException {
      return (io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        io.envoyproxy.envoy.service.discovery.v3.DiscoveryResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:discovery.service.subscription.SubscriptionDiscoveryService)
}

