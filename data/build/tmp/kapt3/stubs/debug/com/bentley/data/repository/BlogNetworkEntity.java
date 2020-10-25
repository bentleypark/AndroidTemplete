package com.bentley.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/bentley/data/repository/BlogNetworkEntity;", "", "id", "", "title", "", "body", "image", "category", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getCategory", "setCategory", "getId", "()I", "setId", "(I)V", "getImage", "setImage", "getTitle", "setTitle", "data_debug"})
public final class BlogNetworkEntity {
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "pk")
    private int id;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "title")
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "body")
    private java.lang.String body;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "image")
    private java.lang.String image;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "category")
    private java.lang.String category;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final void setCategory(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public BlogNetworkEntity(int id, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.lang.String image, @org.jetbrains.annotations.NotNull
    java.lang.String category) {
        super();
    }
}