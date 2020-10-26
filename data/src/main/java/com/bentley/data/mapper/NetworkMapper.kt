package com.bentley.data.mapper

import com.bentley.data.model.Blog
import com.bentley.data.model.BlogNetworkEntity

class NetworkMapper : EntityMapper<BlogNetworkEntity, Blog> {

    companion object {
        val networkMapper = NetworkMapper()
    }

    override fun mapFromEntity(entity: BlogNetworkEntity): Blog {
        return Blog(
            id = entity.id,
            title = entity.title,
            body = entity.body,
            image = entity.image,
            category = entity.category
        )
    }

    override fun mapToEntity(domainModel: Blog): BlogNetworkEntity {
        return BlogNetworkEntity(
            id = domainModel.id,
            title = domainModel.title,
            body = domainModel.body,
            image = domainModel.image,
            category = domainModel.category
        )
    }


    fun mapFromEntityList(entities: List<BlogNetworkEntity>): List<Blog> {
        return entities.map { mapFromEntity(it) }
    }
}

fun provideNetworkMapper() = NetworkMapper.networkMapper