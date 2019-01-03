package com.example;

import com.example.model.MyModel
import org.mapstruct.Mapper

@Mapper
interface MyMapper {

    fun map(from: InternalModel): MyModel
}
