package com.bentley.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/bentley/data/repository/MainRepository;", "", "apiService", "Lcom/bentley/data/api/ApiService;", "networkMapper", "Lcom/bentley/data/api/NetworkMapper;", "(Lcom/bentley/data/api/ApiService;Lcom/bentley/data/api/NetworkMapper;)V", "getBlogs", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bentley/data/state/DataState;", "", "Lcom/bentley/data/model/Blog;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class MainRepository {
    private final com.bentley.data.api.ApiService apiService = null;
    private final com.bentley.data.api.NetworkMapper networkMapper = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getBlogs(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.bentley.data.state.DataState<? extends java.util.List<com.bentley.data.model.Blog>>>> p0) {
        return null;
    }
    
    public MainRepository(@org.jetbrains.annotations.NotNull
    com.bentley.data.api.ApiService apiService, @org.jetbrains.annotations.NotNull
    com.bentley.data.api.NetworkMapper networkMapper) {
        super();
    }
}