package com.bentley.data.api;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkMapper_Factory implements Factory<NetworkMapper> {
  @Override
  public NetworkMapper get() {
    return newInstance();
  }

  public static NetworkMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkMapper newInstance() {
    return new NetworkMapper();
  }

  private static final class InstanceHolder {
    private static final NetworkMapper_Factory INSTANCE = new NetworkMapper_Factory();
  }
}
