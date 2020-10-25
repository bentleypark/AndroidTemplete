package com.bentley.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/bentley/data/api/EntityMapper;", "Entity", "DomainModel", "", "mapFromEntity", "entity", "(Ljava/lang/Object;)Ljava/lang/Object;", "mapToEntity", "domainModel", "data_debug"})
public abstract interface EntityMapper<Entity extends java.lang.Object, DomainModel extends java.lang.Object> {
    
    public abstract DomainModel mapFromEntity(Entity entity);
    
    public abstract Entity mapToEntity(DomainModel domainModel);
}